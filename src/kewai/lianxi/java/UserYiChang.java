package kewai.lianxi.java;

/**
 * Created by Administrator on 2016/10/17 0017.
 */
public class UserYiChang {
    public static void main(String[] args) {
        try{
            //System.out.println("南无地藏菩萨摩诃萨");
            int a=Integer.parseInt(args[0]);
            System.out.println("南无地藏菩萨摩诃萨");
            int b=Integer.parseInt(args[1]);
            //System.out.println("南无地藏菩萨摩诃萨！");
            int c=a/b;
            System.out.println("您输入的两个数相除的结果是："+a/b);
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组越界：运行程序时输入的参数个数不够");
        }catch (NumberFormatException e1){
            System.out.println("数字格式异常：程序只能接受整数参数");
        }catch (ArithmeticException e2){
            System.out.println("算数异常");
        }catch (Exception e3){
            e3.printStackTrace();
            System.out.println("未知异常");
        }
    }

}
