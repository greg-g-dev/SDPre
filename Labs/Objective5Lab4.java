import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int userInt;
      System.out.println("Please enter a number:");
      userInt = scanner.nextInt();

      if(userInt % 2 == 0) {
        System.out.println("The number is even.");
      }
      else {
        System.out.println("The number is odd.");
      }
  }
}
