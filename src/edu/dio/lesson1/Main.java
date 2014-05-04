package edu.dio.lesson1;

public class Main {
    public static void main(String[] args) {
        Person student;
        Person adult;
        Person anotherAdult1, anotherAdult2;

        //object initialization
        student = new Person();
        adult = new Person("SomeFirstName", "SomeLastName", "SomeDescription");
        anotherAdult1 = adult;
        anotherAdult2 = new Person("SomeFirstName", "SomeLastName", "SomeDescription");

        //data printing
        System.out.println(student);
        System.out.println(adult);
        System.out.println(anotherAdult1);
        System.out.println(anotherAdult2);

        //object comparison
        System.out.println(student == adult);                 //false - different references
        System.out.println(adult == anotherAdult1);           //true  - equal reference
        System.out.println(anotherAdult1 == anotherAdult2);   //false - different references
        System.out.println(adult.equals(anotherAdult1));      //true  - equal data members values
    }
}
