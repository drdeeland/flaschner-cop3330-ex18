/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String convertInput = myApp.convertInput();

        String convertFrom = myApp.convertFromType(convertInput);
        String convertTo = myApp.convertToType(convertInput);

        String tempString = myApp.tempInput(convertFrom);
        float temp = Float.parseFloat(tempString);

        double convertedTemp = myApp.conversionCalc(convertTo, temp);
        String output = myApp.buildOutput(convertTo, convertedTemp);

        myApp.printOutput(output);
    }

    public String convertInput() {
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        return input.nextLine();
    }

    public String convertFromType(String convertType) {
        switch (convertType) {
            case "c":

            case "C":
                return "Fahrenheit ";

            case "f":

            case "F":
                return "Celsius ";
        }
        return "";
    }

    public String convertToType(String convertType) {
        switch (convertType) {
            case "c":

            case "C":
                return "Celsius ";

            case "f":

            case "F":
                return "Fahrenheit ";
        }
        return "";
    }

    public String tempInput(String convertFrom) {
        System.out.print("Please enter the temperature in " + convertFrom);
        return input.nextLine();
    }

    public double conversionCalc(String convertTo, float temp) {
        switch (convertTo) {
            case "Fahrenheit ":
                return (temp * 9 / 5) + 32;

            case "Celsius ":
                return (temp - 32) * 5 / 9;
        }
        return 999999999;
    }

    public String buildOutput(String convertTo, double newTemp) {
        String newTempString = String.format("%.0f", newTemp);
        return "The temperature in " + convertTo + "is " + newTempString;
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}