package com.example.finalproject.repo;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
@Table(name = "Citizen")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String city;
    private String zipCode;
    private String landLine;
    private String cellularPhone;
    private Boolean infectedByCovid19;
    private Boolean diabetes;
    private Boolean cardioVascularProblems;
    private Boolean allergies;
    private String other;

    public Citizen(Long id, String firstName, Date dateOfBirth, String lastName, String address, String city, String zipCode,
                   String landLine, String cellularPhone, Boolean infectedByCovid19, Boolean diabetes,
                   Boolean cardioVascularProblems, Boolean allergies, String other) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.landLine = landLine;
        this.cellularPhone = cellularPhone;
        this.infectedByCovid19 = infectedByCovid19;
        this.diabetes = diabetes;
        this.cardioVascularProblems = cardioVascularProblems;
        this.allergies = allergies;
        this.other = other;
    }

    @Autowired
    public Citizen() {

    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getLandLine() {
        return landLine;
    }
    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }
    public String getCellularPhone() {
        return cellularPhone;
    }
    public void setCellularPhone(String cellularPhone) {
        this.cellularPhone = cellularPhone;
    }
    public Boolean getInfectedByCovid19() {
        return infectedByCovid19;
    }
    public void setInfectedByCovid19(Boolean infectedByCovid19) {
        this.infectedByCovid19 = infectedByCovid19;
    }
    public Boolean getDiabetes() {
        return diabetes;
    }
    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }
    public Boolean getCardioVascularProblems() {
        return cardioVascularProblems;
    }
    public void setCardioVascularProblems(Boolean cardioVascularProblems) {
        this.cardioVascularProblems = cardioVascularProblems;
    }
    public Boolean getAllergies() {
        return allergies;
    }
    public void setAllergies(Boolean allergies) {
        this.allergies = allergies;
    }
    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }

    public Long getId() {
        return id;
    }
}
