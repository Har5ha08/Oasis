import java.util.ArrayList;
import java.util.Scanner;

public class main{
    private static int pin = 1234; 
    private static int attempts = 3;
    private static double balance = 1000.0; 
    private static ArrayList<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == pin) {
                System.out.println("\nPIN accepted. Welcome!");
                showMenu(scanner);
                break;
            } else {
                attempts--;
                System.out.println("Invalid PIN. " + attempts + " attempts remaining.");

                if (attempts == 0) {
                    System.out.println("Too many incorrect attempts. Your card is blocked.");
                    break;
                }
            }
        }

        scanner.close();
    }

    public static void showMenu(Scanner scanner) {
        System.out.println("\nMain Menu:");
        System.out.println("1. Transaction history");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTransactionHistory();
                    break;
                case 2:
                    performWithdraw(scanner);
                    break;
                case 3:
                    performDeposit(scanner);
                    break;
                case 4:
                    performTransfer(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    public static void displayTransactionHistory() {
        System.out.println("\nTransaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    public static void performWithdraw(Scanner scanner) {
        // Implement withdraw logic here
        // Update balance and add transaction to history
        // Example: balance -= amount;
        // transactionHistory.add("Withdraw: $" + amount);
    }

    public static void performDeposit(Scanner scanner) {
        // Implement deposit logic here
        // Update balance and add transaction to history
        // Example: balance += amount;
        // transactionHistory.add("Deposit: $" + amount);
    }

    public static void performTransfer(Scanner scanner) {
       
    }
}