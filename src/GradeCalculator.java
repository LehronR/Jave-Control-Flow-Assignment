import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int finalGrade = getFinalGrade();

        if(finalGrade > 90) {
            System.out.println("Excellent Work!");
        } else if(finalGrade > 80) {
            System.out.println("Good Job!");
        } else if(finalGrade > 70) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("Let's work  hard to get those grades up!");
        }
    }

    public static int getFinalGrade() {
        int totalGrades = 0;
        int sumOfAllGrades = 0;
        int finalGrade = 0;
        int grade = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What is your grade?");
            grade = Integer.parseInt(input.nextLine());

            if(grade > 100) {
                continue;
            } else if(grade < 0) {
                break;
            } else {
                sumOfAllGrades += grade;
                totalGrades++;
                System.out.println(sumOfAllGrades);
                System.out.println(totalGrades);
            }
        }
        System.out.println("While loop ended");
        finalGrade = sumOfAllGrades / totalGrades;
        System.out.println(sumOfAllGrades);
        System.out.println(totalGrades);
        System.out.println(finalGrade);
        return finalGrade;
    }
}
