class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int s=prices[0],p=0;
        for(int i=0;i<n;i++){
            if(prices[i]<s){
                s=prices[i];
            }
            int rp=prices[i]-s;
            if(rp>p){
                p=rp;
            }

        }
        return p;
    }
}
