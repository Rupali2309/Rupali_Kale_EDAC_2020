import java.util.Scanner;
public class PyramidPattern7
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of rows:");
int n = scan.nextInt();

for(int i=n;i>=1;i--)
{
for(int j=i;j<n;j++)
{
System.out.print(" ");

}
for(int k=i;k>=1;k--)
{
    System.out.print(i+" ");
}
System.out.println();
}
}
}