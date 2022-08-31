public class MainTest {
    public static void main(String[] args){
        Rider rider = new Rider("Lucifer");
        Driver driver = new Driver("Amenadiel");

        rider.createRide(1,50,60,1);
        System.out.println(rider.closeRide());

        rider.updateRide(1,50,60,2);
        System.out.println(rider.closeRide());

        System.out.println("--------------------------------------");

        rider.createRide(1,50,60,1);
        rider.withDrawRide(1);
        rider.updateRide(1,50,60,2);
        System.out.println(rider.closeRide());
    }
}
