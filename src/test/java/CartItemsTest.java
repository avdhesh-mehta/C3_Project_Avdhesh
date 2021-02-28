import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartItemsTest {
    CartItems myCart = new CartItems();

    //>>>>>>>>>>>>>>>>>>>>>>CalculateTotal<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void total_for_two_items_currently_should_be388() {
        myCart.addItem("Sweet corn soup",119);
        myCart.addItem("Vegetable lasagne", 269);
        assertEquals(388,myCart.calculateTotal());
    }

    //>>>>>>>>>>>>>>>>>>>>>>CalculateTotal<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}
