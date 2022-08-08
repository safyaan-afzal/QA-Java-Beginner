package com.qa.classmembers;

public class Customer {
    private String firstName;
    private String surname;
    private static int numberOfPeople = 0;

    public Customer(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
        numberOfPeople++;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
