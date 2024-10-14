package exercicios.lista2;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        int resposta_usuario;
        String resposta_pergunta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja responder a pergunta 1 ou a pergunta 2?");
        resposta_usuario = scanner.nextInt();
        scanner.nextLine();

        switch (resposta_usuario){
            case 1 ->{
                System.out.println("Qual o maior planeta do sistema solar? \na) Marte \nb) Jupiter \nc) Saturno");
                resposta_pergunta = scanner.nextLine();
                if (resposta_pergunta.equalsIgnoreCase("b")){
                    System.out.println("Resposta certa!");
                }
                else {
                    System.out.println("Você errou :(");
                }
            }
            case 2 ->{
                System.out.println("Qual o planeta mais próximo do Sol? \na) Netuno \nb) Júpiter \nc) Mercúrio");
                resposta_pergunta = scanner.nextLine();
                if (resposta_pergunta.equalsIgnoreCase("c")){
                    System.out.println("Resposta certa!");
                }
                else {
                    System.out.println("Você errou :(");
                }
            }
        }
    }
}
