import java.util.Scanner;

public class ActivitythreeLabe {
    public static void main(String[] args) {
    
    float dollars = 56f;
    float totaldollars = 0f;
    
        Scanner scanner = new Scanner(System.in);

        // Define products and their prices
        String[] products = {"C1", "C2", "C3"};
        double[] prices = {100.0, 150.0, 200.0};

        // Define add-on products and their prices
        String[] addons = {"R1", "R2"};
        double[] addonPrices = {35.0, 50.0};

        int[] quantities = new int[products.length];
        int[] addonQuantities = new int[addons.length];

        float totalCost = 0.0f;
        int totalQuantity = 0;

        System.out.println("Welcome to LoveBee Minimart!");

        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " - Php" + prices[i]);
            }

            System.out.println("\nAdd-ons:");
            for (int i = 0; i < addons.length; i++) {
                System.out.println((i + 4) + ". " + addons[i] + " - Php" + addonPrices[i]);
            }

            System.out.print("\nEnter the product number to order (0 to finish your order): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= products.length + addons.length) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                int index = choice - 1;
                if (choice > products.length) {
                    index -= products.length;
                    addonQuantities[index] += quantity;
                    totalCost += addonPrices[index] * quantity;
                } else {
                    quantities[index] += quantity;
                    totalCost += prices[index] * quantity;
                }
                totalQuantity += quantity;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("\nOrder Summary:");
        for (int i = 0; i < products.length; i++) {
            if (quantities[i] > 0) {
                System.out.println(products[i] + ": " + quantities[i] + " @ Php " + prices[i] + " each");
            }
        }

        for (int i = 0; i < addons.length; i++) {
            if (addonQuantities[i] > 0) {
                System.out.println(addons[i] + ": " + addonQuantities[i] + " @ Php " + addonPrices[i] + " each");
            }
        }
        
        totaldollars = totalCost / dollars;

        System.out.println("\nTotal Quantity: " + totalQuantity);
        System.out.println("Total Cost: Php " + totalCost);
        System.out.println("Total Cost in Dollar: $" + totaldollars);

        scanner.close();
    }
}
