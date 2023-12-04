package account;

import exception.InsufficientFundsException;

public abstract class Account {
    protected double balance;

    public Account(double startBalance) {
        this.balance = startBalance;
    }

    public void deposit(double deposit) {
        if (deposit <= 0) {
            throw new IllegalArgumentException("Deposit must be greater than zero!");
        }
        balance += deposit;
    }

    public void withdrawMoney(double withdrawalAmount) throws InsufficientFundsException {
        if (withdrawalAmount > balance) {
            throw new InsufficientFundsException("Insufficient funds!");
        }
        balance -= withdrawalAmount;
    }

    protected static void validateInitialBalance(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be less than zero!");
        }
    }

}
