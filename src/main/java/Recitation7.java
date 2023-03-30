/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment
    private static String repeat(char ch, int ntimes){
        String result = "";
        for(int count =0; count < ntimes; count++){
            result += ch;
        }
        return result;
    }

    public static String leftRightTriangle(int height)
    {
        String str = "";
        for(int row = 0; row < height; row++){
           str += repeat('*', row+1) + "\n";
            }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for (int row = 0; row < height; row++) {
            str += repeat(' ', height - row - 1) + repeat('*', row + 1) + "\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        //add your code here for loop: radius-1 to -radius+1, inclusively
        for(int radii = radius-1; radii >= -radius+1; radii--){
            int x = (int)Math.sqrt(radius*radius-radii*radii);
            str += repeat(' ', radius-x ) + repeat('*', 2*x) +"\n";
        }

        int diameter = radius*2;

        return str;
    }
}
