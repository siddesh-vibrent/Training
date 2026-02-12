import java.util.*;
import java.time.LocalDate;

public class ExerciseService {

    private List<Exercise> exercises = new ArrayList<>();

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void printAggregate() {

        Map<String, Integer> aggregateMap = new TreeMap<>();

        for (Exercise e : exercises) {
            String key = e.getUser() + "|" + e.getDate() + "|" + e.getType();
            aggregateMap.put(key,
                    aggregateMap.getOrDefault(key, 0) + e.calculateCalories());
        }

        System.out.println("---- AGGREGATED MODE ----");
        for (Map.Entry<String, Integer> entry : aggregateMap.entrySet()) {
            String[] parts = entry.getKey().split("\\|");
            System.out.println(
                    "User: " + parts[0] +
                            ", Date: " + parts[1] +
                            ", Exercise: " + parts[2] +
                            ", Calories: " + entry.getValue()
            );
        }
    }


    public void printDetailed() {

        exercises.sort(Comparator
                .comparing(Exercise::getUser)
                .thenComparing(Exercise::getDate)
                .thenComparing(Exercise::getType));

        System.out.println("---- DETAILED MODE ----");
        for (Exercise e : exercises) {
            System.out.println(
                    "User: " + e.getUser() +
                            ", Date: " + e.getDate() +
                            ", Exercise: " + e.getType() +
                            ", Duration: " + e.duration +
                            " min, Calories: " + e.calculateCalories()
            );
        }
    }
}
