package firstassignment;

public class assignment3a {

	public static void main(String[] args) {
		int n = 14;
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<n;j++) 
			{
			    if(i==0||j==0&&i<(3*n)/4||i+j<=(n-1)/2||i==(3*n)/4||j==n-1&&i<(3*n)/4||j-i>=(n-1)/2)
					System.out.print("*");
				else {
					System.out.print(" ");
				     }
			}
			System.out.println();
		}

	}

}
