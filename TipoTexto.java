package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class TipoTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");

        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "! Como voce esta? ");
        String resposta = scanner.nextLine();

        System.out.println("Que bom.");

        scanner.close();

    }
}
