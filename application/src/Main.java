import domain.Product;
import repository.ProductRepository;
import service.ProductServices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        Product product = new Product("Rice", 2.3, 200, 180, 80);
        ProductRepository productRepository = new ProductRepository();
        productRepository.addProduct(product);

        for (Product item : productRepository.getAllProducts()) {
            System.out.println(item.getName());
        }

        insert.close();
    }
}