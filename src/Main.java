
public class Main {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		int c = 1;
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				a[i][j] = c++;
			}
		}
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				if (a[i][j] % 2 == 1) {
					a[i][j] *= 2;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
