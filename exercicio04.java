package exercicios.lista2;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        int opcao, opcao_refeicao;
        double valor_viagem;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o destino das suas férias: \n[1] Maceió \n[2] Porto de Galinhas");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1 -> {
                System.out.println("Você deseja almoço/janta incluso? \n[1] Sim \n[2] Não");
                opcao_refeicao = scanner.nextInt();
                scanner.nextLine();
                if (opcao_refeicao == 1) {
                    valor_viagem = 3000 + 3000;
                    System.out.printf("Sua viagem ficou no valor de R$ %.2f", valor_viagem);

                } else {
                    valor_viagem = 3000 + 2550;
                    System.out.printf("Sua viagem ficou no valor de R$ %.2f", valor_viagem);
                }
            }
            case 2 -> {
                System.out.println("Você deseja almoço/janta incluso? \n[1] Sim \n[2] Não");
                opcao_refeicao = scanner.nextInt();
                scanner.nextLine();
                if (opcao_refeicao == 1) {
                    valor_viagem = 3000 + 1800;
                    System.out.printf("Sua viagem ficou no valor de R$ %.2f", valor_viagem);

                } else {
                    valor_viagem = 3000 + 1350;
                    System.out.printf("Sua viagem ficou no valor de R$ %.2f", valor_viagem);
                }
            }


        }

    }
}
