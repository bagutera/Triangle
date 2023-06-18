import java.util.Scanner;


public class Triangle
{
    private static final String TRIANGLE_EXISTS = "Triangle exists";
    private static final String TRIANGLE_NOT_EXISTS = "Triangle not exists";

    public static void main(String[] args)
    {
        System.out.println("Please enter the length of the three sides of the triangle");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Side A :");
//        boolean side1 = scaner.hasNextInt();
        double sideA = scaner.nextDouble();

        System.out.println("Side B :");
        double sideB = scaner.nextDouble();

        System.out.println("Side C :");
        double sideC = scaner.nextDouble();

        if(sideA >= (sideB+sideC))
        {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }else
        {
            if(sideB >=(sideA + sideC))
            {
                System.out.println(TRIANGLE_NOT_EXISTS);
            }else
            {
                if (sideC >=(sideA + sideB))
                {
                    System.out.println(TRIANGLE_NOT_EXISTS);
                }else{
                    System.out.println(TRIANGLE_EXISTS);
                }
            }
        }
    }
}