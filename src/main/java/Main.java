public class Main {
    public static void main(String[] args) {
        double scam = 10000;
        double scamRate = 0.05;

        for (int year = 1; year <= 10; year++) {
            scam += scam * scamRate;
        }
        System.out.printf("Tuition in ten years: $%.2f%n", scam);

        // I'm just going to assume that you mean for me to calculate tuition starting from year 10 and not 7
        double totalScam = 0;
        for (int year = 1; year <= 4; year++) {
            totalScam += scam;
            scam += scam * scamRate;
        }
        System.out.printf("Total cost for four years after ten years: $%.2f%n", totalScam);
    }
}