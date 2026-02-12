import java.time.LocalDate;

public class Running extends Exercise {

    public Running(String user, int duration, LocalDate date) {
        super(user, duration, date);
    }

    @Override
    public int calculateCalories() {
        return duration * 10;
    }

    @Override
    public String getType() {
        return "Running";
    }
}
