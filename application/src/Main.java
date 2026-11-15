import domain.Product;
import domain.ProductCategory;
import repository.ProductRepository;
import service.ProductServices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner and objects to read user input and manage products
        Scanner insert = new Scanner(System.in);
        System.out.println("Welcome to the StockFlow System!");
        ProductRepository repository = new ProductRepository();
        ProductServices services = new ProductServices(repository);
        // Create and add some products to the repository
        Product product = new Product("Rice", 2.3, 200, 180, 80, ProductCategory.NON_PERISHABLE);
        services.addProduct(product);
        Product product2 = new Product("Sugar", 1.5, 100, 90, 50, ProductCategory.NON_PERISHABLE);
        services.addProduct(product2);
        Product product3 = new Product("Salt", 0.8, 150, 120, 70, ProductCategory.NON_PERISHABLE);
        services.addProduct(product3);
        // Test the findProductById and getStockQuantity methods
        System.out.println(repository.findProductById("A5B7C9"));
        System.out.println(services.getStockQuantity("A5B7C9"));
        System.out.println(services.getStockQuantity("A5B"));
        insert.close();
    }
}