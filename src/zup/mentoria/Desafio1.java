package zup.mentoria;

import java.util.Scanner;

public class Desafio1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacidadeCabine = scanner.nextInt();
        int quantidadeTotalAlunos = scanner.nextInt();

        int quantidadeMonitores = quantidadeTotalAlunos / (capacidadeCabine-1);
        double numeroMinimoViagens = Math.ceil((1.0) * (quantidadeTotalAlunos + quantidadeMonitores) / capacidadeCabine);

        System.out.println((int) numeroMinimoViagens);
    }
}
