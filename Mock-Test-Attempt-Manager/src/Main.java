public class Main {
    public static void main(String[] args) {
        int attempt = 1;
        int bestScore = 0;
        int remainingAttempts = 3;
        int score = 0;
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        boolean passed = false;
        System.out.println("MOCK TEST ATTEMPT REPORT");
        System.out.println();
        while (attempt <= 3 && !passed) {
            if (attempt == 1) {
                score = 48;
                correctAnswers = 24;
                incorrectAnswers = 26;
            } 
            else if (attempt == 2) {
                score = 57;
                correctAnswers = 29;
                incorrectAnswers = 21;
            } 
            else {
                score = 68;
                correctAnswers = 34;
                incorrectAnswers = 16;
            }
            if (score > bestScore) {
                bestScore = score;
            }
            remainingAttempts--;
            System.out.println("Attempt " + attempt);
            System.out.println("Score: " + score);
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Incorrect Answers: " + incorrectAnswers);
            passed = score >= 60;
            String result = passed ? "Passed" : "Failed";
            System.out.println("Result: " + result);
            if (!passed) {
                System.out.println("Remaining Attempts: " + remainingAttempts);
           }
            System.out.println();
            attempt++;
        }
        System.out.println("Best Score: " + bestScore);
        if (passed) {
            System.out.println("Final Result: MOCK TEST CLEARED");
            System.out.println(
                    "Message: Student passed on attempt " + (attempt - 1) + ".");
        } 
        else {
            System.out.println("Final Result: MOCK TEST NOT CLEARED");
            System.out.println("Recommendation: Practice more and attempt the test again."
            );
        }
    }
}