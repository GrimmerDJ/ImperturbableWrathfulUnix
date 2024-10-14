public class Main {
    public static void main(String[] args) {
        double tuition = 10000;
        double tuitionGrowthRate = 0.05;

        for (int year = 1; year <= 10; year++) {
            tuition += tuition * tuitionGrowthRate;
        }
        System.out.printf("Tuition in ten years: $%.2f%n", tuition);

        // I'm just going to assume that you mean for me to calculate tuition starting from year 10 and not 7
        double totalScam = 0;
        for (int year = 1; year <= 4; year++) {
            totalScam += tuition;
            tuition += tuition * tuitionGrowthRate;
        }
        System.out.printf("Total cost for four years after ten years: $%.2f%n", totalScam);
    }
}