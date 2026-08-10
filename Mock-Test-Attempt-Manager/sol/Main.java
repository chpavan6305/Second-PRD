public class Main {

    public static void main(String[] args) {
        int attempt = 1;
        int maximumAttempts = 3;
        int bestScore = 0;
        int remainingAttempts = maximumAttempts;
        boolean passed = false;
        System.out.println("========================================");
        System.out.println("       MOCK TEST ATTEMPT REPORT");
        System.out.println("========================================");
        System.out.println();
        while (attempt <= maximumAttempts && !passed) {
            int score;
            int correctAnswers;
            int incorrectAnswers;
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
        boolean isPassed =score >= 60 && correctAnswers > incorrectAnswers;
   String result =isPassed ? "Passed" : "Failed";
            System.out.println("Attempt " + attempt);
            System.out.println("Score: " + score);
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Incorrect Answers: " + incorrectAnswers);
            System.out.println("Result: " + result);
            if (isPassed) {
                passed = true;
                System.out.println("Remaining Attempts: "+ remainingAttempts);
            } 
            else {
                if (remainingAttempts > 0) {
                    System.out.println("Remaining Attempts: "+ remainingAttempts);
                } 
                else {
                    System.out.println("Remaining Attempts: 0");
                }
            }
            System.out.println();
            attempt++;
        }
        System.out.println("========================================");
        System.out.println("              FINAL REPORT");
        System.out.println("========================================");
        System.out.println("Best Score: " + bestScore);
        if (passed) {
            System.out.println("Final Result: MOCK TEST CLEARED");
            System.out.println("Message: Student passed on attempt "+ (attempt - 1) + ".");
            if (attempt - 1 == 1) {
                System.out.println("Recommendation: Excellent performance!");
            } 
            else {
                System.out.println("Recommendation: Keep practising to improve consistency." ); 
            }
        } 
        else {
            System.out.println("Final Result: MOCK TEST NOT CLEARED");
            System.out.println("Recommendation: Practice weak areas and retake the mock test." );
        }
    }
}