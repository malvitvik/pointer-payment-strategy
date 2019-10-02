package pointer.pattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1111", 10));
        cart.addItem(new Item("2222", 30));
        cart.addItem(new Item("2233", 45));

        cart.pay(new CreditCardStrategy("John Doe", "4111111111111111", "111", "10/20"));

        cart.addItem(new Item("1234", 12));
        cart.addItem(new Item("2345", 36));
        cart.addItem(new Item("3455", 47));

        cart.pay(new PaypalStrategy("j.doe@email.com", "11111111"));

        cart.addItem(new Item("4565", 17));
        cart.addItem(new Item("2345", 36));
        cart.addItem(new Item("3455", 47));

        cart.pay(new CashOnDeliveryStrategy());
    }
}
