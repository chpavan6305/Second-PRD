public class Main {
    public static void main(String[] args) {
        int month = 1;
        do {
            double monthlyIncome;
            double homeContribution;
            double rent;
            double foodExpenses;
            double travelExpenses;
            double educationExpenses;
            double otherExpenses;
           if (month == 1) {
                monthlyIncome = 70000.0;
                homeContribution = 10000.0;
                rent = 15000.0;
                foodExpenses = 8000.0;
                travelExpenses = 5000.0;
                educationExpenses = 7000.0;
                otherExpenses = 5000.0;
            }
            else {
                monthlyIncome = 60000.0;
                homeContribution = 10000.0;
                rent = 12000.0;
                foodExpenses = 9000.0;
                travelExpenses = 6000.0;
                educationExpenses = 8000.0;
                otherExpenses = 5000.0;
            }

            // Calculate total expenses            double totalExpenses =
                  double totalExpenses = homeContribution + rent + foodExpenses + travelExpenses + educationExpenses + otherExpenses;

            // Calculate savings
            double savings = monthlyIncome - totalExpenses;

            // Decimal division and type casting
            double expensePercentage = ((double) totalExpenses / monthlyIncome) * 100;

            double savingsPercentage = ((double) savings / monthlyIncome) * 100;

            // Check whether expenses exceed income
            boolean expensesExceedIncome = totalExpenses > monthlyIncome;

            // Financial category
            String financialCategory;
            if (savingsPercentage < 10) {
                financialCategory = "Critical";
            } else if (savingsPercentage >= 10 && savingsPercentage < 20) {
                financialCategory = "Needs Improvement";
            } else if (savingsPercentage >= 20  && savingsPercentage < 30) {
                financialCategory = "Good";
            } else {
                financialCategory = "Excellent";
           }
           String expenseStatus =  expensesExceedIncome ? "Expenses Exceed Income": "Expenses Are Within Income";
            System.out.println();
            System.out.println("==========================================");
            System.out.println("       MONTHLY FINANCIAL REPORT");
            System.out.println("==========================================");
            System.out.println("Month: " + month);
            System.out.printf( "Monthly Income: %.2f%n", monthlyIncome);
           System.out.printf("Home Contribution: %.2f%n",homeContribution);
           System.out.printf("Rent: %.2f%n",rent);
            System.out.printf( "Food Expenses: %.2f%n",foodExpenses);
            System.out.printf( "Travel Expenses: %.2f%n",travelExpenses);
            System.out.printf("Education Expenses: %.2f%n",educationExpenses);
           System.out.printf("Other Expenses: %.2f%n", otherExpenses);
            System.out.printf("Total Expenses: %.2f%n",totalExpenses);
            System.out.printf("Savings: %.2f%n",savings);
            System.out.printf("Expense Percentage: %.2f%%%n",expensePercentage);
           System.out.printf( "Savings Percentage: %.2f%%%n",savingsPercentage);
            System.out.println("Expense Status: " + expenseStatus);
            System.out.println("Financial Category: " + financialCategory);
            // Improvement message
            if (savingsPercentage < 10) {
                System.out.println("Message: Reduce unnecessary expenses and increase savings.");
            } else if (savingsPercentage < 20) {
                System.out.println("Message: Savings need improvement.");
            } else if (savingsPercentage < 30) {
                System.out.println("Message: Savings are healthy but can be improved.");
            } else {
                System.out.println("Message: Excellent savings discipline.");
            }
            month++;
        } while (month <= 2);
    }
}