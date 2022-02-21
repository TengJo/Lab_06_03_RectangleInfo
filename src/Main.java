import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	double width = 1;
    double length = 1;
    String trashWidth;
    String trashLength;
    double area;
    double perimeter;
    double diagonal;
    Scanner in = new Scanner(System.in);

        System.out.print("What is the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
        }
        else
        {
            trashWidth = in.nextLine();
            System.out.println("You have input an incorrect value: "+ trashWidth);
            System.exit(0);
        }

        System.out.print("What is the length of the rectangle: ");
        if  (in.hasNextDouble())
        {
            length = in.nextDouble();
        }
        else
        {
            trashLength = in.next();
            System.out.println("You have input an incorrect value: " + trashLength);
            System.exit(0);
        }

        area = width * length;
        perimeter = width * 2 + length * 2;
        diagonal =Math.sqrt( Math.pow(width, 2) + Math.pow(length, 2));
        System.out.printf("The area of the rectangle is: %5.2f\n", area);
        System.out.printf("The perimeter of the rectangle is: %5.2f\n", perimeter);
        System.out.printf("The diagonal of the rectangle is: %5.2f\n", diagonal);


    }
}
