import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] questions = {
                {"Who developed Python?",
                        "1. Dennis Ritchie",
                        "2. Guido van Rossum",
                        "3. James Gosling",
                        "4. Bjarne Stroustrup",
                        "2"},

                {"Which keyword is used to define a function in Python?",
                        "1. func",
                        "2. define",
                        "3. def",
                        "4. function",
                        "3"},

                {"Which company created Java?",
                        "1. Microsoft",
                        "2. Apple",
                        "3. Sun Microsystems",
                        "4. Google",
                        "3"}
        };

        int score = 0;
        int timeLimit = 5;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i][0]);

            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }

            System.out.println("You have " + timeLimit + " seconds to answer:");
            System.out.print("Your answer: ");

            long startTime = System.currentTimeMillis();
            String answer = sc.nextLine();
            long endTime = System.currentTimeMillis();

            long timeTaken = (endTime - startTime) / 1000;

            if (timeTaken > timeLimit) {
                System.out.println("⏰ Time's up!");
            } else if (answer.equals(questions[i][5])) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your score: " + score + "/" + questions.length);

        sc.close();
    }
}