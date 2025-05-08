public class Employe extends Personne{
    public String poste;
    int salaire;
    int nbr_heures;

    public Employe(String n, String p,String c,String nat,String g,String poste,int sal,int nbr_h) {
        super(n,p,c,nat,g);
        this.poste=poste;
        this.salaire=sal;
        this.nbr_heures=nbr_h;
    }
}
