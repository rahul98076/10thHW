public class subract
{
    public static void main()
    {
        int arrM[][] = {
                {-1, 0, 2},
                {-3, -1, 6},
                {4, 3, -1}
            };
        int arrSum[][] = {
                {-6, 9, 4},
                {4, 5, 0},
                {1, -2, -3}
            };
        int arrN[][] = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arrN[i][j] = arrSum[i][j] - arrM[i][j];
            }
        }
        System.out.println("Array N:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arrN[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
