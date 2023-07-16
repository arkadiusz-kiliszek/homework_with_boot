package com.example.homowerokshapeboot.shape;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@ConditionalOnProperty(value = "shape.type", havingValue = "rectangle")
public class Rectangle implements Shape {
    @Override
    public double calculateArea() {
        System.out.println("Liczymy pole prostoka! Podaj boki a oraz b: ");
        System.out.println("Podaj a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Podaj b: ");
        double b = scanner.nextDouble();
        return a * b;
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
