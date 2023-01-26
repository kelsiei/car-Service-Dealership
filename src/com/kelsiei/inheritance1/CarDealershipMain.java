package com.kelsiei.inheritance1;

import java.util.Scanner;

public class CarDealershipMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brand = 0;

        CarDealership dealership = new CarDealership();

        CarDealership.headerFormatter(); //Q: How was I able to access static method of other class here?
        //After figuring out, remove from here.

        // Providing choice of brand for user
        System.out.println("Please enter brand of your card (1-3)");
        while(brand < 1 || brand > 3) {

            System.out.println("1. Honda \n2. BMW \n3. Audi\n");
            brand = scanner.nextInt();

            switch (brand) {
                case 1 -> dealership = new Audi();
                case 2 -> dealership = new BMW();
                case 3 -> dealership = new Honda();
                default -> System.out.println("Please enter brands specified with numerals from 1-3 and try again!");
            }
        }


    }


}