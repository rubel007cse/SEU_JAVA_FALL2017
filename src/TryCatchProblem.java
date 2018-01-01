/**
 * Created by mosharrofrubel on 1/1/18.
 */
public class TryCatchProblem {

    public static void main(String[] arg){

        int[] someArray = {1,3,4,5};

        try {

            System.out.println(someArray[20]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }

    }

}
