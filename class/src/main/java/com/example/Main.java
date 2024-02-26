package com.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Jaro", "Diaz", "12341234", 1987, "Colombia",'H');
        Person person2 = new Person("Gloria", "Torres", "56785678", 1989, "Colombia",'M');

        
        System.out.println("Person 1:");
        person1.show();

        System.out.println("Person 2:");
        person2.show();
    }
}