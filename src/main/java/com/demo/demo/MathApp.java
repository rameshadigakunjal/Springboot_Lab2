package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MathApp {
    private final Calculator calculator;

    @Autowired
    public MathApp(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performOperations() {
        System.out.println("Result of Addition: " + calculator.add(10, 5));
        System.out.println("Result of Subtraction: " + calculator.subtract(10, 5));
    }
}