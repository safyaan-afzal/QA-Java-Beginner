package com.qa.classmembers;

public class Main {
	public static void main(String[] args) {
        System.out.println(Customer.getNumberOfPeople());   // output: 0    No objects instantiated

        Customer firstCustomer = new Customer("Arnold","Rimmer");
        Customer secondCustomer = new Customer("David","Lister");

        System.out.println(firstCustomer.getFirstName());   // output: Arnold
        System.out.println(secondCustomer.getFirstName());  // output: David

        System.out.println(firstCustomer.getNumberOfPeople());  // output: 2
        System.out.println(secondCustomer.getNumberOfPeople()); // output: 2
        System.out.println(Customer.getNumberOfPeople());       // output: 2
    }
}
