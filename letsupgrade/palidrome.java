import java.util.*;
public class palidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    // --> checking weather it is palidrome or not.
    System.out.println(a+""+b+""+c);
    if(a==c){
        System.out.println("yes,it is palidrome");

    }
    else
    System.out.println("no,try again ");

    }
}
