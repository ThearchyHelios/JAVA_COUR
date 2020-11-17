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
public class Electrique extends Voiture {
    private int autonomieMax;

    public Electrique(String marque, String modele, int autonomieMax) {
        super(marque, modele);
        this.autonomieMax = autonomieMax;
    }

    public int getAutonomieMaax() {
        return autonomieMax;
    }

    @Override
    public int getNbKmsEntreChaqueRevision() {
        return 100 * autonomieMax;
    }

}