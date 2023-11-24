package com.dam1;

import java.util.Arrays;

public class EquipFutbol {
    private String nom;
    private Futbolista porter;
    private Futbolista[] defenses;
    private Futbolista[] migcampistes;
    private Futbolista[] davanters;

    public EquipFutbol() {
        //porter = new Futbolista();
        //defenses = new Futbolista[4];
        //migcampistes = new Futbolista[4];
        //davanters = new Futbolista[2];
    }
    public EquipFutbol(String nom) {
        this.nom = nom;
        //porter = new Futbolista();
        //defenses = new Futbolista[4];
        //migcampistes = new Futbolista[4];
        //davanters = new Futbolista[2];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Futbolista getPorter() {
        return porter;
    }

    public void setPorter(Futbolista porter) {
        this.porter = porter;
    }

    public Futbolista[] getDefenses() {
        return defenses;
    }

    public void setDefenses(Futbolista[] defenses) {
        this.defenses = defenses;
    }

    public Futbolista[] getMigcampistes() {
        return migcampistes;
    }

    public void setMigcampistes(Futbolista[] migcampistes) {
        this.migcampistes = migcampistes;
    }

    public Futbolista[] getDavanters() {
        return davanters;
    }

    public void setDavanters(Futbolista[] davanters) {
        this.davanters = davanters;
    }

    @Override
    public String toString() {
        return "EquipFutbol{" +
                "nom='" + nom + '\'' +
                ", porter=" + porter +
                ", defenses=" + Arrays.toString(defenses) +
                ", migcampistes=" + Arrays.toString(migcampistes) +
                ", davanters=" + Arrays.toString(davanters) +
                '}';
    }

    public Futbolista getFutbolista(int num)
    {
        switch (num)
        {
            case 1: return porter;
            case 2:
            case 3:
            case 4:
            case 5: return defenses[num-2];
            case 6:
            case 7:
            case 8:
            case 9: return migcampistes[num-6];
            case 10:
            case 11: return davanters[num-10];
        }
        return null;
    }
}
