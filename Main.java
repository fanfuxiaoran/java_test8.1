package test8_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		String s = "";
		HashMap<String, Integer> index = new HashMap<String, Integer>();
		while ( !(s = in.next()).equals("###")) {
			index.put(s, count);
			count++;
		};
		
		int[][] milestable = new int[count][count];
		for ( int i=0; i<milestable.length; i++) {
			for (int j=0; j<(milestable[0].length); j++) {
				milestable[i][j] = in.nextInt();
			}
		}
		
		String from = in.next();
		String to = in.next();
		System.out.println(milestable[index.get(from)][index.get(to)]);
	}

}
