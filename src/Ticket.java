import java.util.Date;

public class Ticket {
    static int id ;
    Date date_dAchat;
    double prix;
    Vol vol;

    public Ticket(Vol vol,double prix) {
        this.id++;
        this.vol = vol;
        this.date_dAchat=new Date();
        this.prix=prix;
    }

}
