package Leetcode;

import java.util.Scanner;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt(); 
        System.out.println(Subarray(arr, k));
        sc.close(); 
    }
    public static int Subarray(int[] arr, int k){
        int c = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
}
