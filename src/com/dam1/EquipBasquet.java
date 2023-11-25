package com.dam1;

import java.util.Arrays;

public class EquipBasquet {
    private String nom;
    public JugadorBasquet base;
    private JugadorBasquet[] alers;
    private JugadorBasquet[] pivots;

    public EquipBasquet() {
    }
    public EquipBasquet(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public JugadorBasquet getBase() {
        return base;
    }

    public void setBase(JugadorBasquet base) {
        this.base = base;
    }

    public JugadorBasquet[] getAlers() {
        return alers;
    }

    public void setAlers(JugadorBasquet[] alers) {
        this.alers = alers;
    }

    public JugadorBasquet[] getPivots() {
        return pivots;
    }

    public void setPivots(JugadorBasquet[] pivots) {
        this.pivots = pivots;
    }

    public JugadorBasquet getJugadorBasquet(int num)
    {
        // 4 base, 5 i 6 alers, 7 i 8 pivots
        switch (num)
        {
            case 4: return base;
            case 5:
            case 6:return alers[num-5];
            case 7:
            case 8:return pivots[num-7];
        }
        return null;
    }
}
