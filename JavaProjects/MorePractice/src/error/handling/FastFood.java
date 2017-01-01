package error.handling;

/**
 * Created by Tunde on 05/12/2016.
 */
public class FastFood {

    public void addTwoNumbers(int x, int y){
        try{
            double result = x/y;
            System.out.println(result);
        }catch (Throwable t){
            double result = y/x;
            System.out.println(result);
            System.err.println(t.fillInStackTrace());
        }finally {
            System.out.println("This code must run no matter what!!");

        }
    }
}