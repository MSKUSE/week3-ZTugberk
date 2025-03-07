import java.sql.SQLOutput;

public class FindGrade{

    public static void main(String[] args){

        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F


        if(args.length>1) {
int grade=Integer.parseInt(args[0]);

            if (grade >= 90) {
                System.out.println("Your grade is A");
            } else if (grade >= 80 && grade < 90) {
                System.out.println("Your grade is B");
            } else if (grade >= 70 && grade < 80) {
                System.out.println("Your grade is C");
            } else if (grade >= 60 && grade < 70) {
                System.out.println("Your grade is D");
            } else System.out.println("Your grade is F");

        }

    }



}