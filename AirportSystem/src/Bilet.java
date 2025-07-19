package airportsystem;
public class Bilet implements Invoice {
    protected String biletId;
    protected int biletPrice;
    protected Traveller traveller;
    protected Flying flying;

    public Bilet(String biletId, int biletPrice, Traveller traveller,Flying flying) {
        this.biletId = biletId;
        this.biletPrice = biletPrice;
        this.traveller = traveller;
        this.flying=flying;
    }
    
    public void createBilet(){
        System.out.println("bilet created.");
        
    }
    public void cancelBilet(){
        System.out.println("bilet cancelled.");
    }

    @Override
    public void writeable() {
        System.out.println("travel info: "+traveller+"BİLET ID: "+biletId+"bilet price: "+biletPrice);
    }
}
