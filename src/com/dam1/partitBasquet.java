package com.dam1;

public class partitBasquet {
    private static EquipBasquet eq1;
    private static EquipBasquet eq2;
    private static int punts1, punts2;

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        final int TEMPS_ENTRE_CISTELLA = 30;    // 30 segons
        int tempsPartit = 0, tempsAnotacio,equipAnotador;

        punts1 = punts2 =0;
        eq1 = new EquipBasquet("L.A. Lakers");
        eq2 = new EquipBasquet("Celtics Boston");

        eq1.setBase(new JugadorBasquet("Danny Ainge",4));
        JugadorBasquet alers[] = {new JugadorBasquet("Kevin McHale",5), new JugadorBasquet("Larry Bird",6)};
        eq1.setAlers(alers);
        JugadorBasquet pivots[] = { new JugadorBasquet("Dennis Johnson",7), new JugadorBasquet("Robert Parish",8)};
        eq1.setPivots(pivots);

        eq2.setBase(new JugadorBasquet("Magic Johnson",4));
        JugadorBasquet alers2[] = {new JugadorBasquet("Byron Scott",5), new JugadorBasquet("James Worthy",6)};
        eq2.setAlers(alers2);
        JugadorBasquet pivots2[] = { new JugadorBasquet("Kareem Abdul Jabbar",7), new JugadorBasquet("A.C. Green",8)};
        eq2.setPivots(pivots2);

        System.out.println("Comença el partit entre " + eq1.getNom() + " i " + eq2.getNom() + " ...");
        while (true)
        {
            Thread.sleep(2000);
            tempsAnotacio = (int) (2*TEMPS_ENTRE_CISTELLA*Math.random());
            tempsPartit += tempsAnotacio;
            if(tempsPartit > 2400)  // 40 minuts = 2400 segons
                break;
            equipAnotador = 1 + (int) (2*Math.random());
            JugadorBasquet jb = anota(equipAnotador);
            System.out.println("MARCADOR ACTUAL al minut " + (tempsPartit/60) + ":" + (tempsPartit%60) + "\n\t" + eq1.getNom() + ": " + punts1 + "\n\t"
                    + eq2.getNom() + ": " + punts2);
            System.out.println("Punts marcats per " + jb.getNom());
        }
        System.out.println("Fi del partit");
    }

    public static JugadorBasquet anota(int equip)
    {
        JugadorBasquet jb;

        int anotador = (int) (4 + 5*Math.random());
        // FEM QUE 1 PUNT SIGA EL 25% DE PROBABLE, 2 PUNTS EL 50% I 3 PUNTS EL 25%
        int punts = (int)(1 + 4*Math.random());
        if (punts > 2) punts--;

        if (equip == 1)
        {
            jb = eq1.getJugadorBasquet(anotador);
            punts1 += punts;
        }
        else
        {
            jb = eq2.getJugadorBasquet(anotador);
            punts2 += punts;
        }
        jb.anota(punts);

        return jb;
    }
}
