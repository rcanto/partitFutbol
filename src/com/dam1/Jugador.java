package com.dam1;

public abstract class Jugador {
    protected String nom;
    protected int dorsal;

    public Jugador() {
    }

    public Jugador(String nom, int dorsal) {
        this.nom = nom;
        this.dorsal = dorsal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nom='" + nom + '\'' +
                ", dorsal=" + dorsal +
                '}';
    }
    public abstract void anota(int n);
}
