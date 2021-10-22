package zup.mentoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroEntrada = scanner.nextInt();

        //popula fatoriais
        ArrayList<Integer> fatorial = new ArrayList<>();
        fatorial.add(1);
        for(int i=1; i<=9; i++) {
            fatorial.add(i * fatorial.get(i-1));
        }


        int quantidadeMinimaNumeros=0;
        for (int i = 1; i<=9; i++) {
            if (fatorial.get(i)>numeroEntrada) {
                quantidadeMinimaNumeros = i-1;
                break;
            }
        }

        int menorQuantidadeNumeros = 0;
        for (int i = quantidadeMinimaNumeros; i >= 0; i--) {
            menorQuantidadeNumeros += (numeroEntrada/fatorial.get(i));
            numeroEntrada = numeroEntrada%fatorial.get(i);
            if(numeroEntrada == 0) break;
        }

        System.out.println("Menor número: " + menorQuantidadeNumeros);

    }
}
