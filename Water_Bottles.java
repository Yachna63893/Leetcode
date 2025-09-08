package Leetcode;

import java.util.Scanner;

public class Water_Bottles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottles = sc.nextInt();
        int exchange = sc.nextInt();
        System.out.println(Water(bottles, exchange));
        sc.close();
    }
    public static int Water(int bottles, int exchange){
        int drank = bottles;
        int empty = bottles;
        while(empty>=exchange){
            int newempty = empty/exchange;
            drank += newempty;
            empty = empty % exchange + newempty;
        }
        return drank;
    }
}