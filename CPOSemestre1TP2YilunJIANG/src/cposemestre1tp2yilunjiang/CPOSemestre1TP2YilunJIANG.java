/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cposemestre1tp2yilunjiang;

import java.util.Arrays;

/**
 * @author yilunjiang
 */
public class CPOSemestre1TP2YilunJIANG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Raquette r1 = new Raquette("Federer Replica", "RF1", "Tennis", "Carbonne");
        Raquette r2 = new Raquette("Nadal Replica", "Nad1", "Tennis", "Aluminium");
        Raquette r3 = new Raquette("Lee Replica", "Lee1", "Tennis", "Carbonne");
        ClubDeGolf c1 = new ClubDeGolf("Woods replica", "Wo1", true);

        //Creation du Tableau
        // TODO Git
        //Rangement des produits dans le tableau

        Produit []tab = new Produit[4];
        tab[0] = r1;
        tab[1] = r2;
        tab[2] = r3;
        tab[3] = c1;
        
        
    }

}
