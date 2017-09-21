package com.pedropadilha.app;

import com.pedropadilha.model.Jogo;
import com.pedropadilha.model.Quantidades;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new java.util.Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.apresentar();

        while (jogo.getVidas() > 0) {
            Quantidades quantidades = new Quantidades();
            double quantidadeAcido = quantidades.getQuantidadeAcido();
            System.out.print(quantidadeAcido + " liters of kryptocyanic acid. How much water: ");
            double aguaSugerida = s.nextDouble();
            double d = Math.abs(quantidades.getQuantidadeAgua() - aguaSugerida);
            if (d > aguaSugerida / 20) {
                jogo.morreu();
            } else {
                jogo.textoGanhou();
            }
        }
        jogo.textoPerdeu();
        

    }

}
