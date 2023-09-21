package org.example.Desafio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimeZone;

public class ConverterTempo {
    Scanner scanner = new Scanner(System.in);

    public void convertendo() {
        try {
            System.out.println("Informe um valor para ser convertido para data: ");
            long segundos = scanner.nextLong();

            long millis = segundos * 1000;

            Date date = new Date(millis);
            SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            dataFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            System.out.println(dataFormat.format(date));
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
