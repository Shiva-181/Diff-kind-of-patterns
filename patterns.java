package diffpatterns;

public class patterns {

	public static void main(String[] args) {
		printPattern1(5);
		printPattern2(5);
		printPattern3(5);
		printPattern4(5);
		printPattern5(9);
	}
	
	/*
	 *  12345
		12345
		12345
		12345
		12345
	 */
	static void printPattern1(int n) {
		
		
		
		for (int i=0; i< n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	static void printPattern2(int n) {
		
		for (int i=1; i <= n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	static void printPattern3(int n) {
		
		for (int i=1; i <= n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
//	    1 .. every line i need to print N-i spaces
//	   12
//	  123
//	 1234
//	12345 

	
	static void printPattern4(int n) {
		
		for (int i=1; i <= n; i++) {
			
			for (int k=1; k<=(n-i); k++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	static void printPattern5(int n) {
		
		for (int i=1; i <= n; i++) {
			
			for (int k=1; k<=(n-i); k++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
