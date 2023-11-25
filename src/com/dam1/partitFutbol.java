package com.dam1;

public class partitFutbol {
    private static EquipFutbol eq1;
    private static EquipFutbol eq2;
    private static int gols1,gols2;

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        final int TEMPS_ENTRE_GOLS = 30;
        int tempsPartit = 0, tempsGol,equipGoletjador;

        gols1=gols2=0;
        eq1 = new EquipFutbol("Itàlia");
        eq2 = new EquipFutbol("Alemanya");

        eq1.setPorter(new Futbolista("Dino Zoff",1));
        Futbolista defensa[] = {new Futbolista("Bergomi",2), new Futbolista("Scirea",3), new Futbolista("Gentile",4), new Futbolista("Cabrini",5)};
        eq1.setDefenses(defensa);
        Futbolista migcamp[] = {new Futbolista("Collovati",6), new Futbolista("Oriali",7), new Futbolista("Tardelli",8), new Futbolista("Conti",9)};
        eq1.setMigcampistes(migcamp);
        Futbolista davantera[] = {new Futbolista("Graziani",10), new Futbolista("Rossi",11)};
        eq1.setDavanters(davantera);

        eq2.setPorter(new Futbolista("Schumacher",1));
        Futbolista defensa2[] = {new Futbolista("Kaltz",2), new Futbolista("K. Forster",3), new Futbolista("B. Forster",4), new Futbolista("Breitner",5)};
        eq2.setDefenses(defensa2);
        Futbolista migcamp2[] = {new Futbolista("Stielike",6), new Futbolista("Littbarski",7), new Futbolista("Dremmler",8), new Futbolista("Briegel",9)};
        eq2.setMigcampistes(migcamp2);
        Futbolista davantera2[] = {new Futbolista("Fischer",10), new Futbolista("Rumenigge",11)};
        eq2.setDavanters(davantera2);

        System.out.println("Comença el partit entre " + eq1.getNom() + " i " + eq2.getNom() + " ...");
        while (true)
        {
            Thread.sleep(3000);
            tempsGol = (int) (2*TEMPS_ENTRE_GOLS*Math.random());
            tempsPartit += tempsGol;
            if(tempsPartit > 90)
                break;
            equipGoletjador = 1 + (int) (2*Math.random());
            Futbolista f = anotaGol(equipGoletjador);
            System.out.println("MARCADOR ACTUAL al minut " + tempsPartit + ": " + "\n\t" + eq1.getNom() + ": " + gols1 + "\n\t"
                    + eq2.getNom() + ": " + gols2 );
            System.out.println("Gol marcat per " + f.getNom());
        }
        System.out.println("Fi del partit");
    }

    public static Futbolista anotaGol(int equip)
    {
        int golejador = (int) (2 + 10*Math.random());
        Futbolista f;
        if (equip == 1)
        {
            f = eq1.getFutbolista(golejador);
            gols1++;
        }
        else
        {
            f = eq2.getFutbolista(golejador);
            gols2++;
        }
        f.anota(1);
        return f;
    }
}
