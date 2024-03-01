package StatePattern;

public class SuspendedState implements AccountState {
    private final Account account;
    public SuspendedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        System.out.println("Deposits are not allowed for suspended accounts!");
    }

    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("Withdrawals are not allowed; a suspension cannot be withdrawn..");
    }

    @Override
    public void suspend() {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void activate() {
        account.setAccountState(new ActiveState(account));
        System.out.println("Account is activated.");
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!.");
    }
}