/*
 * Michael Botros
 * October 9th, 2019
 * This program will count certain set increments to set amounts based on the option that the user selects
 */

package loops;

//import scanner library
import java.util.Scanner;
/**
 *
 * @author mibot3117
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //create a new scanner object
        Scanner keyedInput = new Scanner(System.in);
        
        //declaring a variable for choice
        int choice = 0;
        
        //print out the header
        System.out.println("------Cool Counting Program------");
        System.out.println("");
        
        //print out the instructions for the user and the options
        System.out.println("Please enter your choice:");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        
        //prompt user for choice
        choice = keyedInput.nextInt();
        
        System.out.println("");
        System.out.println("----------------------------------------");
        
        //the following statements check for the option that user entered and accordingly counts a certain way
        if (choice == 1)
        {
            System.out.println("You have chosen to count from 0 to 10 by 1");
            for (int i = 0; i <=10; i++) 
            {
                System.out.println(i);
            }
        }
        if (choice == 2)
        {
            System.out.println("You have chosen to count from 100 to 0 by 10");
            for (int i = 100; i >=0; i=i-10) 
            {
                System.out.println(i);
            }
        }
        if (choice == 3)
        {
            System.out.println("You have chosen to count from 50 to 500 by 50");
            for (int i = 50; i <=500; i=i+50) 
            {
                System.out.println(i);
            }
        }
        if (choice == 4)
        {
            System.out.println("You have chosen to count from 6000 to 1000 by 1000");
            for (int i = 6000; i >=1000; i=i-1000) 
            {
                System.out.println(i);
            }
        }
        
   }
    
}
