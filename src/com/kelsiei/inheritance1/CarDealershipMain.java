package com.kelsiei.inheritance1;

import java.util.Scanner;

public class CarDealershipMain {
//READ HERE BEFORE CONTINUINg

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brand = 0;
        int service = 0;
        CarDealership dealership = new CarDealership();

        CarDealership.headerFormatter(); //Q: How was I able to access static method of other class here?
        //After figuring out, remove from here.

        // Providing choice of brand for user
        System.out.println("Please enter brand of your card (1-3)");
        while(brand < 1 || brand > 4) {

            System.out.println("1. Honda \n2. BMW \n3. Audi\n4. General Pack");
            brand = scanner.nextInt();

            switch (brand) {
                case 1 -> dealership = new Honda();
                case 2 -> dealership = new BMW();
                case 3 -> dealership = new Audi();
                case 4 -> dealership = new CarDealership();
                default -> System.out.println("Please enter brands specified with numerals from 1-4 and try again!");
            }
        }

        //Select service your brand of car
        System.out.println("Please select service(s) to be performed for your car (1-3)");
        while(service < 1 || service > 3) {
            System.out.println("1. Engine Oil Refill \n2. Coolant Level Check \n3. Performance Check\n");
            service = scanner.nextInt();

            switch (service) {
                case 1 -> dealership.engineOil();
                case 2 -> dealership.coolantLevels();
                case 3 -> dealership.performanceCheck();
                default -> System.out.println("Please enter brands specified with numerals from 1-3 and try again!");
            }
        }

    }


}