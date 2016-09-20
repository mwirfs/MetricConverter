package com.example;

public class Converter
{
    public static void main(String[] args)
    {
         int meters = 28;
        double meterstofeet = 3.28;

        int kilometers = 168;
        double kilometerstomiles = .6214;

        int centimeters = 47;
        double centimeterstoinches = .3937;

        int kilometersperhour = 27;
        double kilometerstofeet = .9113;

        int liters = 92;
        double literstogallon = .2641;

        int kilograms = 200;
        double kilogramstopounds = 2.204;

        double result1 = meters * meterstofeet;
        double result2  = kilometers * kilometerstomiles;
        double result3 = centimeters * centimeterstoinches;
        double result4 = kilometersperhour * kilometerstofeet;
        double result5 = liters * literstogallon;
        double result6 = kilograms * kilogramstopounds;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }

}
