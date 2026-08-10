public class Main {
        public static void main(String[] args) {
            int day = 1;
        int totalAttempted = 0;
        int totalSolved = 0;
        double totalHours = 0;
        int productiveDays = 0;
        int nonProductiveDays = 0;
        System.out.println("WEEKLY CODING PRACTICE REPORT");
        System.out.println("--------------------------------");
        while (day <= 7) {
            int attempted = 0;
            int solved = 0;
            double hours = 0;
            if (day == 1) {
                attempted = 8;
                solved = 6;
                hours = 2.5;
            } 
            else if (day == 2) {
                attempted = 7;
                solved = 5;
                hours = 2.0;
            } 
            else if (day == 3) {
                attempted = 6;
                solved = 3;
                hours = 1.5;
            } 
            else if (day == 4) {
                attempted = 9;
                solved = 7;
                hours = 3.0;
            } 
            else if (day == 5) {
                attempted = 8;
                solved = 6;
                hours = 2.5;
            } 
            else if (day == 6) {
                attempted = 7;
                solved = 5;
                hours = 2.0;
            } 
            else if (day == 7) {
                attempted = 5;
                solved = 5;
                hours = 2.0;
            }
            totalAttempted += attempted;
            totalSolved += solved;
            totalHours += hours;
            boolean productive = solved >= 5 && hours >= 2;
            String dayStatus = productive
                    ? "Productive"
                    : "Non-Productive";
            if (productive) {
                productiveDays++;
            } else {
                nonProductiveDays++;
            }
            System.out.println( "Day " + day + " | Attempted: " + attempted + " | Solved: " + solved + " | Hours: " + hours+ " | Status: " + dayStatus);
            day++;
        }
        System.out.println("--------------------------------");
       double successPercentage = 0;
        double averageSolved = 0;
        if (totalAttempted != 0) {
            successPercentage =
                    ((double) totalSolved / totalAttempted) * 100;
        }
       averageSolved = (double) totalSolved / 7;
        boolean targetAchieved = totalSolved >= 35;
        String targetStatus = targetAchieved ? "Achieved": "Not Achieved";
        String consistencyStatus;
        if (productiveDays >= 5) {
            consistencyStatus = "Good";
        } else if (productiveDays >= 3) {
            consistencyStatus = "Average";
        } else {
            consistencyStatus = "Needs Improvement";
        }
        System.out.println();
        System.out.println("Total Problems Attempted: "+ totalAttempted);
        System.out.println("Total Problems Solved: "+ totalSolved);
        System.out.printf("Success Percentage: %.2f%%%n",successPercentage);

        System.out.printf("Total Practice Hours: %.1f%n",totalHours);

        System.out.printf("Average Problems Solved Per Day: %.2f%n",averageSolved);

        System.out.println();
        System.out.println("Productive Days: "+ productiveDays);
        System.out.println("Non-Productive Days: "+ nonProductiveDays);

        System.out.println();
        System.out.println("Weekly Target: "+ targetStatus);

        System.out.println("Consistency Status: "+ consistencyStatus);

        System.out.println();
        if (targetAchieved && productiveDays >= 5) {
            System.out.println("Final Message: Excellent coding consistency!");
        } else if (targetAchieved) {
            System.out.println("Final Message: Weekly target achieved, "+ "but improve consistency.");
        } else {
            System.out.println("Final Message: Increase solved problems "+ "and practice hours.");
        }
    }
}