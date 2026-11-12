package Anotações;

import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {

        //System.out.println("Olá, eu faço impressão e pulo a linha");
        //System.out.print("Olá, eu faço a impressão na mesma linha");
        //System.out.printf("Olá, eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura : (Exemplo: 1,60)");
        double altura = scanner.nextDouble();
        System.out.println("Seu nome é " + name + ", você tem " + idade + " anos e " + altura + " metros de altura.");
    }
}
