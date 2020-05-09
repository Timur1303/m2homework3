public class BankAccount {
    private double amount;

    public BankAccount(double amount){
        this.amount = amount;
    }

    public void deposit(double sum){
        amount += sum;
    }


    public double  withDraw(double sum) throws LimitException {
        if (sum > amount)
            throw new LimitException("У вас не осталось средств ", amount);
        amount = amount - sum;
        System.out.println("У вас на счету " + amount);

        return amount;

    }
    public double getAmount() {
        return amount;
    }
}
