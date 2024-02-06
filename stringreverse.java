import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args)
    {
        Scanner w1=new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
       
        String str=w1.nextLine() ;
        String n="";
        char rr;
       
      System.out.print("Original : "+str);
      
       
      for (int i=0; i<str.length(); i++)
      {
        rr= str.charAt(i); 
        n= rr+n; 
      }
      System.out.println("Reversed : "+ n);
    }
}

  

