package org.example.models;

public class Product {
    String productName;
    int unitPrice;
    boolean isInStock;

    public Product() {
    }

    public Product(String productName, int unitPrice, boolean isInStock) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.isInStock = isInStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean getInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
