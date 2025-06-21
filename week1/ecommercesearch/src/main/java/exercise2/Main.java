package exercise2;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Smartphone", "Electronics"),
            new Product(101, "T-shirt", "Clothing"),
            new Product(103, "Laptop", "Electronics"),
            new Product(102, "Book", "Education"),
            new Product(104, "Shoes", "Footwear")
        };

        // Linear Search
        Product result1 = SearchUtils.linearSearch(products, 103);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Binary Search
        SearchUtils.sortByProductId(products); // sort first
        Product result2 = SearchUtils.binarySearch(products, 103);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
