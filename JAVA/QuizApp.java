import java.util.*;


public class QuizApp {

    static int score = 0;
    static int wrongCount = 0;
    static final int TOTAL_QUESTIONS = 10;
    static final int MAX_WRONG = 4;


    enum Option {
        A, B, C, D
    }

   
    static class Question {
        String question;
        String[] options;
        Option correctAnswer;

        Question(String question, String[] options, Option correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Question> bank = new ArrayList<>();


        bank.add(new Question(
                "What is the capital of India?",
                new String[]{"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"},
                Option.B));

        bank.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"A. Earth", "B. Venus", "C. Mars", "D. Jupiter"},
                Option.C));

        bank.add(new Question(
                "Who is known as the Father of the Nation (India)?",
                new String[]{"A. Nehru", "B. Bose", "C. Gandhi", "D. Patel"},
                Option.C));

        bank.add(new Question(
                "Which is the largest ocean in the world?",
                new String[]{"A. Indian", "B. Atlantic", "C. Arctic", "D. Pacific"},
                Option.D));

        bank.add(new Question(
                "Which animal is called the Ship of the Desert?",
                new String[]{"A. Horse", "B. Camel", "C. Elephant", "D. Donkey"},
                Option.B));

        bank.add(new Question(
                "How many continents are there?",
                new String[]{"A. 5", "B. 6", "C. 7", "D. 8"},
                Option.C));

        bank.add(new Question(
                "Which is the national bird of India?",
                new String[]{"A. Sparrow", "B. Peacock", "C. Eagle", "D. Parrot"},
                Option.B));

        bank.add(new Question(
                "Which gas is most abundant in the atmosphere?",
                new String[]{"A. Oxygen", "B. Carbon Dioxide", "C. Nitrogen", "D. Hydrogen"},
                Option.C));

        bank.add(new Question(
                "Who invented the telephone?",
                new String[]{"A. Edison", "B. Bell", "C. Tesla", "D. Newton"},
                Option.B));

        bank.add(new Question(
                "Which country is called the Land of the Rising Sun?",
                new String[]{"A. China", "B. Korea", "C. Thailand", "D. Japan"},
                Option.D));

        bank.add(new Question(
                "Which is the smallest continent?",
                new String[]{"A. Europe", "B. Australia", "C. Antarctica", "D. Africa"},
                Option.B));

        bank.add(new Question(
                "Which is the longest river in the world?",
                new String[]{"A. Amazon", "B. Nile", "C. Ganga", "D. Yangtze"},
                Option.B));

        bank.add(new Question(
                "Which metal is liquid at room temperature?",
                new String[]{"A. Iron", "B. Mercury", "C. Silver", "D. Gold"},
                Option.B));

        bank.add(new Question(
                "Who wrote the national anthem of India?",
                new String[]{"A. Bankim Chandra", "B. Rabindranath Tagore", "C. Sarojini Naidu", "D. Gandhi"},
                Option.B));

        bank.add(new Question(
                "Which is the largest mammal?",
                new String[]{"A. Elephant", "B. Giraffe", "C. Blue Whale", "D. Rhino"},
                Option.C));

        bank.add(new Question(
                "Which country gifted the Statue of Liberty to USA?",
                new String[]{"A. Germany", "B. France", "C. UK", "D. Italy"},
                Option.B));

        bank.add(new Question(
                "How many players are there in a cricket team?",
                new String[]{"A. 9", "B. 10", "C. 11", "D. 12"},
                Option.C));

        bank.add(new Question(
                "Which is the fastest land animal?",
                new String[]{"A. Lion", "B. Tiger", "C. Cheetah", "D. Leopard"},
                Option.C));

        bank.add(new Question(
                "Which organ purifies blood in humans?",
                new String[]{"A. Heart", "B. Lungs", "C. Liver", "D. Kidney"},
                Option.D));

        bank.add(new Question(
                "Which is the national flower of India?",
                new String[]{"A. Rose", "B. Sunflower", "C. Lotus", "D. Lily"},
                Option.C));


        Collections.shuffle(bank);

        System.out.println("===== GK QUIZ STARTED =====");


        for (int i = 0; i < TOTAL_QUESTIONS; i++) {

            Question q = bank.get(i);

            System.out.println("\nQ" + (i + 1) + ": " + q.question);

            for (String opt : q.options) {
                System.out.println(opt);
            }

            Option userAnswer = null;


            do {
                System.out.print("Enter choice (A/B/C/D): ");
                String input = sc.next().toUpperCase();


                switch (input) {
                    case "A":
                        userAnswer = Option.A;
                        break;
                    case "B":
                        userAnswer = Option.B;
                        break;
                    case "C":
                        userAnswer = Option.C;
                        break;
                    case "D":
                        userAnswer = Option.D;
                        break;
                    default:
                        System.out.println("Invalid input! Try again.");
                }
            } while (userAnswer == null);


            if (userAnswer == q.correctAnswer) {
                score++;
            } else {
                wrongCount++;
            }

            // termination
            if (i<6 && wrongCount >= MAX_WRONG) {
                System.out.println("\nYou failed the quiz!");
                System.out.println("Score: " + score + "/" + (i + 1));
                break;
            }
        }

     
        System.out.println("\nQuiz Completed");
        System.out.println("Final Score: " + score + "/" + TOTAL_QUESTIONS);

    }
}