public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for (counter = 1; counter <= 20; counter++) {
      System.out.print(counter);
      if (counter % 2 == 0) {
        System.out.println(" is even");
      }
      else {
        System.out.println(" is odd");
      }
    }
  }
}
