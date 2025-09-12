package Leetcode;

public class Coin_Comb {
    static int minCoins = Integer.MAX_VALUE; 

    public static void main(String[] args) {
        int[] coin = {1,2,3};
        int amt = 8;
        Combination(coin, amt, 0, 0);
        if(minCoins == Integer.MAX_VALUE) {
            System.out.println(-1); 
        } else {
            System.out.println(minCoins);
        }
    }

    public static void Combination(int[] coin, int amt, int count, int idx){
        if(amt == 0){
            minCoins = Math.min(minCoins, count); 
            return;
        }

        for(int i = idx; i < coin.length; i++){
            if(amt >= coin[i]){
                Combination(coin, amt - coin[i], count + 1, i); 
            }
        }
    }
}
