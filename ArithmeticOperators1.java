import java.util.Scanner;

public class ArithmeticOperators1 {
    public static void main(String[] args) {
//        Write code to add two integers and print the result.

        Scanner scr= new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1= scr.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2= scr.nextInt();
        int sum = num1+num2;
        System.out.println("sum of 2 number is " + sum);



        // write code to subtract one integer from another and print the result
        System.out.println("Now enter numbers for subtraction");

        System.out.print("enter 1st number for subtaction : ");
        int num3= scr.nextInt();
        System.out.print("enter 2nd number for subtaction : ");
        int num4 = scr.nextInt();
        int sub=num3-num4;
        System.out.println("subraction of 2 number is " + sub);

        // write code to multiply one integer from another and print the result

        System.out.println("Now enter numbers for multiply");

        System.out.print("enter 1st number for multiply : ");
        int num5= scr.nextInt();
        System.out.print("enter 2nd number for multiply : ");
        int num6 = scr.nextInt();
        int mul=num5*num6;
        System.out.println("multiply of 2 number is " + mul);

        // write code to divide one integer from another and print the result

        System.out.println("Now enter numbers for divide");

        System.out.print("enter 1st number for divide : ");
        int num7= scr.nextInt();
        System.out.print("enter 2nd number for divide : ");
        int num8 = scr.nextInt();
        int div=num7/num8;
        System.out.println("divide of 2 number is " + div);


        // write code to find the remainder when dividing one integer by another and  print the result

        System.out.println("Now to get reminder enter numbers  ");

        System.out.print("enter 1st number for divide to get reminder : ");
        int num9= scr.nextInt();
        System.out.print("enter 2nd number for divide to get reminder  : ");
        int num10 = scr.nextInt();
        int reminderr=num9%num10;
        System.out.println("Reminder is " + reminderr);
    }
}
