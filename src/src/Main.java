// File: Main.java
import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product(101, "Laptop", 1200.00);
        Product smartphone = new Product(102, "Smartphone", 800.00);
        Product headphones = new Product(103, "Headphones", 150.00);

        // Create a customer
        Customer customer = new Customer(1, "Lindy ");

        // Customer browsing products and adding them to the cart
        customer.addToCart(laptop);
        customer.addToCart(smartphone);
        customer.addToCart(headphones);

        // Display the customer's shopping cart
        customer.displayCart();

        // Place an order
        Order order = new Order(1001, customer);
        order.generateOrderSummary();
}
}