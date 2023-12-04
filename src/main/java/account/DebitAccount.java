package account;

public class DebitAccount extends Account {
    private DebitAccount(double initialBalance) {
        super(initialBalance);
    }

    public static Account createAccount(double initialBalance) {
        validateInitialBalance(initialBalance);
        return new DebitAccount(initialBalance);
    }
}
