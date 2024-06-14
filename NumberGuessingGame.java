import java.util.*;
import java.util.Random;

public class NumberGuessingGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int lowerbound=1;
        int upperbound=100;
        int Number=random.nextInt(upperbound-lowerbound+1)+ lowerbound;
        int Guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between 1 and 100.Try to guess it!");

        while (true) {
            System.out.println("Enter your guess:");
            Guess = sc.nextInt();
            attempts++;

            if(Guess == Number){
                System.out.println("Congratulations!You guessed the correct number in " + attempts +" attempts.");
                System.out.println("Do you want to play again? (yes/no)");
                String playagain =sc.next();
                if(!playagain.equalsIgnoreCase("yes")){
                    break;
                }else {
                    Number = random.nextInt(upperbound - lowerbound + 1)+lowerbound;
                    attempts = 0;
                    System.out.println("I have generated a new number.Let's play again!");
                }
                }else if (Guess < Number){
                    System.out.println("Too low guess.Try again.");
                }else{
                    System.out.println("Too high.Try again.");
                }
            }

            System.out.println(" Thank you for playing the Number Guessing Game!");
        
    }
}   
          
    
    
                
                
            
        
    
