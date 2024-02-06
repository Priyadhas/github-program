import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args)
    {
        Scanner d1=new Scanner(System.in);
       
        String s=d1.nextLine() ;
        String n="";
        char ch;
       
      System.out.print("Original : ");
      System.out.println(s); 
       
      for (int i=0; i<s.length(); i++)
      {
        ch= s.charAt(i); 
        n= ch+n; 
      }
      System.out.println("Reversed : "+ n);
    }
}
 

    
    

