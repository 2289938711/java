import java.util.Scanner;

public class Sj1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入T恤数量：");
        int tshirt =input.nextInt();
        System.out.println("请输入网球鞋数量：");
        int WQxie =input.nextInt();
        System.out.println("请输入网球拍数量：");
        int WQpai = input.nextInt();
        System.out.println("请输入T恤价格：");
        int TshirtJG= input.nextInt();
        System.out.println("请输入网球鞋价格：");
        int WQxieJG= input.nextInt();
        System.out.println("请输入网球拍价格：");
        int WQpaiJG= input.nextInt();
        System.out.println("正在为您出票，请稍后.......");
        System.out.println();
        System.out.println("******消费凭据******");
        System.out.println("购买物品\t单价\t个数\t金额");
        System.out.println("T  恤\t"+TshirtJG+"\t"+tshirt+"\t"+(tshirt*TshirtJG));

        System.out.println("网球鞋\t"+WQxieJG+"\t"+WQxie+"\t"+(WQxie*WQxieJG));
        System.out.println("网球拍\t"+WQpaiJG+"\t"+WQpai+"\t"+(WQpai*WQpaiJG));
        System.out.println("*******************");
        System.out.println("总价"+(WQpai*WQpaiJG+WQxie*WQxieJG+tshirt*TshirtJG));
    }
}
