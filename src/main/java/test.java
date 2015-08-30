/**
 * Created by Wade on 11.08.2015.
 */
public class test {
    public static void main (String[]args){
        int x = 0;
        int y = 0;
        while (x < 5){
            y = y + 2;
            if (y > 4){
                y = y - 1;
            }
            System.out.print(x + "" + y + " ");
            x = x + 1;

        }
    }



}