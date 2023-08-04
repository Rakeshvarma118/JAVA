import java.util.*;
public class Primenumber
{
	public static void main(String args[])
{
	int lower=1,upper=30;
	for(int i=lower;i<=upper;i++)
	if(is prime(i))
	System.out.println(i);
}
Static boolean is prime(int n)
{
	int count=0;
	if(n<2)
	return false;
	for(int i=2;i<=n;i++)
	{
		if(n%i==0)
		return false;
	}
	return true;
}
}