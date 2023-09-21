package org.example.Desafio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("\nDigite um número para calcular o Fibonacci: ");
                int n = scanner.nextInt();
                System.out.println("Fib = " + fibonacci.mostrarFibonacciNumero(n));
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }
    }
}
