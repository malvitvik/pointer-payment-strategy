package pointer.pattern;

public class CreditCardStrategy implements PaymentStrategy {
    private final String name;
    private final String cartNumber;
    private final String cvv;
    private final String dateOfExpiry;

    public CreditCardStrategy(String name, String cartNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cartNumber = cartNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " is payed by " + name + "'s Credit Card.");
    }
}
