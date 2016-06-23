import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pagerank1 {
	public static void main(String[] args) {
		//ノード数,ノード名,アーク数,アークの始点と終点 を読み込む
		try {
			Scanner input = new Scanner(new File("src/small_data.txt"));
			int n=input.nextInt();
			int i=0;
			System.out.println("nodes");
			for (i=0; i<=n; i++) {
				String nodes = input.nextLine();
				char[] node=nodes.toCharArray();
				System.out.println(node);
			}
			System.out.println("relations");
			int a=input.nextInt();
			for (i=0; i<=a; i++){
				String relations = input.nextLine();
				char[] relation=relations.toCharArray();
				System.out.println(relation);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}