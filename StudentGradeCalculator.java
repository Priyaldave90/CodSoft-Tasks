package Tasks;
import java.util.Scanner;


public class StudentGradeCalculator {

    public static int totalmarks(int subjects){

        Scanner sc=new Scanner(System.in);

        int score=0;
        for(int i=1;i<=subjects;i++){
            System.out.println("For subject "+i+" :");

            try {
                int sum = sc.nextInt();
                score += sum;
            } catch(Exception e){
                System.out.println("Invalid Number Entered.");
            }
        }

        return score;
    }

    public static double AvgPercentage(int totalScore,int subjects){

        System.out.println("Total Marks Are: "+subjects*100);
        System.out.println();
        double AvgPercentage = ((double)totalScore/(subjects*100))*100;

        return AvgPercentage;
    }

    public static void Grade(double Percentage){

        try {

            if (Percentage >= 90 && Percentage <= 100) {
                System.out.println("Congrats! You Got The Grade: S");
            } else if (Percentage >= 80 && Percentage < 90) {
                System.out.println("Great! You Got The Grade: A");
            } else if (Percentage >= 70 && Percentage < 80) {
                System.out.println("Great! You Got The Grade: B");
            } else if (Percentage >= 60 && Percentage < 70) {
                System.out.println("Nice! You Got The Grade: C");
            } else if (Percentage >= 50 && Percentage < 60) {
                System.out.println("You Got The Grade: D");
            } else if (Percentage >= 40 && Percentage < 50) {
                System.out.println("You Got The Grade: E");
            } else {
                System.out.println("Oops! You Got Teh Grade: F");
            }

        } catch(Exception e){
            System.out.println("Oops! Some Error Occur.");
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StudentGradeCalculator t=new StudentGradeCalculator();

        System.out.println();
        System.out.println("Welcome To The Grade Calculator.");
        System.out.println("This Calculator Will Provide You The Grade Along With Your Total Obtained Score.");
        System.out.println();
        System.out.println("Enter The Number Of Subjects,PLs Enter A Valid Number Of Subjects: ");

        int subjects = sc.nextInt();
        int totalScore = t.totalmarks(subjects);

        System.out.println("Your Obtained Marks Are: "+totalScore);
        System.out.println();

        double Percentage = t.AvgPercentage(totalScore,subjects);
        System.out.println("Your Total Percentage Is: "+Percentage);

        t.Grade(Percentage);

    }
}