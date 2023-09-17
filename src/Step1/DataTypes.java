package Step1;
import java.util.*;
public class DataTypes {
    public static int dataTypes(String a){
        if (a.equals("Integer")){
            return 4;
        } else if(a.equals("Long")){
            return 8;
        } else if(a.equals("Float")){
            return 4;
        } else if(a.equals("Double")){
            return 8;
        } else if(a.equals("Character")){
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        int size = dataTypes(a);
        if (size != -1){
            System.out.println(size);
        } else {
            System.out.println("Invalid data type");
        }
    }
}
