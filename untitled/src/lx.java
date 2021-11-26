import java.util.Scanner;

public class lx {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入张三的成绩：");
        int zs = input.nextInt();
        int ls = 80;
        boolean cj =zs<ls;
        System.out.println("李四的成绩更高吗？"+cj);
    }
}
