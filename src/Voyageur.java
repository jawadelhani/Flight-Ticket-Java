import java.util.Date;

public class Voyageur extends Personne {
    String passport;
    int bagages;
    Ticket ticket_aller;

    public Voyageur(String n, String p,String c,String nat,String g,String pas,int bag,Ticket tikA) {
        super(n,p,c,nat,g);
        this.passport=p;
        this.bagages=bag;
        this.ticket_aller=tikA;
    }
    public String getPassport() {
        return this.passport;
    }

    public int getbagages() {
        return this.bagages;
    }

    public Ticket getTicket_aller() {
        return this.ticket_aller;
    }

    @Override
    public String toString() {

        return super.toString()+" "+this.passport+" "+this.bagages+" "+this.ticket_aller;
    }

    public String etatVoyageur() {
        Vol vol = this.ticket_aller.vol;
        Date dateD = vol.dateDep ;
        Date dateA = vol.dateArrive;
        Date dateN = new Date();
        if (dateN.before(dateD)) {
            return "Pas encore" ;
        }else if (dateN.after(dateA)) {
            return "Arrivé";
        } else if (dateN.after(dateD) & dateN.before(dateA)) {
            return "En voyage";
        }
        return null ;
    }

    public void ajouterBagages(int b){
        this.bagages+=b;
    }

}

