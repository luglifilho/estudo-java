package exercicios;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qntNumeros;
        int count = 0;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de números: ");
        qntNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0)
                pares++;
            else
                impares++;
            count++;

        } while (count < qntNumeros);

        System.out.println("Números Pares: " + pares);
        System.out.println("Números Impares: " + impares);

    }

}
