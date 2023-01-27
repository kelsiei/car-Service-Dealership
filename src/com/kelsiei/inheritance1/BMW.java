package com.kelsiei.inheritance1;

public class BMW extends CarDealership{

    @Override
    protected void engineOil() {
        //10,000 miles
        System.out.println("Your BMW engine oil is enough and distance travelled is still below 10,000 miles.\n" +
                "Please come back when your car crosses the threshold");
    }

    @Override
    protected void coolantLevels() {
        //80,000 miles +
        //4 years+
        System.out.println("Great way to be aware of coolant levels is either with total miles on you BMW or " +
                "if it's been over 4 years since your purchase.\nStay educated, folks.");
    }

    @Override
    protected void performanceCheck() {
        //Checking lights, tyres, exhaust and operations of brakes and steering
        System.out.println("Is there a purple blinker ON in the front panel of your BMW with a screw-driver drawn in." +
                " Guess it's time for the regular lights, tyres, exhaust and operations of brakes and steering CHECK. " +
                "Only takes 2 hours!");
    }

}
