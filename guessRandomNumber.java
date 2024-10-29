package dsa;
import java.util.Scanner;

public class guessRandomNumber{
  public static void randomGame(int randNum){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess a number between 1 and 100:");
    int number = scanner.nextInt();

    if (number == randNum){
      System.out.println("You guessed it!");
      System.out.println("Game Ended");
    }
    else if(number<randNum){
      System.out.println("Your guess fell short. Try Again!\n");
      randomGame(randNum);
      
    }
    else{
      System.out.println("Your guess was too high. Try Again!\n");
      randomGame(randNum);
      
    }
  }
  public static void main(String[] args){
    int randNum = (int)(Math.random()*100);
    System.out.println(randNum);
    randomGame(randNum);
  }
}

