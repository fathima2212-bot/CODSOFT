import java.util.Scanner;

public class NumberGuess {
  public static void main(String[] args) {
    
    int answer = (int)(Math.random() * 100) + 1;
    int i = 5;
    Scanner input = new Scanner(System.in);
    boolean correct = false;
    System.out.println("I'm thinking of a number between 1 and 100.\n You have 5 tries to guess the number.");
    while (i > 0) {
      System.out.println("Enter your guess: ");
     int guess = input.nextInt();
    
      if (guess == answer) {
        System.out.println("You guessed the number!\n You win!");
        break;
      }
      
      else if (guess > answer) {
        System.out.println("Your guess is too high.\n You have " + (i - 1) + " tries left.");
        i--;
      }
      
      
      else {
        System.out.println("Your guess is too low.\nYou have " + (i - 1) + " tries left.");
      }
      
      i--;
    }
  

    if (correct == false) {
      System.out.println("You ran out of tries.\n You lose!");
    }
  }
}