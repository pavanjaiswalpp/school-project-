// Java Program to demonstrate the use of arithmetic operators
// Author: Pavan Jaiswal
// Marks: 15

import java.util.Scanner;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        // Performing arithmetic operations
        double sum = num1 + num2;         // Addition
        double difference = num1 - num2;  // Subtraction
        double product = num1 * num2;     // Multiplication
        double quotient = num1 / num2;    // Division
        
        // Displaying results
        System.out.println("\nResults of arithmetic operations:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        
        sc.close(); // Closing the scanner
    }
}
