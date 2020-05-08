
public class Main {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount(0);
        bank.deposit(10000);
        System.out.println("Депозит 10000");
        for (int i = 0;  ; i++) {
            try {
                bank.withDraw(6000.00);
                System.out.println("Снять 6000");
            } catch (LimitException b) {
                System.out.println("Снять оставшую сумму " + b.getRemainingAmount());
                break;


            }
        }


    }
}
