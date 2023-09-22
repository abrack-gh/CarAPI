package com.ab.CarAPI.service;

import com.ab.CarAPI.model.Car;
import com.ab.CarAPI.model.FleetAge;
import com.ab.CarAPI.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class FleetService {

    private CarRepository carRepository;
    public FleetAge fleetAge(){

        List<Car> carList = carRepository.findAll();

        OptionalDouble average = carList
                .stream()
                .mapToDouble(a -> (2020 - a.getBuild()))
                .average();

        return new FleetAge(carList.size(), average.getAsDouble());


    }




}
