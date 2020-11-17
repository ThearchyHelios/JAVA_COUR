package cposemestre1tp2yilunjiang;

public class Produit {
    private String designation;
    private String reference;
    private double prix;


    public Produit(String designation, String reference) {
        this.designation = designation;
        this.reference = reference;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produit{");
        sb.append("designation='").append(designation).append('\'');
        sb.append(", reference='").append(reference).append('\'');
        sb.append(", prix=").append(prix);
        sb.append('}');
        return sb.toString();
    }
}
