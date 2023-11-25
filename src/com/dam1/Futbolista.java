package com.dam1;

public class Futbolista extends Jugador {

    private int gols;

    public Futbolista() {
    }

    public Futbolista(String nom, int dorsal) {
        super(nom,dorsal);
    }

    public Futbolista(String nom, int dorsal, int gols) {
        super(nom,dorsal);
        this.gols = gols;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }
    @Override
    public String toString() {
        return "Futbolista{" +
                "nom='" + nom + '\'' +
                ", gols=" + gols +
                ", dorsal=" + dorsal +
                '}';
    }

    public void anota(int n) { gols++; }
}
