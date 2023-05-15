import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    private String name;

    private Map<Integer,List<Meeting>> calendar;

    Room(String name){
        this.name=name;
        calendar = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, List<Meeting>> getCalendar() {
        return calendar;
    }

    public void setCalendar(Map<Integer,List<Meeting>> calendar) {
        this.calendar = calendar;
    }

    boolean book(int start, int end, int day){
        if (calendar.get(day)!=null) {
            for (Meeting m : calendar.get(day)) {
                if (m.getStart() > end || start < m.getEnd()) {
                    return false;
                }
            }
            Meeting meeting = new Meeting(start,end,this);
            calendar.get(day).add(meeting);
        }else{
            Meeting meeting = new Meeting(start,end,this);
            List<Meeting> meetings = new ArrayList<>();
            meetings.add(meeting);
            calendar.put(day, meetings);
        }
        return true;
    }
}
