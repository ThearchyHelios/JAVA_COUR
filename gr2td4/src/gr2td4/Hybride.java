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
public class Hybride extends Voiture {
    private boolean recharcheable;

    public Hybride(boolean recharcheable, String marque, String modele) {
        super(marque, modele);
        this.recharcheable = recharcheable;
    }

    public boolean isRecharcheable() {
        return recharcheable;
    }

    @Override
    public int getNbKmsEntreChaqueRevision() {
        if (getMarque().equals("Porsche")&&recharcheable)
            return 45000;
        else
        return 25000;
    }

}
