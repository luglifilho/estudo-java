package exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Inform um Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("A Soma total por enquanto é: " + soma);
            if (numero > maior)
                maior = numero;

            count++;

            System.out.println("O maior numero foi: " + maior);

        } while (count < 5);

        System.out.println("A média dos números é: " + soma / 5);

    }
}
