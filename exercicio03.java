package exercicios.lista2;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        int qtd_timeA, qtd_timeB;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de gols do time A: ");
        qtd_timeA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a quantidade de gols do time B: ");
        qtd_timeB = scanner.nextInt();
        scanner.nextLine();

        if (qtd_timeA == qtd_timeB){
            System.out.println("Deu empate!");
        }
        else if (qtd_timeA > qtd_timeB){
            System.out.println("Time A ganhou!");
        }
        else{
            System.out.println("Time B ganhou!");
        }
    }
}
