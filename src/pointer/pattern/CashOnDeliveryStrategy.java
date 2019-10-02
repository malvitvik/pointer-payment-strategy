package pointer.pattern;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    public static final int DELIVERY_COST = 50;

    @Override
    public void pay(int amount) {
        System.out.println((DELIVERY_COST + amount) + " will be payed when you get the order.");
    }
}
