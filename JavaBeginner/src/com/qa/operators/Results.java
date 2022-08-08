package com.qa.operators;

import java.util.Scanner;

public class Results {
	
	static double physics; 
	static double chemistry;
	static double biology;
	static double total;
	static double percentage; 
	
	public static void displayResults(double phys, double chem, double bio) {
		total = phys + chem + bio;
		
		System.out.println("\nPhysics: " + phys);
		System.out.println("Chemistry: " + chem);
		System.out.println("Biology: " + bio);
		System.out.println("Total: " + total);
	}
	
	public static void displayPercentage(double total) {
		percentage = (total * 100) / 450;
		System.out.println("Overall percentage: " + percentage + "%");
	}
	
	public static void main(String[] args) {
		//Creates a new 'scanner' for user input
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	    
		//Reads user input
		System.out.println("Enter Physics grade: ");
		physics = input.nextDouble();
		
		System.out.println("Enter Chemistry grade: ");
	    chemistry = input.nextDouble();
	    
	    System.out.println("Enter biology grade: ");
	    biology = input.nextDouble();
	    
		//calls addition method & prints the returned value
		displayResults(physics, chemistry, biology);
		displayPercentage(total);
	}	
	
}
