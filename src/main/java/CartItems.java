import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CartItems{
    private List<Item> items = new ArrayList<Item>();

    public List<Item> addItem(String name, Integer price) {
        Item item= new Item(name, price);
        items.add(item);
        return items;
    }

    public List<Item> removeItem(String name) throws itemNotFoundException {
        Item itemToBeRemoved = findItemByName(name);
        items.remove(itemToBeRemoved);
        return items;
    }

    public Item findItemByName(String itemName) throws itemNotFoundException {
        for (Item item : items) {
            System.out.println(item.getName());

            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        throw new itemNotFoundException("Item not found");
    }

    public int calculateTotal() {
        int currPrice = 0;
        for(Item item : items) {
            currPrice = currPrice + item.getPrice();
        }
        System.out.println(currPrice);
        return currPrice;
    }
}
