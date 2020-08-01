import java.util.Arrays;
public class BongoTest1 
{
  public static void main(String[]args) 
  {
    BongoTest1 a= new BongoTest1();
    try
    {
      System.out.println(a.anagram("bleat", "table"));
      System.out.println(a.anagram("eat", "tar"));
    }
    catch (Exception e)
    {
      System.out.println("Something went worng. Please try again!");
    }
  }
  public boolean anagram(String s1, String s2) 
  {
    if (s1 == null || s2 == null) return false;
    else if (s1.length() == 0 && s2.length() == 0) return true;
    else if (s1.length() == s2.length()) 
    {        
      char [] a1 = s1.toCharArray();
      char [] a2 = s2.toCharArray();
      Arrays.sort(a1);
      Arrays.sort(a2);
      for (int i=0; i<a1.length; i++) 
      {
        if (a1[i] != a2[i]) return false;
      }
      return true;
    }
    else return false;
  }
}

