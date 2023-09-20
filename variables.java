//create two int variable x and y and swap their values without using temp variable
import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = 20-10;
        x=10+z;
        y=20-z;
        System.out.println("value of x is : " + x);
        System.out.println("value of y is : " + y);


//using user input

        Scanner scr = new Scanner(System.in);
        System.out.print("enter the value of X: ");
        int X= scr.nextInt();
        System.out.print("enter the value of Y: ");
        int Y= scr.nextInt();
        if (X>=Y)
        {
            int Z= X-Y;
            X=X-Z;
            Y=Y+Z;
            System.out.println("value of x is : " + X);
            System.out.println("value of y is : " + Y);
        }
        else{
            int Z=Y-X;
            X=X+Z;
            Y=Y-Z;
            System.out.println("value of x is : " + X);
            System.out.println("value of y is : " + Y);
        }




        // calculate the area of ractangle using variables length and width,and print the result

        Scanner scc=new Scanner(System.in);
        System.out.print("enter the length of rectangle : ");
        int length = scc.nextInt();
        System.out.print("enter the width of rectangle : ");
        int width = scc.nextInt();
        int area= length*width;
        System.out.println("Area of rectangle is : " + area);


  // Write code to increment an integer variable count by 1.

        System.out.print("enter value to increment  ");
        int incrementt= scc.nextInt();
        System.out.println("before increment value is : " + incrementt);
        incrementt++;
        System.out.println("after increment value is : " + incrementt);

     //   Declare a constant variable PI with a value of 3.14159.

        float PI = 3.14159f;
        System.out.println("pie value is : " + PI);

        // Calculate the simple interest using variables principal, rate, and time, and print the result.
        System.out.print("enter principal : ");
        int principal = scc.nextInt();
        System.out.print("enter rate : ");
        int rate = scc.nextInt();
        System.out.print("enter time : ");
        int time = scc.nextInt();
        int sInterest= principal*rate*time/100;
        System.out.println("simple interest is : " + sInterest);


    }
}
