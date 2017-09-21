package com.pedropadilha.model;

public class Jogo {

    private int vidas = 9;

    public void apresentar() {
        System.out.println("Chemist \n"
                + "Creative computing morristown, New Jersey\n"
                + "The fictitious chemical kryptocyanic acid can only be diluted by the ratio is attempted, the acid becomes unstable\n"
                + "and soon explodes. Given the amount of acid, you must decide who much water to add for dilution.\n"
                + "If you miss, you face the consequences\n");
    }

    public void textoGanhou() {
        System.out.println("Good job! You may breathe now, but don't inhale the fumes...\n");
    }

    public void textoMorreu() {
        System.out.println("Sizzle! You have just been desalinated into a blob of quivering protoplask!\n"
                + "However, you may try again with another life. " + (vidas - 1) + " left.\n");
    }

    public void textoPerdeu() {
        System.out.println("\nYour 9 lives are used, but you will be long remembered for"
                + "your contributions to the field of comic book chemistry...");
    }

    public void morreu() {
        if (this.vidas > 1) {
            textoMorreu();
        }
        this.vidas--;
    }

    public int getVidas() {
        return this.vidas;
    }
}
