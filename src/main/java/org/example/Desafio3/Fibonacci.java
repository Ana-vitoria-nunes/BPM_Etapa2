package org.example.Desafio3;

public class Fibonacci {

    public long  mostrarFibonacciNumero(int num){
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            long fib1 = 0;
            long fib2 = 1;
            long fibAtual = 0;

            for (int i = 2; i <= num; i++) {
                fibAtual = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibAtual;
            }

            return fibAtual;
        }
    }
}
