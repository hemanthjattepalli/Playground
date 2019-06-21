import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int reversed=0;
      Scanner in = new Scanner(System.in);
     int num1 = in.nextInt();
     while(num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
       
        }
    System.out.println(reversed);
    
  }
}