package com.ab.CarAPI.repository;

import com.ab.CarAPI.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
