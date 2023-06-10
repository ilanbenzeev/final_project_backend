package com.example.finalproject.controller;

import com.example.finalproject.repo.Citizen;
import com.example.finalproject.repo.CitizenRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Citizen")
public class CitizenController {

    private final CitizenRepository citizenRepository;

    public CitizenController(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    @GetMapping
    public List<Citizen> getCitizens() {
        return citizenRepository.findAll();
    }

    @PostMapping("/add-citizen")
    public ResponseEntity createClient(@RequestBody Citizen citizen) throws URISyntaxException {
        Citizen savedCitizen = citizenRepository.save(citizen);
        return ResponseEntity.created(new URI("/Citizen/add-citizen" + savedCitizen.getId())).body(savedCitizen);
    }

    @GetMapping("/get-citizens-by-dates")
    public List<Citizen> getAllByDates(@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate) {
       return citizenRepository.findByDateRange(fromDate, toDate);
    }

    @GetMapping("/get-citizens-by-city")
    public List<Citizen> getAllByDates(@RequestParam("city") String city) {
        return citizenRepository.findAllByCity(city);
    }

}

