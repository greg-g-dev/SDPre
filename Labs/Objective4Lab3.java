import java.util.Scanner;
// Need this to get the current date
import java.time.LocalDate;
public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    birthYear = 0;

    // Date right now
    LocalDate currentDate = LocalDate.now();

    // Current year
    currentYear =  currentDate.getYear();

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    // Current year - age = birth year
    birthYear = currentYear  - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
