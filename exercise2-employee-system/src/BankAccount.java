public class BankAccount {

    private final String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            System.out.println("Error: Starting balance cannot be negative. Balance set to $0.00.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }



}