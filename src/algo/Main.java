package algo;

import static jdk.nashorn.internal.objects.Global.println;

public class Main {
    public static void main(String[]args){
        System.out.println(divide(16,4));
    }
    public static int divide(int a, int b){
        if (b==0) return a;
        int c =a%b;
        return divide(b,c);
        //a>b
    }
}
