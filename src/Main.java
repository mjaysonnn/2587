import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        new Main().run();
    }

    private void run() 
    {
        Scanner sc = new Scanner(System.in);
      
        int[] array=new int[5];
        for (int i = 0; i < 5; i++) 
        {
            array[i] = sc.nextInt();
        }

        System.out.println(getaverage(array));
        System.out.print(getmid(array));
    }



    private int getaverage(int[] array) 
    {
        int sum=0;
        for(int i=0; i<array.length; ++i)
        {
            sum+=array[i];
        }
        return sum/array.length;
    }
    private int getmid(int[] array) 
    {
        Arrays.sort(array);

        return array[array.length/2];
    }
}
