package airportsystem;
public class Hostes extends Person {
protected int cabinNumber;

    public Hostes(int cabinNumber, String name, String personalId) {
        super(name, personalId);
        this.cabinNumber = cabinNumber;
    }

    public Hostes(String name, String personalId) {
        super(name, personalId);
    }

    @Override
    public void salary() {
        System.out.println("900000");  
    }
    
}
