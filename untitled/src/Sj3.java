import java.util.Scanner;

public class Sj3 {
    public static void main(String[] args) {
        System.out.print("请输入四位会员卡号：");
        Scanner input = new Scanner(System.in);
        int KH = input.nextInt();
        System.out.println(KH);
        int GW = KH%10;
        int SW = KH/10%10;
        int BW = KH/100%10;
        int QW = KH/1000;
        int H = GW+SW+BW+QW;
        System.out.println("会员卡号之和为："+H);
        boolean XY = H>=20;
        System.out.println("是幸运客户吗？"+XY);
    }
}
