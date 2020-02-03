package sneha;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {

        chocolates s=new chocolates();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity in kg");
        int tw=sc.nextInt();
        int rw;
        System.out.println("Enter the chocolate name");
        String n=sc.next();
        System.out.println("Enter the price");
        int p=sc.nextInt();
        s.add(n,p);
        rw=s.add(tw);
        candies c=new candies();
        c.add(rw);
        s.print();
        c.print();
    }
}
