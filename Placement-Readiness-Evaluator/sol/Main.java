

public class Main {
    public static void main(String[] args) {
        int student=1;
        while(student<=2)
        {
            String studentName;
            double academicPercentage;
            double attendancePercentage;
            int activeBacklogs;
            boolean projectCompleted;
            double communicationScore;
            double aptitudeScore;

            if(student==1)
            {
                studentName="Ananya";
                academicPercentage=72.5;
                attendancePercentage=81;
                activeBacklogs=0;
                projectCompleted=true;
                communicationScore=68;
                aptitudeScore=74;
            }
            else
            {
                studentName="Kiran";
                academicPercentage=72.5;
                attendancePercentage=70;
                activeBacklogs=0;
                projectCompleted=false;
                communicationScore=68;
                aptitudeScore=55;
            }

            boolean academicEligible=academicPercentage>=60;
            boolean attendanceEligible=attendancePercentage>=75;
            boolean backlogEligible=activeBacklogs==0;
            boolean communicationEligible=communicationScore>=60;
            boolean aptitudeEligible=aptitudeScore>=60;

            boolean placementReady=academicEligible && attendanceEligible && backlogEligible && projectCompleted && communicationEligible && aptitudeEligible;

            System.out.println();
            System.out.println("=======================================");
            System.out.println("         PLACEMENT READINESS REPORT    ");
            System.out.println("==========================================");

            System.out.println("Student Name: "+studentName);

            System.out.println("Academic Percentage: "+(academicEligible ? "Eligible " : "Not Eligible"));
            System.out.println("Attendance Status: "+(attendanceEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Backlog status: "+(backlogEligible ? "Eligible":"Not Eligible"));
            System.out.println("Project Status: "+(projectCompleted ? "Completed ": "Not Completed"));
            System.out.println("Communication Status: "+(communicationEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Aptitude Status: "+(aptitudeEligible ? "Eligible ": "Not Eligible"));


            System.out.println();

            if(placementReady)
            {
                System.out.println("Final Result:  PLACEMENT READY");
                System.out.println("Message:  All placement requirements are satisfied");
            }
            else
            {
                System.out.println("Final Result: NOT PLACEMENT READY");
                System.out.println();
                System.out.println("Areas to Improve");
                if(!academicEligible)
                    System.out.println("Academic Percentage");
                if(!attendanceEligible)
                    System.out.println("attendance");
                if(!projectCompleted)
                    System.out.println("Project Completed");
                if(!aptitudeEligible)
                    System.out.println("Aptitude Score");
            }
            student++;
        }
    
    }
    
}
