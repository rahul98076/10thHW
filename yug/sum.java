import java.util.*;
public class sumEvenOdd
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter 20 numbers");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        System.out.println("Sum of Odd numbers = " + oddSum);
        System.out.println("Sum of Even numbers = " + evenSum);
    }
}
