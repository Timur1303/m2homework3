
public class Main {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount(0);
        bank.deposit(10000);
        for (int i = 0;  ; i++) {
            try {
                bank.withDraw(6000.00);
            } catch (LimitException b) {
                System.out.println("Снять оставшую сумму " + b.getRemainingAmount());
                System.out.println(b.getMessage());
                break;
            }
        }
    }
}
