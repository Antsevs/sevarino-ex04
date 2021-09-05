/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Sevarino
 */

/* Program Start
 * Initialize scanner
 * ask user for noun and take input
 * ask user for verb and take input
 * ask user for adjective and take input
 * ask user for adverb and take input
 * print madlib components with user input components
 */

package Solution04;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = scnr.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scnr.nextLine();

        System.out.println("Enter an adjective: ");
        String adj = scnr.nextLine();

        System.out.println("Enter an adverb: ");
        String adv = scnr.nextLine();

        System.out.printf("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }
}
