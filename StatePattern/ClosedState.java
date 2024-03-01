package StatePattern;

public class ClosedState implements AccountState {
    private final Account account;
    public ClosedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        System.out.println("Deposits are not permitted to closed accounts.");
    }

    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("Withdraw are not available for closed accounts.!");
    }

    @Override
    public void suspend() {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void activate() {
        System.out.println("A  cannot activate a closed account ");
    }

    @Override
    public void close() {
        System.out.println("Your Account is already closed!.");
    }
}