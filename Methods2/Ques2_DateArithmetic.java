
import java.time.LocalDate;
import java.util.Scanner;

public class Ques2_DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input);

        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + addedDate);

        
        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
