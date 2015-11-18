package pack;

import java.util.Date;

/**
 * Created by JazzTeamUser on 18.11.2015.
 */
public class AllocatedCashflow extends TypedCashflow {
    private Account account;

    public AllocatedCashflow() {
    }

    public AllocatedCashflow(Account account, Date date, int type, double amount) {
        super(date, type, amount);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String toString() {
        return "AllocatedCashflow[" +
                "account=" + account +
                ",date=" + getDate() +
                ",type=" + (getType() == CREDIT ? "Credit" : "Debit") +
                ",amount=" + getAmount() + "]";
    }
}