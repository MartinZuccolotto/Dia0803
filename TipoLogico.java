package com.company.variaveis_e_constantes_3;

public class TipoLogico {

    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        System.out.println("--------------------------------------------------");

        Integer idade = 18;

        Boolean podeTirarCarteira = idade >= 18;

       // System.out.println(" Pode tirar a carteira? " + podeTirarCarteira);

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar carteira. ");
        }
        else {
            System.out.println("Nao! Ele(a) nao pode tirar a carteira. ");
        }
    }
}