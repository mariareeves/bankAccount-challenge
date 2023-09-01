import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAmountStored = 0;

    //constructor
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalAmountStored += checkingBalance + savingsBalance;
        numberOfAccounts++;
    }
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumberBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumberBuilder.append(random.nextInt(10));
        }
        return accountNumberBuilder.toString();
    }

    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    public static double getTotalAmountStored(){
        return totalAmountStored;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(String accountType, double amount){
        if(accountType.equalsIgnoreCase("checking")){
            checkingBalance += amount;
        } else if(accountType.equalsIgnoreCase("savings")){
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }

    public void withdraw(String accountType, double amount){
        if(accountType.equalsIgnoreCase("checking")){
            if(checkingBalance >= amount){
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount){
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }

        }
    }

    public double getTotalBalance(){
        return checkingBalance + savingsBalance;
    }

}
