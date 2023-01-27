package com.kelsiei.inheritance1;

public class Honda extends CarDealership{

    protected void engineOil() {
        //75,000 miles
        System.out.println("Your Honda engine oil is enough and distance travelled is still below 75k miles.\n" +
                "Please come back when your car crosses that threshold.");
    }

    protected void coolantLevels() {
        //105,000 miles +
        //7 years+
        System.out.println("Great thing about Honda is its resilience and adaptability for most people's needs. " +
                "That is why coolant levels are great under 105k miles or after 7 yrs since purchase. Yay, spend wisely!");
    }

    protected void performanceCheck() {
        //Checking lights, tyres, exhaust and operations of brakes and steering
        System.out.println("Is there a blue blinker ON in the front panel of your Honda with a screw-driver drawn in." +
                " Guess it's time for the regular lights, tyres, exhaust and operations of brakes and steering CHECK. " +
                "Only takes 3 hours!");
    }
}
