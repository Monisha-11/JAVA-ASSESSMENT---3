import java.util.Scanner;
public class interfac {
    public static void main(String[] args) {
        MyCalc My_cal = new MyCalc();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(My_cal.divisor_sum(n));
        sc.close();

    }
}
