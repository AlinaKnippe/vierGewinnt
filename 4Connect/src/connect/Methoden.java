package connect;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;


public class Methoden {

	private static final Scanner input = new Scanner(in);
	private static int player = 1;
	
	
	
	public static void setPlayer() {
		if(player == 1){
			player = 2;
		}else{
			player = 1;
		}
	}
	
	
	public static void draw(int[][] f){
		
		out.println();
		out.printf("%d | %d | %d | %d | %d | %d |", f[0][0], f[1][5], f[2][5], f[3][5], f[4][5], f[5][5], f[6][5]);
		out.println();
		out.printf("%d | %d | %d | %d | %d | %d |", f[0][4], f[0][0], f[2][4], f[3][4], f[4][4], f[5][4], f[6][4]);
		out.println();
		out.printf("%d | %d | %d | %d | %d | %d |", f[0][3], f[1][3], f[0][0], f[3][3], f[4][3], f[5][3], f[6][3]);
		out.println();
		out.printf("%d | %d | %d | %d | %d | %d |", f[0][2], f[1][2], f[2][2], f[3][2], f[4][2], f[5][2], f[6][2]);
		out.println();
		out.printf("%d | %d | %d | %d | %d | %d |", f[0][1], f[1][1], f[2][1], f[3][1], f[4][1], f[5][1], f[6][1]);
		out.println();
		out.printf("%d | %d | %d | %d | %d | %d |", f[0][0], f[1][0], f[2][0], f[3][0], f[4][0], f[5][0], f[6][0]);
		out.printf("%n");
		
		out.print("-------------------------");
	}
	
	
	
}
