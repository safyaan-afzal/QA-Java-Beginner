package com.qa.operators;

import java.util.Scanner;

public class Main {
		
	//Main method - takes user input
	public static void main(String[] args) {
		//Creates a new 'scanner' for user input
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	    
		
		System.out.println("Enter integer 1: ");
		//Reads user input
		int intOne = input.nextInt();
		System.out.println("Enter integer 2: ");
	    int intTwo = input.nextInt();
	    
	    Calculator calculator = new Calculator();
	    
		//calls addition method & prints the returned value
		System.out.println("The sum of the two integers is: " + calculator.addition(intOne, intTwo));
	}	
	
}
