package com.example;

public class Person {
    private String name;
    private String lastName;
    private String identityNumber;
    private int yearBirth;
    private String countryBirth;
    private char gender;


    public Person(String name, String lastName, String identityNumber, int yearBirth, String countryBirth, char gender) {
    this.name = name;
    this.lastName = lastName;
    this.identityNumber = identityNumber;
    this.yearBirth = yearBirth;
    this.countryBirth = countryBirth;
    this.gender = gender;

    }

    public Person(String name2, String lastName2, int identityNumber2,int yearBirth2, String countryBirth2, char gender2) {
    }

    public void show() {
        
        System.out.println("Name: " + name);
        System.out.println("lastName: " + lastName);
        System.out.println("Identity Number: " + identityNumber);
        System.out.println("Year Birth: " + yearBirth);
        System.out.println("Country Birth: " + countryBirth);
        System.out.println("Gender: " + gender);
    }

}
