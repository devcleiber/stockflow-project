package service;

import java.util.ArrayList;
import repository.ProductRepository;
import domain.Product;

public class ProductServices {
    private ProductRepository repository;

    public ProductServices(ProductRepository repository) {
        this.repository = repository;
    }

    // added new products:
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    // view all list product:
    public ArrayList<Product> getAllProducts() {
        return repository.getAllProducts();
    }

    // view product stock quantity by id:
    public int getStockQuantity(String id) {
        Product product = repository.findProductById(id);
        if (product != null) {
            return product.getQuantity();
        } else {
            return -1; // Product not found
        }
    }

}
