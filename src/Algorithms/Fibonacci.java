package Algorithms;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(naiveFibonacci(2));
        System.out.println(naiveFibonacci(5));
        System.out.println(betterFibonacci(100));
    }

    // рекурсивный способ (наивный), вычисляет 50000 лет сотое число фибоначчи
    private static long naiveFibonacci(int n) {
        if(n <= 1) return n;
        return naiveFibonacci(n - 1) + naiveFibonacci(n - 2);
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
