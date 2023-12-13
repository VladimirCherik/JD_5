package org.example;

import java.util.HashMap;
import java.util.Map;

/*
iterative:
Просторова складність: O(1)
Часова складність: O(n)

recursion:
Просторова складність: O(n)
Часова складність: O(2^n) (експоненційна)

dynamic:
Просторова складність: O(n) (мемоізація зменшує кількість рекурсій в стеку)
Часова складність: O(n) (лінійна складность досягається при повторному використанні методу)
*/
public class FibonacciAlgorithms {
    private Map<Integer, Long> memory = new HashMap<>();

    public long iterative(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0;
        long current = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
    public long recursion(int n) {
        if (n <= 1) {
            return n;
        }
        return recursion(n - 1) + recursion(n - 2);
    }
    public long dynamic(int n) {
        if (n <= 1) {
            return n;
        }
        if (memory.containsKey(n)) {
            return memory.get(n);
        }
        long fib = dynamic(n - 1) + dynamic(n - 2);
        memory.put(n, fib);
        return fib;
    }
}
