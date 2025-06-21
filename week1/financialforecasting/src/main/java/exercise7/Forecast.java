package exercise7;

public class Forecast {

    // Recursive method
    public static double futureValueRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return futureValueRecursive(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized (Iterative) method
    public static double futureValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }
}

