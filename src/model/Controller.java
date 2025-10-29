package model;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Product> productList;

    public Controller() {
        productList = new ArrayList<Product>();
    }

    public boolean registerProduct(String name, double price, int unitsAvailable) {
        return productList.add(new Product(name, price, unitsAvailable));
    }

    public String showProductList() {

        String list = "Los productos registrados en el sistema son: \n";

        for (int i = 0; i < productList.size(); i++) {

            list += (i + 1) + ". " + productList.get(i).getName();

        }

        return list;

    }

    public String loadProductsFromTextFile(String filePath) {

        String msg = "\nNuevos productos cargados exitosamente desde el archivo proporcionado\n";

        return msg;

    }

    public String saveProducts() {

        String msg = "\nProductos guardados exitosamente en el sistema\n";
        return msg;

    }

    public String loadProducts() {

        String msg = "\nProductos cargados exitosamente en el sistema\n";

        return msg;

    }

}
