package Leetcode;

import java.util.Scanner;

public class Broken_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startval = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(Cal(startval, target));
        sc.close();
    }
    public static int Cal(int startval, int target){
        int steps = 0;
        while(target>startval){
            if(target%2==0){
                target = target/2;
            }else{
                target += 1;
            }
            steps++;
        }
        return steps+(startval-target);
    }
}
