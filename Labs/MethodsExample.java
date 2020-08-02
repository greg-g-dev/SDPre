public class MethodsExample {
  public static void main(String[] args) {
    printSquare();
    System.out.println();
    printRectangle();
  }
  public static void printSquare() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("XXXXXXXXXXXXXXXXXXXX");
    }

  }

  public static void printRectangle(){
    printSquare();
    printSquare();
  }

}
