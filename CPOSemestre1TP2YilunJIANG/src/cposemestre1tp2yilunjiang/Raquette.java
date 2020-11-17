package cposemestre1tp2yilunjiang;

public class Raquette extends Produit {
    private String soprt;
    private String materiau;

    public Raquette(String designation, String reference, String soprt, String materiau) {
        super(designation, reference);
        this.soprt = soprt;
        this.materiau = materiau;
    }

}
