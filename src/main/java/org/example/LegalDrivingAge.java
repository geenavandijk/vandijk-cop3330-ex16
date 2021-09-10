/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class LegalDrivingAge {

    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.printf("What is your age? ");

        int age = input.nextInt();

        String output = null;

        output = (age >= 16) ? " ": " not ";

        System.out.println("You are"+ output +"old enough to legally drive.");

    }
}
