package Step1;
import java.util.Scanner;
public class IfElse {
    public static String compareIfElse(int a, int b) {
        if (a < b){
            return "smaller";
        } else if (a > b){
            return "greater";
        } else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = compareIfElse(a,b);
        System.out.println(ans);
    }

}
