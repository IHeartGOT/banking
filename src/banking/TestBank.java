package banking;

public class TestBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(200.);

        System.out.print ("Before transactions the ");
        b1.display();
        System.out.println();
        System.out.print("After deposit the ");
        b1.deposit(75.25);
        System.out.print("After deposit the ");
        b1.display();
        System.out.println();
        b1.withdraw(50.00);
        System.out.print("After Withdrawal the ");
        b1.display();
        System.out.println();

    }
}
