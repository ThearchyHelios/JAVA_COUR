/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr2td4;

/**
 *
 * @author yilunjiang
 */
public class Gr2td4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture[] Tab = new Voiture[7];
        Tab[0] = new Electrique("Renaut", "Zoe", 300);

        Tab[1] = new Hybride(false, "Toyota", "Prius") {};
        Tab[2] = new Electrique("Nissan", "Leaf", 400);

        Tab[3] = new Hybride(true, "Porsche", "Cayenne");
        Tab[4] = new Hybride(false, "Kia", "Optima");
        Tab[5] = new Electrique("Peugeot", "Ion", 400);

        Tab[6] = new Hybride(false, "Porsche", "Panameraa");

        for (int i = 0; i < Tab.length; i++) {
            System.out.println(Tab[i].getMarque() + " " + Tab[i].getModele() + Tab[i].getNbKmsEntreChaqueRevision());
            if (Tab[i] instanceof Electrique) {
                Electrique temp = (Electrique) Tab[i];
                System.out.println(temp.getAutonomieMaax());

            }
            if (Tab[i] instanceof Hybride) {
                Hybride temp = (Hybride) Tab[i];
                System.out.println("Recharcheable?" + temp.isRecharcheable());

            }
        }
        IHMGarage ihm = new IHMGarage();
        ihm.setTableau(Tab);
        ihm.affichage();
        ihm.setVisible(true);
        
    }

}
