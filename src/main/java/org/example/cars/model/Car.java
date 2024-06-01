package org.example.cars.model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String model;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registration_id", referencedColumnName = "id")
    private Registration registrationId;

    public Car() {
    }

    public Car(String brand, String model, Registration registrationId) {
        this.brand = brand;
        this.model = model;
        this.registrationId = registrationId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRegistrationNumber(Registration registrationId) {
        this.registrationId = registrationId;
    }

    public Registration getRegistrationId() {
        return registrationId;
    }
}
