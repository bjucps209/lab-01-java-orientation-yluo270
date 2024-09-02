import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       System.out.println("Please enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        for(int i = 0; i < numStudents; i++){
            int grade = scanner.nextInt();
            grade = roundGrade(grade);
            System.out.println(grade);
        }
        
        scanner.close();
    }

    public static int roundGrade(int grade) {
        if (grade < 38){
            return grade;
        }
        
        int nextMultipleOf5 = ((grade/5) + 1) * 5;

        if (nextMultipleOf5 - grade < 3){
            return nextMultipleOf5;
        }
        
        return grade;
        
    }
}
