package exercicios.lista2;
import java.util.Random;
import java.util.Scanner;


public class exercicio06 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero_sorteado = random.nextInt(100);
        System.out.println(numero_sorteado);
        int chute_pessoa;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("O computador gerou um número aleatório, tente acertar! \nVocê tem 3 tentativas. \nDigite um número: ");

       while (contador < 3){

           chute_pessoa = scanner.nextInt();
           scanner.nextLine();

           if (chute_pessoa == numero_sorteado){
               System.out.printf("Você acertou!!! O número era %d",numero_sorteado);
               break;
           }
           else if (contador == 2){
               System.out.println("Suas tentativas acabaram");
               break;
           }
           else{
               System.out.println("Você não acertou, tente novamente");
               contador ++;
           }
       }
    scanner.close();
        }
    }

