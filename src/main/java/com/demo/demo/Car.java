package com.demo.demo;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model = "Hyundayi Creta";

    public String grtModel() {
        return model;
    }
    
}
