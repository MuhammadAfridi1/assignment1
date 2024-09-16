// File: com/ecommerce/Customer.java
package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    // Constructor
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getters
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    // Add product to shopping cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    // Remove product from shopping cart
    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
        System.out.println(product.getName() + " removed from the cart.");
    }

    // Calculate total cost of the shopping cart
    public double getTotalCartValue() {
        double total = 0.0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Display shopping cart
    public void displayCart() {
        System.out.println("Shopping Cart for " + name + ":");
        for (Product product : shoppingCart) {
            System.out.println(product);
        }
        System.out.println("Total: $" + getTotalCartValue());
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
}
}
