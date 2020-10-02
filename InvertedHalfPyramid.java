import java.util.Scanner;
public class InvertedHalfPyramid
{
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n=scan.nextInt();
for(int i=n;i<n;i++)
{
for(int j=1;j<i;j--)
{
        
System.out.print("*");
}
System.out.println();
}
}
}