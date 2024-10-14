package exercicios.lista2;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        double valor_produto;
        int qtd_produto;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor unitário do seu produto: ");
        valor_produto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a quantidade que você deseja: ");
        qtd_produto = scanner.nextInt();
        scanner.nextLine();

        if (qtd_produto > 12){
            resultado = (qtd_produto * valor_produto) - (valor_produto / 10);
            System.out.printf("O valor total da compra é %.2f", resultado);
        }
        else{
            resultado = qtd_produto * valor_produto;
            System.out.printf("O valor total da compra é %.2f", resultado);
        }
    }
}
