package exercicios;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite a Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Invalida, Digite novamente: ");
            nota = scan.nextInt();

        }

    }

}
