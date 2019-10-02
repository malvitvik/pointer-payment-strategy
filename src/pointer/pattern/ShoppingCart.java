package pointer.pattern;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new LinkedList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
        items.clear();
    }
}
