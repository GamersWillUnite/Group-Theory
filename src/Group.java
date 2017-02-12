public class Group {
public int[][] a = new int[3][3];
public int[][] b = new int [3][3];
public int[][] c = new int [3][3];	
public void setup(){
	 
		a [0] [0] = 1;
		a [0] [1] = 0;
		a [0] [2] = 0;
		a [1] [0] = 0;
		a [1] [1] = 0;
		a [1] [2] = 1;
		a [2] [0] = 0;
		a [2] [1] = 1;
		a [2] [2] = 0;
		
		
		b [0] [0] = 0;
		b [0] [1] = 0;
		b [0] [2] = 1;
		b [1] [0] = 0;
		b [1] [1] = 1;
		b [1] [2] = 0;
		b [2] [0] = 1;
		b [2] [1] = 0;
		b [2] [2] = 0;
		
		
		c [0] [0] = 0;
		c [0] [1] = 1;
		c [0] [2] = 0;
		c [1] [0] = 1;
		c [1] [1] = 0;
		c [1] [2] = 0;
		c [2] [0] = 0;
		c [2] [1] = 0;
		c [2] [2] = 1;
	}
public int[][] getA(){
	return a;
}

public int[][] getB(){
	return b;
}

public int[][] getC(){
	return c;
}

	public int[][] identity(int size) {
		int[][] idmatrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					idmatrix[i][j] = 1;
				} else {
					idmatrix[i][j] = 0;
				}
			}
		}
		return idmatrix;
	}

	private int dotproduct(int[][] first, int[][] second, int row, int column) {
		int result = 0;
		for (int i = 0; i < first[0].length; i++) {
			int transvalue = first[row][i] * second[i][column];
			result = result + transvalue;
		}
		return result;

	}

	public  int[][] multiply(int[][] first, int[][] second) {
		int[][] newmatrix = new int[first.length][second[0].length];
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second[0].length; j++) {
				newmatrix[i][j] = dotproduct(first, second, i, j);
			}
		}
		return newmatrix;
	}
	public void printMatrix(int[][] matrix){
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[0].length; j++){
		System.out.print(matrix[i][j] + "  ");
		
			}
			System.out.println("\n ");
		}
	}
}