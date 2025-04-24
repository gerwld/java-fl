package Algorithms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(naiveFibonacci(2));
        System.out.println(naiveFibonacci(5));
        System.out.println(betterFibonacci(100));

        int n = 100;
        long [] mem = new long[n + 1];
        Arrays.fill(mem, -1);

        System.out.println(secFibonacci(n, mem));
    }

    // рекурсивный способ (наивный), вычисляет 50000 лет сотое число фибоначчи
    private static long naiveFibonacci(int n) {
        if(n <= 1) return n;
        return naiveFibonacci(n - 1) + naiveFibonacci(n - 2);
    }
    // рекурсия с мемоизацией, получше
    private static long secFibonacci(int n, long [] mem) {
        if(mem[n] != -1) {
            return mem[n];
        }
        if(n <= 1) return n;
        long result = secFibonacci(n - 1, mem) + secFibonacci(n - 2, mem);
        mem[n] = result;
        return result;
    }

    private static long betterFibonacci(int n) {
        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
