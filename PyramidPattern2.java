import java.util.Scanner;
public class PyramidPattern2
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the numbers:");
int n=scan.nextInt();

for(int i=1; i<=n; i++){

for(int j=0; j<n-i; j++)
{
System.out.print(" ");
}
for(int k=1; k<=i; k++)
{
System.out.print(k+" ");
}
System.out.print("\n");

}
        } 
}