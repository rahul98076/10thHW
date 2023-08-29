import java.util.Scanner;
public class Hotel
{
public static void main()
{
Scanner in = new Scanner(System.in);
String M[][] = new String[5][10];
int i = 0, j = 0;
for (i = 0; i < 5; i++)
{
System.out.println("Enter floor " + (i + 1)
+ " guest details:");
for (j = 0; j < 10; j++)
{
System.out.print("Guest in room " +
(j + 1) + ": ");
M[i][j] = in.nextLine();
}
}
boolean found = false;
System.out.print("\nEnter guest name to search: ");
String guest = in.nextLine();
for (i = 0; i < 5; i++)
{
for (j = 0; j < 10; j++)
{
if (M[i][j].equals(guest))
{
found = true;
break;
}
}
if (found)
break;
}
if (found)
System.out.println(guest + " is in room number "
+ (j + 1) + " on floor number " + (i + 1));
else
System.out.println(guest +
" is not staying at this hotel");
}
}