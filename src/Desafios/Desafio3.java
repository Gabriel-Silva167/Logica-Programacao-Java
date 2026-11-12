package Desafios;

import java.util.Scanner;

public class Desafio3 {
    /*   Desafio 3 -

         Crie um programa que pergunte ao usuário se ele já montou um currículo e Linkedin
         organizado para a área da programação.
         Se sim → parabenizar
         Se não → motivar dizendo que currículo bem feito pode até compensar pouca
         experiência.   */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        boolean curriculo, linkedin;

        System.out.println("Olá! tudo bem?");
        System.out.println("Qual o seu nome?");
        nome = scanner.nextLine();

        System.out.println("Você já montou um currículo " + nome + "? (true/false)");
        curriculo = scanner.nextBoolean();

        System.out.println("Você já organizou seu linkedin " + nome + "? (true/false)");
        linkedin = scanner.nextBoolean();

        if (curriculo && linkedin) {
            System.out.println("Parabéns " + nome + "! Você já deu um passo muito importante para construir sua carreira na programação. Um currículo bem estruturado e um LinkedIn organizado ajudam a destacar suas habilidades e abrir portas para novas oportunidades. Continue evoluindo!");
        } else if (curriculo || linkedin) {
            System.out.println("Já é um ótimo começo, " + nome + "! Você está no caminho certo. Agora, aproveite para organizar o outro também. Ter um currículo bem estruturado e um LinkedIn atualizado aumenta suas chances de chamar a atenção dos recrutadores. Continue dando esses passos rumo à sua carreira na programação!");
        } else {
            System.out.println("Não se preocupe " + nome + "! Nunca é tarde para começar. Um currículo bem elaborado e um LinkedIn organizado podem fazer toda a diferença, até mesmo quando você ainda tem pouca experiência profissional. Destaque seus conhecimentos, projetos e vontade de aprender. Sua próxima oportunidade pode começar por aí!");
        }
    }
}
