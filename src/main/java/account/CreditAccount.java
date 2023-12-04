package account;

public class CreditAccount extends Account{

    private CreditAccount(double startBalance) {
        super(startBalance);
    }

    public static Account createAccount(double initialBalance) {
        validateInitialBalance(initialBalance);
        return new CreditAccount(initialBalance);
    }
}
