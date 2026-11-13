import domain.Product;
import repository.ProductRepository;
import service.ProductServices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        ProductRepository test = new ProductRepository();
        ProductServices services = new ProductServices(test);
        ProductRepository repository = new ProductRepository();

        Product product = new Product("Rice", 2.3, 200, 180, 80);
        services.addProduct(product);
        Product product2 = new Product("Sugar", 1.5, 100, 90, 50);
        services.addProduct(product2);
        Product product3 = new Product("Salt", 0.8, 150, 120, 70);
        services.addProduct(product3);

        System.out.println(repository.findProductById("A5B7C9"));
        insert.close();
    }
}