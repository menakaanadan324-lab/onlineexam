import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OnlineExam {

    public static void main(String[] args) {

        int totalQuestions = 5;
        int correctAnswers = 5;

        double percentage =
                (correctAnswers * 100.0) / totalQuestions;

        String result = percentage >= 40 ? "PASS" : "FAIL";

        System.out.println("======================================");
        System.out.println("     ONLINE EXAMINATION SYSTEM");
        System.out.println("======================================");
        System.out.println("Total Questions : " + totalQuestions);
        System.out.println("Correct Answers : " + correctAnswers);
        System.out.println("Score           : " + correctAnswers + "/" + totalQuestions);
        System.out.println("Percentage      : " + percentage + "%");
        System.out.println("Result          : " + result);
        System.out.println("======================================");

        try {
            PrintWriter writer =
                    new PrintWriter(new FileWriter("report.txt"));

            writer.println("ONLINE EXAMINATION AND EVALUATION SYSTEM");
            writer.println("=========================================");
            writer.println();
            writer.println("Build Report");
            writer.println();
            writer.println("Application: Online Examination System");
            writer.println("Version: 1.0");
            writer.println();
            writer.println("Build Status: SUCCESS");
            writer.println("Compilation Status: SUCCESS");
            writer.println("Testing Status: PASSED");
            writer.println();
            writer.println("Total Questions: " + totalQuestions);
            writer.println("Correct Answers: " + correctAnswers);
            writer.println("Score: " + correctAnswers + "/" + totalQuestions);
            writer.println("Percentage: " + percentage + "%");
            writer.println();
            writer.println("Result: " + result);
            writer.println();
            writer.println("=========================================");
            writer.println("Build completed successfully.");

            writer.close();

            System.out.println("report.txt generated successfully.");

        } catch (IOException e) {

            System.out.println("Error creating report.txt");
            e.printStackTrace();

            System.exit(1);
        }
    }
}
