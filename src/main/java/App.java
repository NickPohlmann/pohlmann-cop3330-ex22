/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String num1String = myApp.readInput("Enter the first number: ");
        String num2String = myApp.readInput("Enter the second number: ");
        String num3String = myApp.readInput("Enter the third number: ");
        int num1 = myApp.convertInputToInt(num1String);
        int num2 = myApp.convertInputToInt(num2String);
        int num3 = myApp.convertInputToInt(num3String);
        int largestNum = myApp.solveLargestNumber(num1, num2, num3);
        String outputString = myApp.generateOutputString(largestNum);
        myApp.printOutputString(outputString);
    }

    private void printOutputString(String outputString) {
        System.out.println(outputString);
    }

    private String generateOutputString(int largestNum) {
        return String.format("The largest number is %d.", largestNum);
    }

    private int solveLargestNumber(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.print("All the numbers are equal.");
            System.exit(0);
        }
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }

    private int convertInputToInt(String inputString) {
        int input = Integer.parseInt(inputString);
        return input;
    }
}
