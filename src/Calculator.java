public class Calculator {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OperationHandler operationHandler = new OperationHandler();
        boolean running = true;

        while (running) {
            printMenu();
            int selectedOperation = inputHandler.getChoice();

            switch (selectedOperation) {
                case 0:
                    System.out.println("Calculator Closed.");
                    running = false;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    double firstInputNumber = inputHandler.getNumber("Enter First Number: ");
                    double secondInputNumber = inputHandler.getNumber("Enter Second Number: ");
                    double calculatedResult = operationHandler.calculate(selectedOperation, firstInputNumber,
                            secondInputNumber);
                    System.out.println("Result: " + calculatedResult);
                    break;
                default:
                    System.out.println("Invalid choice. Kindly try again by select a valid choice.");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        String menu = "|||||||||||| Basic Arithmetic Calculator ||||||||||||\n" +
                "||choice: 1 [Addition (+)]                         ||\n" +
                "||choice: 2 [Subtraction (-)]                      ||\n" +
                "||choice: 3 [Multiplication (*)]                   ||\n" +
                "||choice: 4 [Division (/)]                         ||\n" +
                "||choice: 5 [Modulus (%)]                          ||\n" +
                "||choice: 6 [Exit]                                 ||\n" +
                "|||||||||||||||||||||||||||||||||||||||||||||||||||||\n" +
                "Enter your choice of operation: ";
        System.out.print(menu);
    }
}
