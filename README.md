# CODSOFT

PORTFOLIA

NAME : Ieman Fathima
 
SKILLS : JAVA, PYTHON , C+ , MYSQL ,HTML,CSS,JAVASCRIPT.


THE STUDENT GRADE CALCULATOR 
takes 5 marks of subjects 
and the total will be addition of the 5 inputed marks 
and specifies the grade based on the total 

THE CURRENCY CONVERTER 
is used to convert one currency to other 
The user will be provided with 3 currency to convert to after that it shows the output of the conversion

NUMBER GUESSING GAME
is a game where the user gets 5 chances to try what was the guess of the machine if it guess it right it shows you win else the can keep trying until they finish there chance

STUDENT BASE MANAGMENT SYSTEM
Is used to store all the student data and perform various functions like adding a student , removing a stuent ,searching a student etc 






import java.util.Scanner;
import java.lang.Math;

public class NumberGame {
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
    // if the user has run out of trials, print the message and exit the program

    if (correct == false) {
      System.out.println("You ran out of tries.\n You lose!");
    }
  }
}