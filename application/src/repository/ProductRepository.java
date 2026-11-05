package repository;

import domain.Product;
import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> productStock = new ArrayList<>();

    public void addProduct(Product product) {
        productStock.add(product);
    }

    public ArrayList<Product> getAllProducts() {
        return productStock;
    }
}
