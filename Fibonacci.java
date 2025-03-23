import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();

        int num_1 = 0;
        int num_2 = 1;
        int num_3 = 0;
        System.out.print(num_1 + " ");
        System.out.print(num_2 + " ");
        for(int i = 0; i<num-1; i++)
        {
            num_3 = num_1 + num_2;
            System.out.print(num_3 + " ");
            num_1 = num_2;
            num_2 = num_3;
        }

        s.close();
    }
    
}
