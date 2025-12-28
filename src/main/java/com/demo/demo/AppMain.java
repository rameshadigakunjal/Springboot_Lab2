package com.demo.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }

    @Bean
    CommandLineRunner runOnStart(MathApp mathApp) {
        return args -> mathApp.performOperations();
    }
}
