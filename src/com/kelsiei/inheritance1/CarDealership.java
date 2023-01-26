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

    }

    protected void coolantLevels() {

    }

    protected void performanceCheck() {
        //Checking lights, tyres, exhaust and operations of brakes and steering
    }

}
