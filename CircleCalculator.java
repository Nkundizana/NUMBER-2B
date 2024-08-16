/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
    import java.util.Scanner;
class Circle {
    private final double radius;
    // Using 22/7 for π
    private final double PI;  

    // Constructor that takes radius as input
    public Circle(double radius) {
        this.PI = 22.0 / 7.0;
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Method to display the results
    public void displayResults() {
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + calculateArea());
        System.out.println("Circumference of the circle: " + calculateCircumference());
    }
}

// Main class
public class CircleCalculator {
    public static void main(String[] args) {
        // Prompt the user to enter the radius
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the radius
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            // Create a Circle object using the provided radius
            Circle circle = new Circle(radius);
            // Display the calculated area and circumference
            circle.displayResults();
            // Close the scanner
        }
    }
}

    

