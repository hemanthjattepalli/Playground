import java.util.Scanner;
public class Main
{
     public static void sum_of_digits(int n )
   {
          int i, number = 1, count; 
          while(number <= n)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.println(number);
		    }
		    number++;
		}
    
   }
   public static void main(String args[]){
          Scanner in = new Scanner(System.in);
     int n= in.nextInt();
     sum_of_digits(n);
     
      }
}
