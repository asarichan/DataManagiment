import java.util.Random;

public class DiceGame{
  public static void main(String[] args){
    Random rand = new Random();
    int die1 = rand.nextInt(6)+1;
    int die2 = rand.nextInt(6)+1;
    int value = die1 + die2;
    
    System.out.println("Roling dice...");
    System.out.println("Die 1: " + die1);
    System.out.println("Die 2: " + die2);
    System.out.println("Total value: " + value);
    
     if(value > 7){
        System.out.println("You won");
    }
    else{
        System.out.println("You lose");
    }
  }
}
