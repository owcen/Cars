package org.example.cars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private Integer id;
    private String registrationNumber;
    private LocalDate registrationDate;
    private LocalDate expirationDate;

    public Registration() {
    }

    public Registration(String registrationNumber, LocalDate registrationDate, LocalDate expirationDate) {
        this.registrationNumber = registrationNumber;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
