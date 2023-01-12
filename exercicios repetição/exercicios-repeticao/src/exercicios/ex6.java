package exercicios;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int multi = 1;

        System.out.println("Informe um número inteiro: ");
        numero = scan.nextInt();

        for (int i = numero; i >= 1; i--) {

            multi = multi * i;

        }
        System.out.println(numero + "!= " + multi);
    }

}
