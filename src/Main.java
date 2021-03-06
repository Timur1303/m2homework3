
public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bank = new BankAccount(0);
        bank.deposit(20000);
        for (int i = 0;  ; i++) {
            try {
                bank.withDraw(6000.00);
            } catch (LimitException b) {
                bank.withDraw(b.getRemainingAmount());
                System.out.println(b.getMessage());
                break;
            }
        }
    }
}
