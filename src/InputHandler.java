import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getChoice() {
        int choice = -1;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException inputMismatch) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.nextLine();
        }
        return choice;
    }

    public double getNumber(String inputtedNumber) {
        double number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(inputtedNumber);
            try {
                number = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException inputMismatch) {
                System.out.println("Invalid number. Please try again.");
            } finally {
                scanner.nextLine();
            }
        }

        return number;
    }
}
