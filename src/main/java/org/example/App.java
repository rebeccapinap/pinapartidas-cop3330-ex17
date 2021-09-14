package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double alcDistr = 0;

        // Calculates Blood Alcohol Content based on user input
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        double maleFemale = input.nextDouble();

        System.out.print("How many ounces of alcohol did you have? ");
        double ozAlc = input.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        double hours = input.nextDouble();

        // Assigns constant for calculation based on if you are male or female
        if (maleFemale == 1)
        {
            alcDistr = 0.73;
        }
        else if (maleFemale == 2)
        {
            alcDistr = 0.66;
        }

        double BAC = (ozAlc * 5.14 / weight * alcDistr) - 0.015 * hours;

        System.out.printf("\nYour BAC is %.6f.\n" , BAC);

        if (BAC > 0.08)
        {
            System.out.print("It is not legal for you to drive. ");
        }
        else
        {
            System.out.print("It is legal for you to drive. ");
        }
    }
}
