package multidimensionalArray;

public class MultidimensionalArray {
	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int a[][] = {{1,3,4}, {3,4,5}};
		int b[][] = {{1,3,4}, {3,4,5}};
		

        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }


        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}