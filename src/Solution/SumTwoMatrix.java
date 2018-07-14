package Solution;

import java.util.Arrays;

public class SumTwoMatrix {
    public static int[][] sumTwoMatrix(int[][] a, int[][] b){
        if(a.length == 0 || b.length == 0 || a == null || b == null){
            return null;
        }
        if(a.length != b.length || a[0].length != b[0].length){
            return null;
        }else{
            int m = a.length, n = a[0].length;
            int[][] res = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    res[i][j] = a[i][j] + b[i][j];
                }
            }
            return res;
        }
    }
    private static void print(int[][] res){
        for(int[] r: res){
            System.out.println(Arrays.toString(r));
        }

    }
    public static void main(String[] args) {
        int[][] a = {
                {3, 2, 1},
                {3, 4, 4}
        };
        int[][] b = {
                {-1, 0, -1},
                {4, 2, 1}
        };
        int[][] c = sumTwoMatrix(a, b);
        print(c);
    }
}
