import java.util.ArrayList;

public class Rider extends Person{

    ArrayList<Ride> allRides;
    Ride currentRide;

    Rider(String name){
        this.name=name;
        allRides = new ArrayList<>();
    }

    void createRide(int id, int source, int destination, int noOfSeats){
        if (source>destination) {
            System.out.println("Unable to create ride, wrong inputs");
            return;
        }
        currentRide = new Ride(id, source, destination, noOfSeats);
        currentRide.setRideStatus(RideStatus.CREATED);
        allRides.add(currentRide);
    }
    void updateRide(int id, int source, int destination, int noOfSeats){
        if (currentRide.getRideStatus()==RideStatus.WITHDRAWN) {
            System.out.println("Unable to update ride, ride withdrawn");
            return;
        }if (currentRide.getRideStatus()==RideStatus.COMPLETED) {
            System.out.println("Unable to update ride, ride completed already");
            return;
        }
        createRide(id, source, destination, noOfSeats);
    }
    void withDrawRide(int id ){
        if (currentRide.getId()!=id) {
            System.out.println("Unable to withDraw ride, wrong inputs");
            return;
        }
        if (currentRide.getRideStatus()!=RideStatus.CREATED) {
            System.out.println("Unable to withDraw ride, ride was not created or already closed");
            return;
        }
        currentRide.setRideStatus(RideStatus.WITHDRAWN);

    }
    int closeRide(){
        if (currentRide.getRideStatus()!=RideStatus.CREATED) {
            System.out.println("Unable to close ride, wrong inputs");
            return 0;
        }
        allRides.add(currentRide);
        int amount =  currentRide.calculateFare(allRides.size()>10);
        currentRide.setRideStatus(RideStatus.COMPLETED);
        return amount;
    }
}
