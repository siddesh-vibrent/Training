import java.time.LocalDate;

public class Walking extends Exercise {

    public Walking(String user, int duration, LocalDate date) {
        super(user, duration, date);
    }

    @Override
    public int calculateCalories() {
        return duration * 4;
    }

    @Override
    public String getType() {
        return "Walking";
    }
}
