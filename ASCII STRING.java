public class ASCIIString
{
  public static void main(String[] args)
  {
    String str = "n";
    int sum=0;
    for(int i=0; i<str.length(); i++)
    {
      int asciiValue = str.charAt(i);
      sum = sum+asciiValue;
     
    }
    System.out.println("ASCII of " + str + "=" + sum);
  }
}