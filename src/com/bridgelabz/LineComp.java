package com.bridgelabz;
import java.util.Scanner;
public class LineComp {
    int x1,x2,y1,y2;
    int a1,a2,b1,b2;
    public void comparison_Of_Line()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Line 1 Value Of X1");
        x1 = sc.nextInt();

        System.out.println("Enter Line 1 Value Of y1");
        y1 = sc.nextInt();

        System.out.println("Enter Line 1 Value Of x2");
        x2 = sc.nextInt();

        System.out.println("Enter Line 1 Value Of y2");
        y2 = sc.nextInt();


        System.out.println("Enter Line 2 the Value Of a1");
        a1 = sc.nextInt();

        System.out.println("Enter Line 2 the Value Of b1");
        b1 = sc.nextInt();

        System.out.println("Enter Line 2 the Value Of a2");
        a2 = sc.nextInt();

        System.out.println("Enter Line 2 the Value Of b2");
        b2 = sc.nextInt();



        double Length_Of_Line1 =(int) Math.sqrt((x2-x1)^2+(y2-y1)^2);
        double Length_Of_Line2 =(int)Math.sqrt((a2-a1)^2+(b2-b1)^2);


        System.out.println(" ****** First Line co-ordinates ****** | \t ****** Second Line co-ordinates ****** ");
        System.out.println("Value of X1:-" +x1+ "\t\t Value of Y1:-"+y1+ "|\tValue of A1:-" +a1 + "\t\t Value of B1:-"+b1);
        System.out.println("Value of X2:-" +x2+ "\t\t Value of Y2:-"+y2+ "|\tValue of A2:-" +a2 + "\t\t Value of B2:-"+b2);
        System.out.println("***********************************************************");
        System.out.println("Line 1 is:-"+Length_Of_Line1);
        System.out.println("Line 2 is:-"+Length_Of_Line2);

        double s1=Length_Of_Line1;
        double s2=Length_Of_Line2;
        if(s1 == s2 )
        {
            System.out.println("Both Lines are equals");
        }
        else
        {
            System.out.println("Lines are not Equal");
        }

        Integer Length1 = (int) Length_Of_Line1;
        Integer Length2 = (int) Length_Of_Line2;

        int Result = Length1.compareTo(Length2);

        if(Result == 0 )
        {
            System.out.println("Line 1 is Greater ");
        }
        else
        {
            System.out.println("Line 2 is Greater ");

        }
    }
    public static void main(String args[])
    {
        LineComp LC = new LineComp();

        LC.comparison_Of_Line();
    }
}