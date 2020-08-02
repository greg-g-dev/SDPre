import java.util.Scanner;

public class MethodsWithParametersExample{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    String item;
    int quantity;
    double num1, num2;
    System.out.println("Please enter your inventory item: ");
    item = kb.nextLine();
    System.out.println("Please enter the quantity: ");
    quantity = kb.nextInt();
    printInventory(item, quantity);

    printInventory("tomatoes", 12);

    System.out.println("Please give me one decimal number: ");
    num1 = kb.nextDouble();
    System.out.println("Please give me another decimal number: ");
    num2 = kb.nextDouble();

    double answer = findSum(num1, num2);
    System.out.println(num1 + " + " + num2 + " = " + answer);

  }

  public static void printInventory(String inventoryItem, int numberOfInventoryItems){
    System.out.println("There are currently " + numberOfInventoryItems + " " + inventoryItem + " left.");
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }
}
