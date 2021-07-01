package Pattern_Prog;

public class pattern3
{  
	public static void main(String[] args) 
    {  
        for (int i=0; i<5; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(""); //print space
            }  
            for (int j=0; j<=5; j++ ) //inner loop for number of columns
            { 
                System.out.println("*"); //print star
            } 
  
            System.out.println(""); //ending line after each row
        } 
}