package org.desafios;

import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        final int limiteVelocidade = 80;
        final int limiteMultas = 3;

        int totalMultas = multas;

        String mensagemPontos;

        if (velocidade > limiteVelocidade) {
            totalMultas = totalMultas + 1;
        }

        if (totalMultas >= limiteMultas) {
            mensagemPontos = "Levou pontos na carteira";
        } else {
            mensagemPontos = "Nao levou pontos na carteira";
        }

        System.out.println(totalMultas + " multas. " + mensagemPontos);

        leitor.close();
    }
}