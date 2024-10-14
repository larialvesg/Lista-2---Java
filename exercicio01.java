package exercicios.lista2;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        if (idade <= 14 && idade >= 0){
            System.out.println("Você é uma criança!");
        }
        else if (idade >= 15 && idade <= 17){
            System.out.println("Você é um adolescente!");
        }
        else if (idade >= 18 && idade <= 30){
            System.out.println("Você é um adulto jovem!");
        }
        else{
            System.out.println("Você é um adulto!");
        }
        scanner.close();
    }
}
