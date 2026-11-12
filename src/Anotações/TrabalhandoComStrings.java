package Anotações;

public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String nome2 = "Riquelme";
        String sobrenome = "Silva";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nome2);
        String nomeCompleto = nome.concat(" " + sobrenome);

        System.out.println("Olá, " + nome + "! Seu nome tem " + tamanhoString + " caracteres.");
        System.out.println("Os nomes " + nome.toUpperCase() + " e " + nome2.toLowerCase() + " são iguais : " +saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
