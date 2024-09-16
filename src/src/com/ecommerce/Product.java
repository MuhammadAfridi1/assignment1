// File: com/ecommerce/Product.java
package com.ecommerce;

public class Product {
    private int productID;
    private String name;
    private double price;

    // Constructor
    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productID + ", Name: " + name + ", Price: $" +price;
}
}