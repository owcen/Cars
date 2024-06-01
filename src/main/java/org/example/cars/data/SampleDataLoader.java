package org.example.cars.data;

import org.example.cars.model.Car;
import org.example.cars.model.Registration;
import org.example.cars.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SampleDataLoader implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);
    private final CarRepository repository;

    public SampleDataLoader(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading sample data...");

        Car car1 = new Car("Toyota", "Camry", new Registration("ABC-123", LocalDate.of(2019, 2, 1), LocalDate.of(2025, 2, 1)));
        Car car2 = new Car("Honda", "Accord", new Registration("XYZ-987", LocalDate.of(2018, 5, 1), LocalDate.of(2024, 5, 1)));
        Car car3 = new Car("Ford", "Fusion", new Registration("DEF-456", LocalDate.of(2020, 8, 1), LocalDate.of(2026, 8, 1)));
        Car car4 = new Car("Chevrolet", "Malibu", new Registration("GHI-789", LocalDate.of(2017, 11, 1), LocalDate.of(2023, 11, 1)));
        Car car5 = new Car("Nissan", "Altima", new Registration("JKL-321", LocalDate.of(2021, 1, 1), LocalDate.of(2027, 1, 1)));

        repository.save(car1);
        repository.save(car2);
        repository.save(car3);
        repository.save(car4);
        repository.save(car5);
    }
}
