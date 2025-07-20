import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Bag", "Accessories"),
            new Product(105, "Watch", "Fashion")
        };
        int index1 = linearSearch(products, "Mobile");
        if (index1 != -1)
            System.out.println("Linear Search: Found " + products[index1].productName);
        else
            System.out.println("Linear Search: Not Found");
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int index2 = binarySearch(products, "Mobile");
        if (index2 != -1)
            System.out.println("Binary Search: Found " + products[index2].productName);
        else
            System.out.println("Binary Search: Not Found");
    }
}