import java.util.*;

public class NumberGuessing{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        final int num = rand.nextInt(999);

        System.out.println("Enter the guess Number : ");

        int guess = 0;

        int count=0;

        while(guess != num ){
            guess = sc.nextInt();
            if(guess > num ){
                System.out.println("Too High Guess Again");
            } 
            else if(guess < num ){
                System.out.println("Too Low Guess Again !");
            }
            
            else{
                System.out.println("You Guessed it Right !");
            }
            count++;
        }
        System.out.print("Total guesses : "+count);

    }

}
