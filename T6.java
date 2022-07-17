import java.util.Scanner;
public class T6 {
    static int  fact(int n){
        if (n==1||n==0) {
            return n;
        } else {
            return n*fact(n-1);
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=fact(n);
        System.out.println(x);
    }
    
}
