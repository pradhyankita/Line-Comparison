package com.bridgelabz;
import java.util.Scanner;
public class LineComp {
    int x1,x2,y1,y2;

    public void comparison_Of_Line() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value Of X1");
        x1 = sc.nextInt();

        System.out.println("Enter the Value Of y1");
        y1 = sc.nextInt();

        System.out.println("Enter the Value Of x2");
        x2 = sc.nextInt();

        System.out.println("Enter the Value Of y2");
        y2 = sc.nextInt();

        double Length_Of_Line = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println(" ************* Distance Between Line X and Y ************** ");
        System.out.println("Value of X1:-" + x1 + "\t\t Value of Y1:-" + y1);
        System.out.println("Value of X2:-" + x2 + "\t\t Value of Y2:-" + y2);
        System.out.println("***********************************************************");
        System.out.println("Distance Between Line is:-" + Length_Of_Line);

    }
    public static void main(String args[])
    {
        LineComp LC = new LineComp();

        LC.comparison_Of_Line();
    }

}
