package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(MyAppApplication.class, args);
    }

}
