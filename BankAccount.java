import java.util.Scanner;

class BankAccount
 {
    // Data members
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Check balance method
    double checkBalance() {
        return balance;
    }

    // Display account details
    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Current Balance  : " + balance);
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

        //Deposite
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final account details
        account.displayAccount();

        
    }
}