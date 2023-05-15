import java.util.ArrayList;
import java.util.List;

public class RoomTestMain {
    public static void main(String[] args){
        Room room1 = new Room("Atlas");
        Room room2 = new Room("Nexus");
        Room room3 = new Room("Holycow");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Scheduler scheduler = new Scheduler(rooms);
        System.out.println(scheduler.book(2,5, 1));
        System.out.println(scheduler.book(5,8, 1));
        System.out.println(scheduler.book(4,8, 1));
        System.out.println(scheduler.book(3,6, 1));
        System.out.println(scheduler.book(7,8, 1));
        System.out.println(scheduler.book(6,9, 1));
    }
}
