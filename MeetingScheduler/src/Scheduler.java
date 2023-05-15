import java.util.List;

public class Scheduler {
    List<Room> rooms;

    Scheduler(List<Room> rooms){
        this.rooms=rooms;
    }

    String book(int start, int end, int day){
         for (Room room: rooms) {
            if(room.book(start,end, day)==true)
                return room.getName();
        }
        return "No rooms available";
    }
}
