package org.example.Desafio3;

public class Fibonacci {

    public long  mostrarFibonacciNumero(int num){
        if (num < 2) {
            return num;
        } else {
            return mostrarFibonacciNumero(num - 1) + mostrarFibonacciNumero(num - 2);
        }
    }
}
