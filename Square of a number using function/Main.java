import java.util.Scanner;
class Main
{
	public static int square_num(int m)
   {
      
      return m*m;
   }
	public static void main(String[] args) {
	    int square ;
	Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     square =square_num(n);
     System.out.println(square); 
     
	
	} 
}