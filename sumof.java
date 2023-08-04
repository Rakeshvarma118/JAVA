import java.io.*;
import java.util.*;
class sumof{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,sum=0;
System.out.println("enter any number");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("The sum is" +sum);
}
}
