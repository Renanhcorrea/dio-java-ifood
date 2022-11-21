package src.src.Desafio;

import java.util.Scanner;

public class Recursiva {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numeroUm = input.nextInt();

        System.out.println(somatorio(numeroUm));
    }

    static int somatorio (int numero){
        if (numero == 0 ){
            return 0;
        } else {
            return numero + somatorio((numero-1));
        }
    }
}
