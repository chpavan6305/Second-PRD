public class Main {
    public static void main(String[] args) {
        int day=1;
        int totalAttempted=0,totalSolved=0;
        double totalHours=0;
        int productiveDays=0;
        int nonProductiveDays=0;
        while(day<=7)
        {
            int attempted=0,solved=0;
            double hours=0;

            if(day==1){
                attempted=8;
                solved=6;
                hours=2.5;
            } else if(day==2)
            {
                attempted=7;
                solved=5;
                hours=2.0;
            } else if(day==3){
                attempted=6;
                solved=3;
                hours=1.5;
            } else if(day==4){
                attempted=9;
                solved=7;
                hours=3.0;
            } else if(day==5) {
                attempted=8;
                solved=6;
                hours=2.5;
            } else if(day==6){
                attempted=7;
                solved=5;hours=2.0;
            } else if(day==7){
                attempted=5;
                solved=5;
                hours=2.0;
            }
            totalAttempted+=attempted;
            totalSolved+=solved;
            totalHours+=hours;

            boolean productive=solved>=5 && hours>=2;

            if(productive){
                productiveDays++;
            } else {
                nonProductiveDays++;
            }
            day++;
        }

        double successPercentage=0;
        double averageSolved=0;

        if(totalAttempted>0){
            successPercentage=((double) totalSolved/totalAttempted)*100;
        }
        if(7>0){
            averageSolved=(double) totalSolved/7;
        }

        boolean weeklyTarget=totalSolved>=35;

        String consistency=productiveDays>=5 ? "Good" : "Needs Improvement";

        System.out.println("WEEKLY CODING PRACTISE REPORT");
        System.out.println();
        System.out.println("Total Problems Attempted: "+totalAttempted);
        System.out.println("Total Problems Solved: "+totalSolved);
        System.out.printf("Success percentage :%.2f%%%n",successPercentage);
        System.out.println("Total Practice Hours: "+totalHours);
        System.out.printf("Average Problems Solved Per Day: %.2f%n",averageSolved);

        System.out.println();
        System.out.println("Productive Days: "+productiveDays);
        System.out.println("Non-Productive Days: "+nonProductiveDays);
        System.out.println();

        System.out.println("Weekly Taeget: "+(weeklyTarget ? "Archieved" : "Not Archieved"));

        System.out.println("Consistency Status: "+consistency);



    }

    
}
