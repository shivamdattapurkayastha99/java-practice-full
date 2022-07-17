import java.util.Scanner;

public class T4 {
    static int calc(int a,int b){
        int c;
        if (a>b) {
            c=a*b;
        } else {
            c=(a+b)*5;
        }
        return c;
    }
    static void change(int arr[]){
        arr[0]=30;
        arr[1]=45;
    }
    static void foo(){
        System.out.println("hello");
    }
    static void foo(int a){
        System.out.println("hello "+a);

    }

    public static void main(String[] args) {
        foo();
        foo(3000);
        // int a=5;
        // int b=7;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a");
        // int a=sc.nextInt();
        // System.out.println("Enter b");
        // int b=sc.nextInt();
        // int c=calc(a, b);
        // System.out.println(c);
        // int marks[]={52,73,77,89,98,94};
        // int x=45;
        // change(x);
        // System.out.println(x);
        // change(marks);
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);

        
    }
}
