package org.example;


public class Main {
    public static void main(String[] args) {

        FibonacciAlgorithms fibonacciAlgorithms = new FibonacciAlgorithms();

        long iterative = fibonacciAlgorithms.iterative(15);
        long recursion = fibonacciAlgorithms.recursion(15);
        long dynamic = fibonacciAlgorithms.dynamic(15);

        System.out.println("iterative algorithm = " + iterative);
        System.out.println("recursion algorithm = " + recursion);
        System.out.println("dynamic algorithm = " + dynamic);
    }
}