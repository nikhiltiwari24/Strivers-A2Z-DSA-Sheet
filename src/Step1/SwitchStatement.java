package Step1;
import java.util.Scanner;
public class SwitchStatement {
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch){
            case 1:
                return Math.PI*a[0]*a[0];
            case 2:
                return a[0]*a[1];
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double [] a=null;
        if (ch==1){
            int b = sc.nextInt();
            a= new double[1];
            a[0] = b;
        }else if (ch==2){
            int c = sc.nextInt();
            int d = sc.nextInt();
            a= new double[2];
            a[0] = c;
            a[1] = d;
        }else{
            System.out.println("Enter valid number");
        }
        double ans = areaSwitchCase(ch,a);
        System.out.println(ans);

    }
}
