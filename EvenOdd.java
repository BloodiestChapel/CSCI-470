import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
