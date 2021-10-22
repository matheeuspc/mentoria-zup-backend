package zup.mentoria;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notaPrimeiraProva = scanner.nextInt();
        int mediaNotasProvas = scanner.nextInt();
        int notaSegundaProva = (mediaNotasProvas*2) - notaPrimeiraProva;

        System.out.println(notaSegundaProva);
    }
}
