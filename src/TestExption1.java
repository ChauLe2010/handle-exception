import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExption1 {
    //public static int result(int a,int b) throws IOException{
    public static int result(int a,int b) {
       if(b==0)
           throw new ArithmeticException("Loi chia 0");
       return a/b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap a: ");
        a=sc.nextInt();
        System.out.println("Nhap b: ");
        b=sc.nextInt();
        try {
            System.out.println("Result: " + result(a, b));
        }catch (ArithmeticException ex){
            System.out.println("Loi chia 0");
        }

    }
}
