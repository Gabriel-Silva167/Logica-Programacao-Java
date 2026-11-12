package Desafios;

import Anotações.SwitchCase;

import java.util.Scanner;

public class Desafio2 {

    /* Desafio 2 - O algoritmo da Vaga:
        Crie um programa com três variáveis booleanas:
        estudaBem
        linkedinAtualizado
        curriculoPronto

        Atribua true ou false para cada uma delas.
        Calcule a pontuação:
        Se estudaBem == true → +50
        Se linkedinAtualizado == true → +25
        Se curriculoPronto == true → +25
        Mostre a pontuação final:
        Se for 70 ou mais, mostrar que o aluno está bem encaminhado para conseguir vaga.
        Senão, mostrar que precisa se organizar melhor. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCandidato;
        boolean estudaBem, linkedinAtualizado, curriculoPronto;
        int pontuacao = 0;

        System.out.println("Qual o nome do candidato?");
        nomeCandidato = scanner.nextLine();

        System.out.println("O candidato " + nomeCandidato + " estuda bem? (true/false)");
        estudaBem = scanner.nextBoolean();

        System.out.println("O candidato " + nomeCandidato + " está com o linkedin atualizado? (true/false)");
        linkedinAtualizado = scanner.nextBoolean();

        System.out.println("O candidato " + nomeCandidato + " está com o currículo pronto? (true/false)");
        curriculoPronto = scanner.nextBoolean();

        if (estudaBem) pontuacao += 50;
        if (linkedinAtualizado) pontuacao += 25;
        if (curriculoPronto) pontuacao += 25;

        if (pontuacao >= 70){
            System.out.println("O " + nomeCandidato + "está bem encaminhado para conseguir vaga.");
        } else {
            System.out.println("O " + nomeCandidato + " precisa se organizar melhor.");
        }
    }
}
