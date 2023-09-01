public class Main {
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount(1000.0, 2000.0);
        BankAccount account2 = new BankAccount(1500.0, 3000.0);

        // Deposit money
        account1.deposit("checking", 500.0);
        account2.deposit("savings", 1000.0);

        // Withdraw money
        account1.withdraw("checking", 300.0);
        account2.withdraw("savings", 2000.0);
        // Access and display account numbers
        System.out.println("Account 1 Account Number: " + account1.getAccountNumber());
        System.out.println("Account 2 Account Number: " + account2.getAccountNumber());

        // Display balances and total amount stored
        System.out.println("Account 1 Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 2 Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 Savings Balance: " + account2.getSavingsBalance());
        System.out.println("Total Amount Stored: " + BankAccount.getTotalAmountStored());
    }
}
