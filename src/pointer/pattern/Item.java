package pointer.pattern;

import java.util.Objects;

public class Item {
    private final String upcCode;
    private final int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getPrice() == item.getPrice() &&
                Objects.equals(getUpcCode(), item.getUpcCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUpcCode(), getPrice());
    }
}
