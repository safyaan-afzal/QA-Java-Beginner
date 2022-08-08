package com.qa.operators;

import java.util.Scanner;

public class Calculator {
	
	public int addition(int inputOne, int inputTwo) {
		int sum = inputOne + inputTwo;
		return sum;
	}
	
	public int multiplication(int inputOne, int inputTwo) {
		int sum = inputOne * inputTwo;
		return sum;
	}
	
	public int subtraction(int inputOne, int inputTwo) {
		int sum = inputOne - inputTwo;
		return sum;
	}
	
	public double division(double inputOne, double inputTwo) {
		double sum = inputOne * inputTwo;
		return sum;
	}
	
	public static void main(String[] args) {
		//Creates a new 'scanner' for user input
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	    
		//Reads user input
		System.out.println("Enter integer one: ");
		int intOne = input.nextInt();
		
		System.out.println("Enter Two one: ");
	    int intTwo = input.nextInt();
	    
	    Calculator calculator = new Calculator();
	    
		//calls addition method & prints the returned value
		System.out.println("The sum of the two integers is: " + calculator.addition(intOne, intTwo));
	}	
}
