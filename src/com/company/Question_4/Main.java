

package com.company.Question_4;
import java.util.Scanner;
import java.util.Random;
public class Main {


   // Random random = new Random();
    //random min = 1;
    // random max = 100;


    public static void main(String[] args) {
do {
    System.out.println("pick a number 1 through 100");
    Scanner input = new Scanner(System.in);
    int i = input.nextInt();


    if (i == 1 || i > 1 && i < 45 || i == 45) {
        System.out.println("You have teleported to a swamp");
    } else if (i == 46 || i > 46 && i < 90 || i == 90) {
        System.out.println("Lucky you you have been teleported to the beach");

    } else if (i == 91 || i > 91 && i < 100) {
        System.out.println("Well, i hope you like it hot you have been teleported to a volcano");
    } else if (i > 100) {
        System.out.println("This number is too high it must be 1 through 100");

    }

}while(true);



      /*  1. Create a new method to take user input of a number between 1 and 100
        2. Create an if statement that will take this number and if the number is between 1 and/or equal to 45 display,
        "You have been teleported to a swamp".  If the number is between 46 and/or 90 display, "Lucky you, you've been
        teleported to the beach".  If the number is between 91 and/or equal to 100 display, "Well, I hope you like it hot,
        you have been teleported to a volcano."
         */
    }

}
