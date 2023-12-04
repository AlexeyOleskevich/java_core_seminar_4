import account.Account;
import account.CreditAccount;
import account.DebitAccount;
import transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        try {
            Account debitAccount = DebitAccount.createAccount(1.0);
            Account creditAcount = CreditAccount.createAccount(1.0);
            Transaction transaction = new Transaction();
            transaction.transferMoney(debitAccount, creditAcount, 2.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
