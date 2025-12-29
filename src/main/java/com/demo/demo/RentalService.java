package com.demo.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RentalService {
    @Autowired
    private Car car;

    @Autowired
    private Customer customer;

    public void rentCar(){
        System.out.println("Customer: "+customer.getName());
        System.out.println("Car: " + car.grtModel());
        System.out.println("Car Rented Successfully!");
        
    }

}
