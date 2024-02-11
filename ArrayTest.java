import java.util.Scanner;

public class ArrayTest 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();

        Array array = new Array(size);

        int option = 0;
        do
        {
            System.out.println("Select one of the following:\r\n1. Display Maximum and Minimum of Array\r\n2. Display Average and Difference of Array\r\n3. Display Sum of numbers on Even and Odd Indices\r\n4. Exit");
            System.out.print("Enter the index of option: ");
            option = in.nextInt();

            if(option == 1)
            {
                System.out.println("Maximum value = " + array.maxOfArray() + " , Minimum value = " + array.minOfArray());
            }
            else if(option == 2)
            {
                System.out.print("Average = " + array.averageOfArray() + "\r\nDifference = {");
                int[] differenceOfAverage = array.differenceOfAverage();
                for(int i = 0; i < differenceOfAverage.length - 1; i++)
                {
                    System.out.print(differenceOfAverage[i] + ", ");
                }
                System.out.println(differenceOfAverage[differenceOfAverage.length - 1] + "}");
            }
            else if(option == 3)
            {
                System.out.println("Sum of elements on Odd indices = " + array.sumOfOddIndices() + "\r\nSum of elements on Even Indices = " + array.sumOfEvenIndices());
            }
            else if(option == 4)
            {
                System.out.println("Exiting program.");
            }
            else
            {
                System.out.println("Invalid input, try again");
            }
        }
        while(option != 4);

        in.close();
    }
}
