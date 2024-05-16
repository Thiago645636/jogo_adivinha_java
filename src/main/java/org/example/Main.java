package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;



      System.out.println("#############################");
      System.out.println("##   Jogo da Adivinhação   ##");
      System.out.println("#############################");
      System.out.println("Regras do Jogo");
      System.out.println("1- vou pensar em um numero");
      System.out.println("2- voce tenta adivinhar qual numero estou pensando");
      System.out.println("3- te informo se acertou ou não");
      System.out.println("Esta pronto para jogar? (s/n)");
      pronto = leitura.next();


      switch(pronto){
            case "s":
                resposta = 6;
                System.out.println("QUAL NUMERO ENTRE 0 E 10 ESTOU PENSANDO?");
                tentativa = leitura.nextInt();
                if(tentativa == resposta){
                    System.out.println("parabens, voce acertou!");
                }else{
                    System.out.println("que pena, voce errou!");
                }
                break;
            case "n":
                System.out.println("Até mais, Então.");
                break;
            default:
                System.out.println("opção inválida!");
        }














    }
}