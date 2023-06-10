package com.example.finalproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen, Long> {


    @Query(value="SELECT * FROM citizen WHERE date_of_birth BETWEEN :f and :t", nativeQuery = true)
    List<Citizen> findByDateRange(@Param("f") String f, @Param("t") String t);

    List<Citizen> findAllByCity(String city);
};
