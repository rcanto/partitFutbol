package com.dam1;

public class Futbolista {
    private String nom;
    private int dorsal;
    private int gols;

    public Futbolista() {
    }

    public Futbolista(String nom, int dorsal) {
        this.nom = nom;
        this.dorsal = dorsal;
    }

    public Futbolista(String nom, int dorsal, int gols) {
        this.nom = nom;
        this.dorsal = dorsal;
        this.gols = gols;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nom='" + nom + '\'' +
                ", gols=" + gols +
                ", dorsal=" + dorsal +
                '}';
    }

    public void marcaGol() { gols++; }
}
