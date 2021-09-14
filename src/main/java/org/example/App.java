package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a noun:");
        String noun = sc.nextLine();
        System.out.println("Enter a verb:");
        String verb = sc.nextLine();
        System.out.println("Enter an adjective:");
        String adjective = sc.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = sc.nextLine();

        String madLib = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);

        System.out.println(madLib);

    }
}