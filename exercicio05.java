package exercicios.lista2;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
    int qtd_atual_estoque, qtd_maxima_estoque, qtd_minima_estoque, qtd_media;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade atual do estoque: ");
    qtd_atual_estoque = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite a quantidade máxima do estoque: ");
    qtd_maxima_estoque = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite a quantidade mínima do estoque: ");
    qtd_minima_estoque = scanner.nextInt();
    scanner.nextLine();

    qtd_media = (qtd_maxima_estoque + qtd_minima_estoque) / 2;

    if (qtd_atual_estoque >= qtd_media){
        System.out.println("Não efetuar a compra");
    }
    else{
        System.out.println("Efetuar compra");
    }
    }
}
