package Leetcode;

import java.util.Scanner;

public class Super_Ugly_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] primes = new int[k];
        for (int i = 0; i < k; i++) {
            primes[i] = sc.nextInt();
        }

        int result = nthSuperUglyNumber(n, primes);
        System.out.println(result);

        sc.close();
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] ugly = new int[n];
        int[] pointers = new int[k];
        long[] candidates = new long[k]; 

        ugly[0] = 1;

        for (int i = 0; i < k; i++) {
            candidates[i] = primes[i];
        }

        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                next = Math.min(next, candidates[j]);
            }

            ugly[i] = (int) next; 
            for (int j = 0; j < k; j++) {
                if (candidates[j] == next) {
                    pointers[j]++;
                    candidates[j] = (long) ugly[pointers[j]] * primes[j];
                }
            }
        }
        return ugly[n - 1];
    }
}
