package com.example.ex9halrepositories.cars.repositories;

import com.example.ex9halrepositories.cars.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
}
