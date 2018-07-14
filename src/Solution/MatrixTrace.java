package Solution;
/* Calculate the trace of a matrix (the sum of all diagonal elements)
 */
public class MatrixTrace {
    public static int matrixTrace(int[][] matrix){
        int trace = 0;
        if(matrix.length != matrix[0].length){
            return -1;
        }else{
            int n = matrix.length;
            trace = 0;
            for(int i = 0; i < n; i++){
                trace += matrix[i][i];
            }
            return trace;
        }
    }
    public static void main(String[] args){
        int[][] matrix = {
                {3, 2, 1},
                {3, 4, 4},
                {-1, 0, -1}
        };
        System.out.println(matrixTrace(matrix));
    }
}
