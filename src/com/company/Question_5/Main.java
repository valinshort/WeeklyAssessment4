package com.company.Question_5;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {


        while (true) {
            System.out.println("what is your favorite day of the week");

            Scanner string = new Scanner(System.in);
            switch (string.nextLine())


            {
                case "Monday":
                    System.out.println("boooooo");
                    break;
                case "Tuesday":
                    System.out.println("UGGHHHH");
                    break;
                case "Wednesday":
                    System.out.println("Hump Dayyy!");
                    break;
                case "Thursday":
                    System.out.println("Its an ok day");
                    break;
                case "Friday":
                    System.out.println("that's my favorite too!");
                    break;
                case "Saturday":
                    System.out.println("love it!!");
                    break;
                default:
                    System.out.println("make sure you type your favorite day with a capital.");
                    break;
            }
        }
    }
}



       // switch(string){
           // case:("monday;");
      //  }


        // 1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
      //   2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
       //  3. Make sure you prompt your user as to what they should enter
       //  4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
        // */


  //  }

