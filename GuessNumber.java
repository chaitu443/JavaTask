/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cb.guessnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chaitanya
 */
public class GuessNumber {
    
    
public static void main(String[] args) {
    
    //variables that stores the lower and upper bounds
    String higher = "higher", lower = "lower", correct = "correct", input;
    int random, min = 1, max = 100, randomLast, cntr = 1;
    int lowerBound = 0;
    int upperBound = 100;

    Random generator = new Random();
    Scanner reader = new Scanner(System.in);

    random = generator.nextInt(upperBound - lowerBound + 1) + lowerBound;
    randomLast = random;
    
    System.out.println(" Choose a number between 1 and 100, and type ready");
    input = reader.next();
   
    if (input.equals("ready")){
    System.out.println("Is your number: " + random);
    System.out.println("Input if number should be higher, lower, or yes: ");
    input = reader.next();

    while (!input.equals("yes") && !input.equals("end")){
        if (input.equals("lower")){
            upperBound = random;
            randomLast = min;
            min = generator.nextInt(upperBound - lowerBound + 1) + lowerBound;
 
            if ((min < random) && (min < randomLast)){
            random = min;
            cntr += 1;
            System.out.println("Is your number: " + random);
            System.out.println("Input if number should be higher, lower, or yes: ");
            input = reader.next();
            } else {
                input = lower;
            }
        } else if (input.equals("higher")){
            lowerBound = random;
            randomLast = max;
            max = generator.nextInt(upperBound - lowerBound + 1) + lowerBound;

            if ((max > random) && (max > randomLast)){
            random = max;
            cntr += 1;
            System.out.println("Is your number: " + random);
            System.out.println("Input if number should be higher, lower, or yes: ");
            input = reader.next();
            } else {
                input = higher;
            }
        }

    }

    System.out.println("Computer took " + cntr + " amount of tries to guess your number");
    }
   }
    
}
