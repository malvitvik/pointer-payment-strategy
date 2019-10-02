package pointer.pattern;

public class PaypalStrategy implements PaymentStrategy {
    private final String emailId;
    private final String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " is payed by " + emailId + "'s PayPal account.");
    }
}
