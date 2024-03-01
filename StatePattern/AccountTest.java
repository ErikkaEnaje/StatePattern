package StateDesignPattern;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate();

        // The Suspend the account
        myAccount.suspend();

        // The Activate the account
        myAccount.activate();

        // The Deposit to the account
        myAccount.deposit(1000.0);

        // The Withdraw from the account
        myAccount.withdraw(100.0);

        // The Close the account
        myAccount.close();

        // The Activate the account
        myAccount.activate();

        // The Suspend the account
        myAccount.suspend();
        System.out.println();

        // The Withdraw from the account
        myAccount.withdraw(500.0);

        // The Deposit to the account
        myAccount.deposit(1000.0);
    }
}
