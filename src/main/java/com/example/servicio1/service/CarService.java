package com.example.servicio1.service;

import com.example.servicio1.entity.Car;
import com.example.servicio1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Car getCarById(int id){
        return carRepository.findById(id).orElse(null);
    }

    public Car saveCar(Car car){
        Car carNew = carRepository.save(car);
        return carNew;
    }

    public List<Car> getByUserId(int userId){
        return carRepository.findByUserId(userId);
    }
}
