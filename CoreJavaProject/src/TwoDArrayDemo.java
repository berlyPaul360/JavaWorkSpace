
public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrixA = new int[3][2];
		
		int[] matrixB[] = new int[3][2];
		
		int matrixC[][] = new int[3][2];
		
		int[][] matrixD = {{1,2,3}, {4,5,6}};
		
		for(int i=0; i<matrixD.length; i++) {
			
			for(int j=0; j< matrixD[i].length;j++) {
				
				System.out.println(matrixD[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
