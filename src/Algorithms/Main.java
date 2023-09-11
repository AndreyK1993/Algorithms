package Algorithms;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        double[] prices = {67.5, 34.75, 42.31, 42.55, 87.9, 27.84, 35.67};

        // Сортування даних
        for (int i = 0; i < prices.length; i++) {
            for (int j = 1; j < (prices.length - i); j++) {
                if (prices[j - 1] > prices[j]) {
                    // Перестановка елементів
                    double temp = prices[j - 1];
                    prices[j - 1] = prices[j];
                    prices[j] = temp;
                }
            }
        }

        System.out.println("Sorted prices:");
        for (double price : prices)
            System.out.print(price + " ");
    }
}
