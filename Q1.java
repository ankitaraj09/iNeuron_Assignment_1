package Assignment_1;

public class Q1 {
	public static class Question_1 {

		public static void main(String[] args) {
			
			    int n = 11;

			        for (int i = 0; i < n; i++) {

			            // for "I"
			            for (int j = 0; j < n; j++) {
			                if (j == n / 2 || i == 0 || i == n - 1) {
			                    System.out.print("*");
			                } else {
			                    System.out.print(" ");
			                }
			            }

			            System.out.print("   ");

			            // for "N"
			            for (int j = 0; j < n; j++) {
			                if (j == 0 || j == n - 1 || i == j) {
			                    System.out.print("*");
			                } else {
			                    System.out.print(" ");
			                }
			            }

			            System.out.print("   ");

			            // for "E"
			            for (int j = 0; j < n; j++) {
			                if (j == 0 || i == 0 || i == n - 1 || (i == n / 2 && j <= n / 2)) {
			                    System.out.print("*");
			                } else {
			                    System.out.print(" ");
			                }
			            }

			            System.out.print("   ");

			            // for "U"
			            for (int j = 0; j < n; j++) {
			                if ((j == 0 || j == n - 1) && i != n - 1 || i == n - 1 && (j > 0 && j < n - 1)) {
			                    System.out.print("*");
			                } else {
			                    System.out.print(" ");
			                }
			            }

			            System.out.print("   ");

			            // for "R"
			            
						for(int j=0; j<n; j++)
						{
							if(j==0 || i==0 && j<((n-1)/2) || 
							   i==(n-1)/2 && j<((n-1)/2) || 
							   j==((n-1)/2) && i<((n-1)/2) && i>0 || 
							   i-j==(n-1)/2
							  )
							{
								System.out.print("*");
							}
							else 
							{
								System.out.print(" ");
							}
						}

			    
			            // for "O"
			            for (int j = 0; j < n; j++) {
			                if ((j == 0 || j == n - 1) && i != 0 && i != n - 1 || (i == 0 || i == n - 1) && (j > 0 && j < n - 1)) {
			                    System.out.print("*");
			                } else {
			                    System.out.print(" ");
			                }
			            }
			            
			            System.out.print("   ");

			            // for "N"
			            for (int j = 0; j < n; j++) {
			                if (j == 0 || j == n - 1 || i == j) {
			                    System.out.print("*");
			                } else {
			                    System.out.print(" ");
			                }
			            }
			            
			           

			            System.out.println();
			        }
			    }
			}

}