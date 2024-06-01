package org.example.cars.repository;

import org.example.cars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
