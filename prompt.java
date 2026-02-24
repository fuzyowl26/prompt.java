import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;
public class prompt {
    public static void main(String[] args) throws Exception {
        int a, i = 0; char ch; double d; String st, BigInteger;
        String[] s = {"an integer", "a double", "a character", "a string",
                "another string", "a big integer", "a big decimal"};
        // placeholders used during testing
        a = Int(s[i]);
        i++;
        d = Double(s[i]);
        i++;
        ch = Char(s[i]);
        i++;
        st = String(s[i]);
        System.out.println(st);
        i++;
        String two = String(s[i]);
        System.out.println(two);
        i++;
        BigInteger ba = new BigInteger(BigInt(s[i]));
        System.out.println(ba);
        i++;
        BigDecimal bd = new BigDecimal(BigDec(s[i]));
        System.out.println(bd);
    }
    // methods for each data type
    public static int Int(String s){
        String r = "Enter ", t = ":  ";
        Scanner sc = new Scanner(System.in);
        System.out.print(r + s + t);
        return sc.nextInt();
    }
    public static double Double(String s){
        String r = "Enter ", t = ":  ";
        Scanner sc = new Scanner(System.in);
        System.out.print(r + s + t);
        return sc.nextDouble();
    }
    public static char Char(String s) throws Exception{
        String r = "Enter ", t = ":  ";
        System.out.print(r + s + t);
        char ch = (char)System.in.read();
        System.in.read();
        return ch;
    }
    public static String String(String s) throws IOException{
        int i = 0;
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String r = "Enter ", t = ":  ";
        System.out.print(r + s + t);
        return br.readLine();
    }
    public static String BigInt(String s) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String r = "Enter ", t = ":  ";
        System.out.print(r + s + t);
        return br.readLine();
    }
    public static String BigDec(String s) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String r = "Enter ", t = ":  ";
        System.out.print(r + s + t);
        return br.readLine();
    }

}

