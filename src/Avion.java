public class Avion implements MoyenDeTransport{
    int num_serie;
    int nbr_place;
    int nbr_place_dispo;
    boolean businessClass ;

    public Avion(int nums,int nump,	int nbrp , int nbrpd ) {
        this.num_serie = nums;
        this.nbr_place = nbrp;
        this.nbr_place_dispo = nbrpd;
    }

    public void réservation(){
        this.nbr_place_dispo--;
    }

    public void annulation(){
        this.nbr_place_dispo++;
    }

    @Override
    public void natureCarburant() {
        System.out.println("Fuel");
    }

    @Override
    public void vitesseMoyen() {
        System.out.println("900Km/h");
    }

    @Override
    public void nbrMoteur(){
        System.out.println("4 Moteurs");
    }
}
