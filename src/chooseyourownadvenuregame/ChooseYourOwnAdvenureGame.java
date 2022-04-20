/*
 * Haris Zubair 
 * April 19 2022
 * This program is a choose your own adventure game where you choice your own path, trying to survive in a haunted house. This code uses Nested If Statements.
 */
package chooseyourownadvenuregame;

import java.util.Scanner; 

public class ChooseYourOwnAdvenureGame {

    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice1;
        
        System.out.println("Choices will be presented to you, please enter the number in the bracket if you want to go with that choice.");
        System.out.println("\nYou wake up in a dark room, unaware of where you are. You look around thinking of your next steps.");
        System.out.println("Do you (1)leave the room at risk being seen by the thing your hearing or (2)do you hide, not knowing how long you'll be hiding.");
        
        choice1 = keyedInput.nextInt();
        
        if (choice1 == 1)
        {
            System.out.println("You exit the room safely, but There is a monster in the hall ahead of you");         
        }  
        else if (choice1 == 2)
        {
            System.out.println("You wait for an eternity and starve to death.");
        }
      
              
    }
    
}
