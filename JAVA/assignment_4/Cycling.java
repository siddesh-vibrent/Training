import java.time.LocalDate;

public class Cycling extends Exercise {

    public Cycling(String user, int duration, LocalDate date) {
        super(user, duration, date);
    }

    @Override
    public int calculateCalories() {
        return duration * 6;
    }

    @Override
    public String getType() {
        return "Cycling";
    }
}
