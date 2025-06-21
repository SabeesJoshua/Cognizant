package exercise7;

public class Main {
    public static void main(String[] args) {
        double currentValue = 10000; // Rs.10,000
        double growthRate = 0.08;    // 8% annual growth
        int years = 5;

        double recursiveValue = Forecast.futureValueRecursive(currentValue, growthRate, years);
        double iterativeValue = Forecast.futureValueIterative(currentValue, growthRate, years);

        System.out.printf("Recursive Forecast after %d years: ₹%.2f%n", years, recursiveValue);
        System.out.printf("Iterative Forecast after %d years: ₹%.2f%n", years, iterativeValue);
    }
}
