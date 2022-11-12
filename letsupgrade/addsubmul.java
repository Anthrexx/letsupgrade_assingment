import java.util.Scanner;

public class addsubmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //-->  Divide 
        int div=a/b;
        
        System.out.println("the division of "+ a +" and "+ b + " is:"+div);
        // --> mutliple
        int mult=a*b;
        System.out.println("the multiplication of two numbers " +a+" and "+ b+" is : " +mult);
        // --> addition
        int add=a+b;
        System.out.println("the addition of two numbers " +a+" and "+ b+" is : " +add);
        // --> subtraction
        int sub=a-b;
        System.out.println("the subtraction of two numbers " +a+" and "+ b+" is : " +sub);

    }

}
