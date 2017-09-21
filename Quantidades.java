package com.pedropadilha.model;

public final class Quantidades {
    
    private int quantidadeAcido;
    private int quantidadeAgua;    
    
    public Quantidades() {
        gerarQuantidadeAcido();
    }
        
    public int getQuantidadeAcido() {
        return this.quantidadeAcido;
    }
    
    public int getQuantidadeAgua() {
        return this.quantidadeAgua;
    }

    public void gerarQuantidadeAcido() {
        this.quantidadeAcido = (int) (Math.random() * 50);
        calcularQuantidadeAgua();
    }
    
    private void calcularQuantidadeAgua() {
        this.quantidadeAgua = 7 * this.quantidadeAcido / 3;
    }
    
}
