import java.time.LocalDate;

public abstract class Exercise {

    protected String user;
    protected int duration; // in minutes
    protected LocalDate date;

    public Exercise(String user, int duration, LocalDate date) {
        this.user = user;
        this.duration = duration;
        this.date = (date == null) ? LocalDate.now() : date;
    }

    public abstract int calculateCalories();
    public abstract String getType();

    public String getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }
}
