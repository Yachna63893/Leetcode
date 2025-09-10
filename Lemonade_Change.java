package Leetcode;

import java.util.Scanner;

public class Lemonade_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = new int[n];
        for(int i=0; i<bills.length; i++){
            bills[i] = sc.nextInt();
        }
        System.out.println(Lemonade(bills));
        sc.close();
    }
    public static boolean Lemonade(int[] bills){
        int five = 0;
        int ten = 0;
        for(int i=0; i<bills.length; i++){
            int bill = bills[i];
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five = five - 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
