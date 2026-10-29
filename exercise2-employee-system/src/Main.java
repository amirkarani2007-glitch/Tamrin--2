public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC-101", "Alice", 1000.00);

        account.displayAccountInfo();


        System.out.println("\n1. Attempting negative deposit:");
        account.deposit(-200.00);
        System.out.printf("Balance after attempt to deposit: $%.2f%n", account.getBalance());


    }
}
