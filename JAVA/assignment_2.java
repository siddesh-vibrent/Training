import java.util.Scanner;

public class assignment_2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a,b;

        System.out.print("Enter two numbers: ");
        a= sc.nextInt();
        b=sc.nextInt();


        System.out.println("Addition: "+sum(a,b));
        System.out.println("Difference: "+diff(a,b));
        System.out.println("Product: "+product(a,b));
        System.out.println("Quotient: "+quotient(a,b));


    }
    static int sum(int a,int b){
        return a+b;
    }

    static int diff(int a,int b){
        return a-b;
    }


    static int product(int a,int b){
        return a*b;
    }

    static String quotient(int a,int b){
        if(b==0)
        {
//            System.out.println("Divison by zero is not allowed");
            return "Divison by zero is not allowed";
        }
        String res= String.valueOf(a/b);
        return res;
    }
}
