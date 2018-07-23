import java.io.IOException;

/**
 * 
 * @author albertodiaz
 *
 */
public class Main {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        int sum = 0;
        for(int i=0; i<a[0].length; i++){
                sum = sum + a[i][i];
             }
        
        int sum2=0;
        int j=0; 
        for(int i=a.length-1 ; i>-1; i--){
            sum2 = sum2 + a[i][j];
            j++;
        }
        return Math.abs(sum-sum2);
    }
    public static void main(String[] args) throws IOException {

        int[][] a = new int[3][3];
//        3
//        11 2 4
//        4 5 6
//        10 8 -12
        
        a[0][0]=11;
        a[0][1]=2;
        a[0][2]=4;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=10;
        a[2][1]=8;
        a[2][2]=-12;
        
        System.out.println(diagonalDifference(a));
        
    }

}
