
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        int firstNum = Integer.valueOf(scanner.nextLine());
        // Prompt the user for the second number
        int secondNum = Integer.valueOf(scanner.nextLine());
        // Conditionally print a sentence stating the relation of the first number to the second
        if (firstNum > secondNum) {
            System.out.println(firstNum + " is greater than " + secondNum + ".");
        } else if (firstNum < secondNum) {
            System.out.println(firstNum + " is smaller than " + secondNum + ".");
        } else {
            System.out.println(firstNum + " is equal to " + secondNum + ".");
        }
    }
}
