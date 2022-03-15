package com.company.variaveis_e_constantes_3;
import java.util.Scanner;

public class Exerc0301 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do aluno(a): ");
        String nome = scanner.nextLine();
        System.out.println("---------------------------");

        System.out.println("Insira a nota do aluno(a): ");
        Double notaDoAluno = scanner.nextDouble();
        System.out.println("---------------------------");

        Boolean alunoAprovado = notaDoAluno > 70;
        if (alunoAprovado) {
            System.out.println("Parabéns, " + nome + ". Sua nota foi de: " + notaDoAluno + ". Voce está aprovado!");
        }
        else {
            System.out.println("Sinto muito, " + nome + ". Sua nota foi de: " + notaDoAluno + ". Infelizmente você reprovou.");
        }
        scanner.close();
    }
}