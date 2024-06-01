package org.example.cars.controller;

import org.example.cars.model.Car;
import org.example.cars.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Car> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int size) {
        PageRequest pr = PageRequest.of(page, size);
        return repository.findAll(pr);
    }
}
