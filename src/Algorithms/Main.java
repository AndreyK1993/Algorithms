package Algorithms;

public class Main {
    public static void main(String[] args) {

        double[] prices = {67.5, 34.75, 42.31, 42.55, 87.9, 27.84, 35.67};

        double sum = 0;

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
        // Виведення видсортованого масиву
        System.out.println("Sorted prices:");
        for (double price : prices) {
            System.out.print(price + ", ");
        }

        for (double price : prices) {

            sum += price;
        }
        double average = sum / prices.length;
        
        //Виведення середнього значення
        System.out.println("\nAverage sum: " + average);

    }
}
