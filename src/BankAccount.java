public class BankAccount {
    private double amount;

    public BankAccount(double amount){
        this.amount = amount;
    }

    public void deposit(double sum){
        amount = sum;
    }


    public double  withDraw(double sum) throws LimitException {
        if (sum > amount)
            throw new LimitException("Снять оставшую сумму", amount);
        amount = amount - sum;
        return amount;

    }


    public double getAmount() {
        return amount;
    }




}
