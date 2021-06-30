package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program to calculate the circumference of a circle
        // The formula for the circumference of a circle is 2 * PI * r

        // Initialize our scanner class
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // initialize our variables
        float pi = (float)Math.PI;
        float radius = scanner.nextFloat();

        float circumference = 2 * pi * radius;

        // output the result
        System.out.println("The circumference of the circle is " + circumference);

//         Classwork
//         Write an application that calculates the body mass index of a person.
//         Two values will be collected from the user:
//         1. weight in kg (double)
//         2. height in m (double)
//         the formula for BMI is weight/(height^2)Math.pow()
//         if the resulting bmi not between the range of 18.5 - 24.9 then, the user should see the output
//         "BMI not optimal" else "BMI optimal"
    }
}
