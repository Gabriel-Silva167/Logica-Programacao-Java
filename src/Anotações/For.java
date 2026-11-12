package Anotações;

public class For {
    public static void main(String[] args) {
        /*for (int cont = 0; cont < 5; cont ++){
            System.out.println(cont);
        }*/

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i + " é par.");
            } else {
                System.out.println(i + " é ímpar.");
            }
        }
    }
}
