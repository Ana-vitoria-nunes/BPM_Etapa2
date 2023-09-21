package org.example.Desafio1;

import java.util.*;
import java.util.stream.Collectors;

public class OrdenarNumeros {
    Scanner scanner = new Scanner(System.in);

    public void separarEOrdenarNumeros() {
        int num;
        do {
            try {
                System.out.println("Quantos números você deseja informar (entre 1 e 1000):");
                num = scanner.nextInt();
                if (num < 1 || num > 1000) {
                    System.out.println("Número fora dos limites. Por favor, insira um número entre 1 e 1000.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.nextLine();
                num = -1;
            }
        } while (num < 1 || num > 1000);

        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int numero;
            do {
                try {
                    System.out.println("Qual o " + (i + 1) + "º número positivo:");
                    numero = scanner.nextInt();
                    if (numero <= 0) {
                        System.out.println("Número não positivo. Por favor, insira um número positivo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                    scanner.nextLine();
                    numero = -1;
                }
            } while (numero <= 0);

            listaNumeros.add(numero);
        }

        var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println("Números pares em orde crescente");
        for (int par : pares) {
            System.out.println(par);
        }

        var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Números ímpares em orde decrescente");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}
