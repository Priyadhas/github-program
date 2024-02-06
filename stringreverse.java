import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args)
    {
        Scanner d1=new Scanner(System.in);
       
        String s=d1.nextLine() ;
        String n="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println(s); 
       
      for (int i=0; i<s.length(); i++)
      {
        ch= s.charAt(i); //extracts each character
        n= ch+n; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ n);
    }
}
 

    
    

