import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of shares");
        int ArraySize = scan.nextInt();
        int[] prices = new int[ArraySize];
//        System.out.println("Please enter the stock price");
        for (int i = 0; i < ArraySize; i++) {
            System.out.println("Please enter the stock price");
            prices[i] = scan.nextInt();
        }

//        int prices[] = {7, 1, 5, 3, 4, 6, 2};
        System.out.println("Your highest possible profit is:" + Prices.maxProfit(prices));
    }
}
