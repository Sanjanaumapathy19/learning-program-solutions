public class FinancialForecast {
    public static double futureValueRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return futureValueRecursive(currentValue, growthRate, years - 1) * (1 + growthRate);
    }
    public static double futureValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }
    public static void main(String[] args) {
        double initialAmount = 10000;  
        double growthRate = 0.05;      
        int years = 5;
        double futureRecursive = futureValueRecursive(initialAmount, growthRate, years);
        System.out.printf("Future value (recursive) after %d years: ₹%.2f\n", years, futureRecursive);
        double futureIterative = futureValueIterative(initialAmount, growthRate, years);
        System.out.printf("Future value (iterative) after %d years: ₹%.2f\n", years, futureIterative);
    }
}