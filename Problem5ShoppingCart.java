public class Problem5ShoppingCart {
    static class Cart {
        private final double[] prices;
        private final String cartId;
        private int itemCount;

        public Cart(String cartId, int capacity) {
            if (cartId == null || cartId.isEmpty()) {
                throw new IllegalArgumentException("Cart ID cannot be empty.");
            }
            if (capacity < 0) {
                throw new IllegalArgumentException("Capacity cannot be negative.");
            }
            this.cartId = cartId;
            this.prices = new double[capacity];
            this.itemCount = 0;
        }

        public boolean addItem(double price) {
            if (price < 0 || itemCount >= prices.length) {
                return false;
            }
            prices[itemCount++] = price;
            return true;
        }

        public double getTotal() {
            double total = 0.0;
            for (int i = 0; i < itemCount; i++) {
                total += prices[i];
            }
            return total;
        }

        public int getItemCount() {
            return itemCount;
        }

        public String getCartId() {
            return cartId;
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.printf("Cart ID: %s%n", cart.getCartId());
        System.out.printf("Total: %.2f%n", cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}
