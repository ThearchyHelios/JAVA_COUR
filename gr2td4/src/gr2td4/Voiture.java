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
public abstract class Voiture {
    private String marque;
    private String modele;

    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public abstract int getNbKmsEntreChaqueRevision();
}
