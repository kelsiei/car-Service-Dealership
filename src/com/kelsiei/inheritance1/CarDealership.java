package com.kelsiei.inheritance1;

public class CarDealership {
    static String header = "Welcome to Universal Car Dealership";
    public static void headerFormatter() {
        // Formatting for Header
        System.out.printf("%5s", "*"); //TabSpace
        for (int i = 0; i < 54; i++) {
            System.out.print("*");
        }
        System.out.printf("%n%49S", header); //Header line has new line added before '%n' and after '\n'

        System.out.printf("%n%5s", "*"); //TabSpace
        for (int i = 0; i < 54; i++) {
            System.out.print("*");
        }
    }

    protected void engineOil() {
        System.out.println("Generally, head to your nearest Car Service provider after you've travelled " +
                "10,000 miles or over");
    }

    protected void coolantLevels() {
        System.out.println("Generally, your car will indicate for low coolant levels. But if it's been 2-4 years " +
                "since your purchase it's always good to check your dealer!");
    }

    //Checking lights, tyres, exhaust and operations of brakes and steering
    protected void performanceCheck() {
        System.out.println("When it comes to operations of brakes/steering, battery life of light and conditions of " +
                "tyres/exhaust, it is very dependent on the brand and model of your car.\nWe want to serve you no " +
                "matter the type, so bring it to our workshop when your car starts to complain");
    }

}
