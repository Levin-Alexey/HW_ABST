package account;

public class SimpleAccount extends Account {

    public SimpleAccount(long balance) {
        super(balance);
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
        if (amount < 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (amount < 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        account.add(amount);
        return true;
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
