import java.util.Random;

public class Array
{
    private int[] array;

    public Array(int size)
    {
        array = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++)
        {
            array[i] = random.nextInt(100);
        }
    }

    public int minOfArray()
    {
        int min = array[0];

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }

    public int maxOfArray()
    {
        int max = array[0];

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    public int averageOfArray()
    {
        int average = 0;

        for(int i = 0; i < array.length; i++)
        {
            average = average + array[i];
        }

        average = average / array.length;

        return average;
    }

    public int[] differenceOfAverage()
    {
        int[] differenceOfAverage = new int[array.length];
        int average = averageOfArray();

        for(int i = 0; i < array.length; i++)
        {
            differenceOfAverage[i] = array[i] - average;
        }

        return differenceOfAverage;
    }

    public int sumOfOddIndices()
    {
        int sum = 0;

        for(int i = 1; i < array.length; i += 2)
        {
            sum = sum + array[i];
        }

        return sum;
    }

    public int sumOfEvenIndices()
    {
        int sum = 0;

        for(int i = 0; i < array.length; i += 2)
        {
            sum = sum + array[i];
        }

        return sum;
    }
}

