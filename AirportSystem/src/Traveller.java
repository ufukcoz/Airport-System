package airportsystem;
public class Traveller {
   String name;
    private int seatNumber;
    private String Id;
   
    
public Traveller(String name, int seatNumber, String Id) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.Id = Id;
    }
    public String gettName() {
        return name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getId() {
        return Id;
    }

    public void settName(String name) {
        this.name = name;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    
}
