package hsu.aasvogel;

public class calctable {

	public static void main(String[] args) {
		for(int j=1 ; j<10 ; j++) {
			for(int i=2 ; i<6 ; i++) {
				int result = i*j;
				System.out.printf("%d x %d = %d\t",i,j,result);
			}
			System.out.println();
		}

	}

}
