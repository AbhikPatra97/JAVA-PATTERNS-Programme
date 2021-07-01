package Pattern_Prog;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("");
			}
			
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
				System.out.println("");
				
		}

	}

}
