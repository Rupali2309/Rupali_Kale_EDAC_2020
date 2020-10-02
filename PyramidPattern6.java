import java.util.Scanner;
public class PyramidPattern6{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of rowss:");
int n=scan.nextInt();
for (int i= 0; i<= n-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=n-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();

}
}
}