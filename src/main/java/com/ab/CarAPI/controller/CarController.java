package com.ab.CarAPI.controller;

import com.ab.CarAPI.model.Car;
import com.ab.CarAPI.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> getCars(){

        return carRepository.findAll();

    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable("id") Long id){
        return carRepository.getReferenceById(id);
    }

    @PostMapping
    public Car newCar(@RequestBody Car car){

        return carRepository.save(car);

    }

    @DeleteMapping("/{id}")
    public void removeByID(@PathVariable("id") Long id){
        carRepository.deleteById(id);
    }

}
