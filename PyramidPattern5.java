import java.util.Scanner;
class PyramidPattern5
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of rows:");
int n = scan.nextInt();

for(int i=n;i>=1;i--)
{
    for(int j=i;j>1;j--)
    {
    System.out.print(" ");
    }
    
    for(int k=i;k<=n;k++)
    {
    System.out.print(k+" ");
    }
    for(int m=n-1;m>=i;m--)
    {
    System.out.print(m+" ");
    }
System.out.println(" ");
}
}
}