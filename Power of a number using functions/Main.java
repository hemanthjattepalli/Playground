import java.util.Scanner;
class Main{
	public static int sum_of_digits(int base,int exponent )
   {
           int result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
            return result;
              }
	public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int base= in.nextInt();
    int exponent = in.nextInt();

     
        int n = sum_of_digits(base,exponent);
        
     
     System.out.println(n); //result printed here
   }
}