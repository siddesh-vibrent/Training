import java.time.LocalDate;

import static java.time.LocalDate.*;

public class MainApp {

    public static void main(String[] args) {

        ExerciseService service = new ExerciseService();

        service.addExercise(new Walking("Siddesh", 30, null));
        service.addExercise(new Running("John", 20, of(2024, 10, 10)));
        service.addExercise(new Cycling("Bob", 40, null));
        service.addExercise(new Walking("Don", 15, null));


        service.printAggregate();


        service.printDetailed();
    }
}
