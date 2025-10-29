package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {

    private String id;
    private String name;
    private double price;
    private int unitsAvailable;

    public Product(String name, double price, int unitsAvailable) {
        generateId();
        this.name = name;
        this.price = price;
        this.unitsAvailable = unitsAvailable;
    }

    private void generateId() {
        id = new SimpleDateFormat("MMddHHmmss.SSS").format(new Date());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", unitsAvailable=" + unitsAvailable + "]";
    }

}
