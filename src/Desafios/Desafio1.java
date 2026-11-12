package Desafios;

import java.util.Scanner;

public class Desafio1 {
    /*  Desafio 1 – Você se tornará um programador contratado?

        Crie um programa que leia se o aluno estudou bancos de dados, Spring, APIs REST e
        se fez projetos usando arquitetura de Microsserviços.
        Se estudou tudo (true para todas as perguntas), mostrar mensagem dizendo que
        consegue vaga.
        Caso contrário, mostrar mensagem dizendo que ainda não consegue. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String course;

        boolean database, spring, apisRest, projectMicroServiceArquitecture;

        System.out.println("Bom dia!");
        System.out.println("Esse questionário irá servir para avaliar se você possui todas as competências para ser contratado como programador.");
        System.out.println("");
        System.out.println("Qual o seu nome?");
        name = scanner.nextLine();

        System.out.println("Qual a sua idade " + name + "?");
        age = scanner.nextInt();

        System.out.println("você é formado em que curso?");
        course = scanner.nextLine();

        System.out.println("Preciso que responda as próximas perguntas com (true) para sim e (false) para não.");
        System.out.println("Você já estudou banco de dados?");
        database = scanner.nextBoolean();

        System.out.println("Você já estudou Spring?");
        spring = scanner.nextBoolean();

        System.out.println("Você já estudou APIs REST?");
        apisRest = scanner.nextBoolean();

        System.out.println("Você já fez projetos usando arquitetura de Microsserviços?");
        projectMicroServiceArquitecture = scanner.nextBoolean();

        if ( database && spring && apisRest && projectMicroServiceArquitecture ) {
            System.out.println("Parabéns " + name + ", você está totalmente qualificado e está contratado!");
        } else {
            System.out.println("Infelizmente você não atende os requisitos necessários para essa vaga.");
        }

    }
}
