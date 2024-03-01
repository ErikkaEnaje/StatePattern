package StatePattern;

public interface AccountState {
    void deposit(double depositAmount);
    void withdraw(double withdrawAmount);
    void suspend();
    void activate();
    void close();
}