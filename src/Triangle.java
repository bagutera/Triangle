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
        int sideA = scaner.nextInt();

        System.out.println("Side B :");
        int sideB = scaner.nextInt();

        System.out.println("Side C :");
        int sideC = scaner.nextInt();

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