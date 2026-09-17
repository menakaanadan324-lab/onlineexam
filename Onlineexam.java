import java.util.Scanner;

public class OnlineExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the full form of CPU?",
            "2. Which language is used for Android development?",
            "3. What is 10 + 20?",
            "4. Which one is a programming language?",
            "5. What does HTML stand for?"
        };

        String[] options = {
            "A. Central Processing Unit",
            "B. Computer Personal Unit",
            "C. Central Program Unit",
            "D. Control Processing Unit"
        };

        String[] answers = {"A", "B", "C", "B", "A"};

        int score = 0;

        System.out.println("======================================");
        System.out.println("     ONLINE EXAMINATION SYSTEM");
        System.out.println("======================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            if (i == 0) {
                System.out.println("A. Central Processing Unit");
                System.out.println("B. Computer Personal Unit");
                System.out.println("C. Central Program Unit");
                System.out.println("D. Control Processing Unit");
            } else if (i == 1) {
                System.out.println("A. Python");
                System.out.println("B. Java");
                System.out.println("C. HTML");
                System.out.println("D. SQL");
            } else if (i == 2) {
                System.out.println("A. 20");
                System.out.println("B. 25");
                System.out.println("C. 30");
                System.out.println("D. 40");
            } else if (i == 3) {
                System.out.println("A. HTML");
                System.out.println("B. Java");
                System.out.println("C. CSS");
                System.out.println("D. SQL");
            } else {
                System.out.println("A. Hyper Text Markup Language");
                System.out.println("B. High Text Machine Language");
                System.out.println("C. Hyper Tool Markup Language");
                System.out.println("D. Home Text Markup Language");
            }

            System.out.print("Enter your answer: ");
            String userAnswer = sc.nextLine().toUpperCase();

            if (userAnswer.equals(answers[i])) {
                score++;
            }
        }

        System.out.println("\n======================================");
        System.out.println("              RESULT");
        System.out.println("======================================");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Score            : " + score + "/" + questions.length);

        double percentage = (score * 100.0) / questions.length;

        System.out.println("Percentage       : " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Result           : PASS");
        } else {
            System.out.println("Result           : FAIL");
        }

        System.out.println("======================================");

        sc.close();
    }
}
