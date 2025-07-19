package airportsystem;
public class Flying implements Invoice{
  protected String firstLocation;
  protected String lastLocation;
  protected String departureTime;
  protected String arrivalTime;
  protected Pilot pilot;

    public Flying(String firstLocation, String lastLocation, String departureTime, String arrivalTime, Pilot pilot) {
        this.firstLocation = firstLocation;
        this.lastLocation = lastLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.pilot = pilot;
    }
  

    @Override
    public void writeable() {
        System.out.println("firstLocation=" + firstLocation + ", lastLocation=" + lastLocation + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", pilot=" + pilot);
    }


    
  
}
