public class Ride {

    static final int CRGS_PER_KM = 20;
    private int id;
    private int source;
    private int destination;
    private int noOfSeats;
    private RideStatus rideStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    Ride(int id, int source, int destination, int noOfSeats){
        this.id=id;
        this.source=source;
        this.destination=destination;
        this.noOfSeats=noOfSeats;
    }

    int calculateFare(boolean isPriority){
        if (rideStatus==RideStatus.CREATED) {
            if (noOfSeats > 2)
                return (int) ((destination - source) * noOfSeats * 0.75 * CRGS_PER_KM);
            else
                return ((destination - source) * CRGS_PER_KM);
        }
        System.out.println("Source is greater than destination, wrong inputs");
        return 0;
    }

}

