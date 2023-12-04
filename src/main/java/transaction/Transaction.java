package transaction;

import account.Account;
import exception.InsufficientFundsException;

public class Transaction {
    private Account from;
    private Account to;


    public void transferMoney(Account from, Account to, double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount of money to transfer must be greater than zero!");
        }

        try {
            from.withdrawMoney(amount);
            to.deposit(amount);
        } catch (InsufficientFundsException e) {
            throw new Exception("Insufficient funds!");
        }
    }

}
