package domain;

public class Product {
    private final String id;
    private String name;
    private double price;
    private int quantity;
    private int limitQuantity;
    private int minQuantity;
    private ProductCategory category;

    public Product(String name, double price, int limitQuantity, int quantity, int minQuantity,
            ProductCategory category) {
        setName(name);
        setPrice(price);
        setLimitQuantity(limitQuantity);
        setQuantity(quantity);
        setMinQuantity(minQuantity);

        this.id = Integer.toHexString(nextId++).toUpperCase();
        this.category = category;
    }

    // gerador de id
    private static int nextId = 2650;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getLimitQuantity() {
        return limitQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("This name cannot be Empty.");
            return;
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
            return;
        }
        this.price = price;
    }

    public void setLimitQuantity(int limitQuantity) {
        if (limitQuantity < 0 || quantity > limitQuantity || minQuantity > limitQuantity) {
            System.out.println("Invalid limit quantity.");
            return;
        }
        this.limitQuantity = limitQuantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0 || quantity > getLimitQuantity()) {
            System.out.println("Quantity cannot be negative or exceed the limit.");
            return;
        }
        this.quantity = quantity;
    }

    public void setMinQuantity(int minQuantity) {
        if (minQuantity < 0 || minQuantity > limitQuantity) {
            System.out.println("Minimum quantity cannot be negative or exceed the limit.");
            return;
        }
        this.minQuantity = minQuantity;
    }

    public void setCategory(ProductCategory category) {
        if (category == null) {
            System.out.println("Product category cannot be null.");
            return;
        }
        this.category = category;
    }
}
