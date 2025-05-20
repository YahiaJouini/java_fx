public class Groupe {
    private String departement,nom,option;
    private int niveau;

    @Override
    public String toString() {
        if(niveau==1)
            return "L" + niveau+"-" + departement+nom;
        return "L" + niveau+"-" + option+nom;
    }

    public Groupe(String departement, String nom, String option, int niveau) {
        this.departement = departement;
        this.nom = nom;
        this.option = option;
        this.niveau = niveau;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }


}