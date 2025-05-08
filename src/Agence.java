import java.util.ArrayList;
import java.util.Date;
// creer un map contenant les voyageurs avec leurs vol

public class Agence {
    //ArrayList<Employe> list_employe= new ArrayList<Employe>();
    ArrayList<Vol> listVol= new ArrayList<Vol>();
    ArrayList<Ticket> listTicket= new ArrayList<Ticket>();

    public void creationTicket(Voyageur voyageur,Date dateDepart,String lieuDepart,String lieuArrivee){
        try{
            for(int i=0;i<listVol.size();i++){
                if(researchVol(listVol.get(i),dateDepart,lieuDepart,lieuArrivee)){
                    if (listVol.get(i).avion.nbr_place_dispo!=0){
                        Ticket ticket= new Ticket(listVol.get(i),prixTicket(listVol.get(i),voyageur.bagages));
                        voyageur.ticket_aller=ticket;
                        listVol.get(i).avion.réservation();
                        listTicket.add(ticket);
                        break;
                    }else{
                        System.out.println("Place non disponible");
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Erreur de creation");
        }
    }

    public void annulerTicket(Ticket ticket) throws ExceptionAnnulation{
        Date date1 = new Date();
        Date date2 = ticket.vol.dateDep;
        if(differenceInf24(date1,date2)){
            listTicket.remove(ticket);
            ticket = null;
            ticket.vol.avion.annulation();
        }else{
            throw new ExceptionAnnulation("Impossible d'annuler le ticket");
        }
    }

    private double prixTicket(Vol vol, int b){
    // prix/heure = 200 dh et prix bagages/kg=50 ;
        return vol.duree*200+b*50;
    }

    private static boolean differenceInf24(Date date1, Date date2) {
        long diffInMillis = Math.abs(date1.getTime() - date2.getTime());
        long diffInHours = diffInMillis / (1000 * 60 * 60);
        return diffInHours >= 24;
    }

    public boolean researchVol(Vol vol,Date dateDepart,String lieuDepart,String lieuArrivee){
        return vol.dateDep.equals(dateDepart) && vol.lieuDep.equals(lieuDepart) && vol.lieuArr.equals(lieuArrivee);
    }


}
