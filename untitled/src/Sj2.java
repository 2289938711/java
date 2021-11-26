import java.util.Scanner;

public class Sj2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入折扣：");
        double ZKH = input.nextDouble();
        int T =50;
        int X=200;
        int P=80;
        int DY = 100;
        boolean TJG = (T*ZKH)>DY;
        boolean XJG = (X*ZKH)>=DY;
        boolean PJG = (P*ZKH)>DY;
        System.out.println("T恤折扣价低于100吗？"+TJG);
        System.out.println("网球拍折扣价低于100吗？"+PJG);
        System.out.println("网球鞋折扣价低于100吗？"+XJG);
    }
}
