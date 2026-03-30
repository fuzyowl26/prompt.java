import java.util.Scanner;
import java.lang.System;
public class prompt {
    public static void main(String[] args){
        String sn = "an integer";
        String snn = "another number";
        String ans = " is ";
        Scanner sc = new Scanner(System.in);
        int a = Int(sn);
        double d = Double(snn);
        System.out.println(sn + ans + a);
        System.out.println(snn + ans + d);
    }
    public static void ask(String s){
        String r = "Enter ", t = ":  ";
        System.out.print(r+s+t);
    }
    public static int Int(String s){
        Scanner sc = new Scanner(System.in);
        ask(s);
        return sc.nextInt();
    }
    public static double Double(String s){
        Scanner sc = new Scanner(System.in);
        ask(s);
        return sc.nextDouble();
    }
}