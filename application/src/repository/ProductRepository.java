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

    public Product findProductById(String id) {
        for (Product product : productStock) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; // Return null if the product with the given ID is not found
    }
}
