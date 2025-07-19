package airportsystem;
public class Pilot extends Person {
protected String rank;

    public Pilot(String rank, String name, String personalId) {
        super(name, personalId);
        this.rank = rank;
    }

    public Pilot(String name, String personalId) {
        super(name, personalId);
    }

    @Override
    public void salary() {
        System.out.println("150000");    }
    
}
