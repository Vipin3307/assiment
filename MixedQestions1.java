import java.util.Scanner;

public class MixedQestions1 {
    public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        System.out.println("enter Radius of circle : ");
        int radius = scc.nextInt();
        float pi = 3.14F;
        float area= pi*radius*radius;
        System.out.println("area of circle is : " + area);
/*

         //Calculate the hypotenuse of a right triangle using the Pythagorean theorem.

        System.out.println("enter the value of leanth : ");
        int l= scc.nextInt();
        System.out.println("enter the value of width : ");
        int w= scc.nextInt();
      int m = l*l+w*w;
        double hy = m*(1/2);

        System.out.println(hy);
        */

        //Convert a temperature in Celsius to Fahrenheit using the formula F = (C * 9/5) + 32.
        System.out.println("Convert a temperature in Celsius to Fahrenheit using the formula F = (C * 9/5) + 32.");
        System.out.println("enter temperature in Celsius :  ");
        float cel = scc.nextFloat();
        float fahr;
        float F= (cel*9/5) + 32;
        System.out.println("enter temperature in Fahrenheit : " + F);

        // Calculate the average of three numbers and print the result.
        System.out.println("Calculate the average of three numbers and print the result.");
        System.out.println("enter 1st number :  ");
        double oneNumber = scc.nextInt();
        System.out.println("enter 2nd number :  ");
        double secNumber = scc.nextInt();
        System.out.println("enter 3rd number :  ");
        double thrNumber = scc.nextInt();

        double arverage= (oneNumber+secNumber+thrNumber) /3;
        System.out.println("the average of three number is : " + arverage);

        //Find the maximum of two integers and print the result.
        System.out.println("Find the maximum of two integers and print the result.");
        System.out.println(" Enter the 1st number : ");
        int no1= scc.nextInt();
        System.out.println(" Enter the 2nd number : ");
        int no2 = scc.nextInt();
        if (no1>no2)
        {
            System.out.println("1st number is maximum: " + no1);

        }
        if (no2>no1)
        {
            System.out.println(" 2nd number is maximum :" + no2);
        }
        else {
            System.out.println(" both numbers are equal ");
        }

        //Check if a given number is even or odd and print the result.
        System.out.println("Check if a given number is even or odd and print the result.");
        System.out.println("Enter a number to check its even or odd ");
        int evenOddVariable= scc.nextInt();
        if (evenOddVariable%2==0)
        {
            System.out.println("number is even: ");
        }
        else {
            System.out.println("number is odd: " );
        }

        // Convert a character to its ASCII value and print it.
        System.out.println("Convert a character to its ASCII value and print it.");
        char ch= 'a';
        int ascii=ch;
        System.out.println("acii value is : " + ascii);

        //Concatenate two strings and print the result.
        String str = "hello";
                String st2= "sun";
        String join = str+st2;
        System.out.println(join);



    }

}
