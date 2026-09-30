class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        //[7,1,5,3,6,4]
        for (int i=0; i < prices.length; i++) {
            min = Math.min(min, prices[i]); //7, 1 , 1, 1, 1 , 1
            max = Math.max(max, prices[i] - min); // 0, 0, 4, 4, 5, 5
        }

        return max;
        
    }
}
