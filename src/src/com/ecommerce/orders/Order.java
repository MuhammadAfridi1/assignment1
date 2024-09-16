// File: com/ecommerce/orders/Order.java
package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    // Constructor
    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = customer.getShoppingCart();
        this.totalAmount = customer.getTotalCartValue();
    }

    // Generate order summary
    public void generateOrderSummary() {
        System.out.println("Order Summary:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Order Status: Placed");
}
}