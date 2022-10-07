package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static void inputCheck(Scanner scanner) {


        String name = null;
        String age = null;

        System.out.println("Introduce a name: ");
        name= scanner.nextLine();
        if (name.isBlank()) throw new IllegalArgumentException("The name can't be blank");
        System.out.println("Introduce an age: ");
        age= scanner.nextLine();
        if (age.isBlank()) throw new IllegalArgumentException("The age can't be blank");

    }
}