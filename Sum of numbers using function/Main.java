import java.util.Scanner;
class Main{
		public static int sum_of_digits(int n)
   {
      int remainder,sum = 0;
           for (int i=1;i<=n;i++)
             {
               sum=sum+i ;   


              }
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();

     
        int sod = sum_of_digits(n);
        n = sod;
     
     System.out.println(n); //result printed here
   }
}