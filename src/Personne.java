public class Personne {
    private String nom;
    private String prenom;
    private String CIN ;
    private String nationalite;
    private String genre;

    public Personne(String n, String p,String c,String nat,String g){
        this.nom=n;
        this.prenom=p;
        this.CIN=c;
        this.nationalite=nat;
        this.genre=g;
    }
    public String getNom() {
        return this.nom;
    }

    public String getPrenomom() {
        return this.prenom;
    }

    public String getCIN() {
        return this.CIN;
    }

    public String getNationalite() {
        return this.nationalite;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString(){
        return this.nom + " " + this.prenom + " " + this.CIN + " " + this.nationalite + " " + this.genre;
    }
}
