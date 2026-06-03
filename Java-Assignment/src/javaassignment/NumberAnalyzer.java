package javaassignment;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        int option, inputNumber1, inputNumber2;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Select an option:");
            System.out.println("1. Print numbers from 10 to 1 in descending order");
            System.out.println("2. Print Even/Odd Report");
            System.out.println("3. Check Number Type");
            System.out.println("4. Calculate Sum of Two Integer Numbers");
            System.out.println("5. Exit");
            option = reader.nextInt();

            switch (option) {
                case 1:
                    printNumbersDescending();
                    break;
                case 2:
                    printEvenOrOdd();
                    break;
                case 3:
                    System.out.print("Enter an integer: ");
                    inputNumber1 = reader.nextInt();
                    String result = checkNumberType(inputNumber1);
                    System.out.println(" The number you entered is: " + result);
                    break;
                case 4:
                    System.out.print("Enter the first integer: ");
                    inputNumber1 = reader.nextInt();
                    System.out.print("Enter the second integer: ");
                    inputNumber2 = reader.nextInt();
                    int sum = calculateSum(inputNumber1, inputNumber2);
                    System.out.println("The sum of " + inputNumber1 + " and " + inputNumber2 + " is: " + sum);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        while (option != 5);

        System.out.println("Thank you for using Number Analyzer. Goodbye!");
    }

    /**
     * This method prints numbers from 10 to 1 in descending order
     *
     */
    public static void printNumbersDescending()
    {
        for (int i=10 ; i >= 1; i--)
        {
            System.out.println(i);
        }
    }

    /**
     * This method checks numbers from 1 to 10 and prints whether they are even or odd
     * then prints the result in the format "number -> Even/Odd"
     *
     */
    public static void printEvenOrOdd()
    {
        for (int i = 1 ; i <=10 ; i++)
        {
            if (i%2 == 0)
            {
                System.out.println(i +" -> Even");
            }
            else
            {
                System.out.println(i +" -> Odd");
            }
        }
    }


    /**
     * Checks whether a given integer is positive, negative, or zero.
     *
     * @param number the integer value to check
     * @return "Positive", "Negative", or "Zero" depending on the input number.
     */
    public static String checkNumberType(int number)
    {
        if (number > 0)
        {
            return "Positive";
        }
        else if (number < 0)
        {
            return "Negative";
        }
        else
        {
            return "Zero";
        }
    }

    /**
     * This method takes two integer parameters and returns their sum.
     *
     * @param number1
     * @param number2
     * @return the sum of number1 and number2
     */
    public static int calculateSum(int number1, int number2)
    {
        int sum = number1 + number2;
        return sum;
    }



}
