package com.kelsiei.inheritance1;

public class Audi extends CarDealership{

    protected void engineOil() {
        //5,000 miles
        System.out.println("Your BMW engine oil is enough and distance travelled is still below 5,000 miles.\n" +
                "Please come back when your car crosses the threshold");
    }

    protected void coolantLevels() {
        //30,000 miles +
        //2 years+
        System.out.println("Great way to be aware of coolant levels is either with total miles (below 30,000) " +
                "on you Audi or if it's been over 4 years since your purchase.\nNever waste your $$, folks.");
    }

    protected void performanceCheck() {
        //Checking lights, tyres, exhaust and operations of brakes and steering
        System.out.println("Is there a green blinker ON in the front panel of your Audi with a screw-driver drawn in. " +
                "Guess it's time for the regular lights, tyres, exhaust and operations of brakes and steering CHECK. " +
                "Only takes an hour!");
    }
}
