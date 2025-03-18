import java.util.Scanner;
public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int total_marks=0;
        int subjects=5;;
        for (int i=1;i<=subjects;i++)
        {
            System.out.print("Marks in Subject-"+i+" (out of 100): ");
            total_marks+=scn.nextInt();
        }
        int average_marks=total_marks/subjects;
        switch (average_marks/10)
        {
            case 10:
            case 9:
            case 8:
                System.out.print("Grade: O");
                break;
            case 7:
                System.out.println("Grade: A");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: P");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }
        scn.close();
    }
}