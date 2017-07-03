# ddd
import java.io.*;
import java.util.*;
public class Vowel
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in); 
    char ch1;
    ch1=sc.next().charAt(0);
    if((ch1=='a')||(ch1=='e')||(ch1=='i')||(ch1=='o')||(ch1=='u')&&(ch1=='A')||(ch1=='E')||(ch1=='I')||(ch1=='O')||(ch1=='U'))
    {
      System.out.println("vowels");
    }
    else
    {
      System.out.println("consonant");
    }
  }
}
