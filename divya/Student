import java.util.Scanner;
public class Student
{
    public static void main(String args[]) {        
        Scanner in = new Scanner(System.in);
        int studentDetails[] = new int[200]; //40 * 5 = 200       
        System.out.println("Enter student details");
        for (int i = 0, idx = 1; i < 200; i = i + 5, idx++) {
            System.out.print("Student " + idx + " roll number: ");
            studentDetails[i] = in.nextInt();
            System.out.print("Student " + idx + " English Marks: ");
            studentDetails[i+1] = in.nextInt();
            System.out.print("Student " + idx + " Maths Marks: ");
            studentDetails[i+2] = in.nextInt();
            System.out.print("Student " + idx + " Physics Marks: ");
            studentDetails[i+3] = in.nextInt();
            System.out.print("Student " + idx + " Chemistry Marks: ");
            studentDetails[i+4] = in.nextInt();
        }        
        for (int i = 0; i < 200; i = i + 5) {
            System.out.println("Roll No: " + studentDetails[i]);
            if (studentDetails[i+1] > 34 && 
                ((studentDetails[i+2] > 34 && studentDetails[i+3] > 34) ||
                (studentDetails[i+2] > 34 && studentDetails[i+4] > 34) ||
                (studentDetails[i+3] > 34 && studentDetails[i+4] > 34))) {
                System.out.println("Promotion is granted.");
            }
            else {
                System.out.println("Promotion is not granted.");
            }
        }
    }
}
