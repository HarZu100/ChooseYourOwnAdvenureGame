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
        int choice2;
        int choice3;
        int choice4;
        int choice5;
        int choice6;
       

        System.out.println("Choices will be presented to you, please enter the number in the bracket if you want to go with that choice.");
        System.out.println("\nYou wake up in a dark room, unaware of where you are. You look around thinking of your next steps.");
        System.out.println("Do you (1)leave the room at risk being seen by the thing your hearing or (2)do you hide, not knowing how long you'll be hiding.");
        
        choice1 = keyedInput.nextInt();
        
        if (choice1 == 1)
        {
            System.out.println("You exit the room safely, but there is a monster in the hall ahead of you.");
            System.out.println("Will you, (1)Take your chances and try to outrun this beast, or (2)will you play it safe and try hiding even though it has seen you."); 
            choice2 = keyedInput.nextInt();
            if (choice2 == 1)
            {
               System.out.println("You barely get away with yor life, but now are exhausted and very hungry."); 
               System.out.println("Feelig proud of of surviving you want to explore. Will you (1)explore into the basement, or (2)head to the kitchen."); 
               choice3 = keyedInput.nextInt();
               if (choice3 == 1)
               {
                   System.out.println("You find a window and escape, you got away and are now safe, but the house and its mysteries stay to haunt the next victim."); 
               }
               else if (choice3 == 2)
               {
                   System.out.println("You go to the kitchen and find food, you eat as much as you can and feel alive again."); 
                   System.out.println("You now have a big decision to make, will you (1)spend the rest of your days in the house or (2)confront the monster.");
                   choice4 = keyedInput.nextInt();
                   if (choice4 == 1)
                   {
                       System.out.println("You live everyday in fear, waiting for the day you get caught. You regret this choice but feel like there is no escape now."); 
                   }
                   else if (choice4 == 2)
                   {
                       System.out.println("You lure the monster into a trap, with the enrgy you got from the food you push it down the stairs, killing it and making yourself free to go.");
                   }
               }
                   
            }
            else if (choice2 == 2)
            {
                System.out.println("As you stay still under furniture hiding, the hard truth hits you, it will find you soon."); 
                System.out.println("You must act fast, will you (1)take your chances and run now, or (2)keep hiding and hope it doesn't notice you.");
                choice5 = keyedInput.nextInt();
                if (choice5 == 1)
                {
                    System.out.println("You barely get away with yor life, but now are badly injured and bleeding."); 
                    System.out.println("You are scared and confused and realy only have two paths to take, will you (1)explore into the basement, or (2)head to the kitchen.");
                    choice6 = keyedInput.nextInt();
                    if (choice6 == 1)
                    {
                        System.out.println("You find a window and escape, sadly you don't get far and die due to your wounds. You were so close to freedom.");
                    }
                    else if (choice6 == 2)
                    {
                        System.out.println("You go to the kitchen and find food, and some cloth to cover your wounds. You feel a little better but are still weak and tired.");
                        System.out.println("");
                    }
                }
                else if (choice5 == 2)
                {
                    System.out.println("It got you, you cannot hide forever. It will always find you."); 
                }
            }
        }  
        else if (choice1 == 2)
        {
            System.out.println("You wait for an eternity and starve to death.");
        }
        
    }
    
}
//System.out.println(""); 
