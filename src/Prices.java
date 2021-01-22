public class Prices {

    public static int  maxProfit(int[] prices) {
        int buy = prices[0];
        int curPrice = 0;
        int maxPrice = 0;

        for(int i = 0 ; i < prices.length; i++){
            int sell = prices[i];
            if(buy > sell){
                buy = sell;
            }
            curPrice = sell - buy;
            maxPrice = Math.max(maxPrice, curPrice);
        }
        return maxPrice;
    }
}
