package com.dam1;

public class JugadorBasquet extends Jugador{
    private int punts;

    public JugadorBasquet() {
    }

    public JugadorBasquet(String nom, int dorsal) {
        super(nom, dorsal);
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public void anota(int punts) { this.punts += punts;}

    @Override
    public String toString() {
        return "JugadorBasquet{" +
                "nom='" + nom + '\'' +
                ", dorsal=" + dorsal +
                ", punts=" + punts +
                '}';
    }

}
