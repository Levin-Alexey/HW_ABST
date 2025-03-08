package account;

public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(long balance, long creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount < 0 || amount > balance + creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (amount < 0 || amount > balance + creditLimit) {
            return false;
        }
        balance -= amount;
        if (!account.add(amount)) {
            balance += amount;
            return false;
        }
        return true;
    }

    @Override
    public long getBalance() {
        return balance;
    }

    public long getCreditLimit() {
        return creditLimit;
    }
}
