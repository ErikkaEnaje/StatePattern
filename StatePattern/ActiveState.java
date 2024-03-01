package StatePattern;

class ActiveState implements AccountState {
    private final Account account;
    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("----------------------");
        System.out.println("Deposited:\n" + depositAmount + account.getBalance());
    }

    @Override
    public void withdraw(double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawn:\n" + withdrawAmount + account.getBalance());
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawn:\n" + withdrawAmount + "\nCurrent balance:\n" + account.getBalance());
        System.out.println("----------------------");
    }

    @Override
    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate() {
        System.out.println("\nAccount is already activated!");
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}