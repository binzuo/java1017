package kewai.lianxi.java;

/**
 * Created by Administrator on 2016/10/17 0017.
 */
public class ThrowTest {
    public static void main(String[] args) {
        try{
            throw  new ArrayIndexOutOfBoundsException();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
