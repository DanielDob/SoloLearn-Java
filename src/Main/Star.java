package Main;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[][] square = makeMath(size);
		print(square);
	}
	private static int[][] makeMath(int size) {
		int[][] result = new int[size][size];
		for(int i=0;i<size;i++) 
			for(int j=0;j<size;j++)
				result[i][j]=(int) Math.pow(2,
						(i<=Math.floor(size/2) ? i : size - 1 - i)
					  + (j<=Math.floor(size/2) ? j : size - 1 - j)
					  - size/2);
		return result;
	}
	private static void print(int[][] snake) {
		int max = (int) Math.pow(2, snake[0].length/2);
		int maxLenght = String.valueOf(max).length();
		for(int[] i : snake){
			for(int j : i) {
				if(j==0) {
					for(int k=0;k<maxLenght+4;k++) 
						System.out.print(" ");
					continue;
				}
				int spaces = maxLenght-String.valueOf(j).length();
				System.out.print("[ ");
				for(int k=0;k<spaces;k++) 
					System.out.print(" ");
				System.out.print(j+" ]");
			}
			System.out.println("");
		}
		
	}
}
