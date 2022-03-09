package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class CalculoDeFrete {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        Integer valorComFrete = 7;
        Double resultado = valorProduto + valorComFrete;
        System.out.print("O valor do produto com  o frete é: " + resultado);
        scanner.close();
    }
}
