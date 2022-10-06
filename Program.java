import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Int Calculations:");
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();
        int intProductResult = a*b;
        int intDivisionResult = a/b;
        System.out.print("Product=");
        System.out.println(intProductResult);
        System.out.print("Division=");
        System.out.println(intDivisionResult);


        System.out.println("Byte Calculations:");
        System.out.print("a=");
        byte k = sc.nextByte();
        System.out.print("b=");
        byte l = sc.nextByte();
        int byteProductResult = k/l;
        int byteDivisionResult = k/l;
        System.out.print("Product=");
        System.out.println(byteProductResult);
        System.out.print("Division=");
        System.out.println(byteDivisionResult);


        System.out.println("Short Calculations:");
        System.out.print("a=");
        short g = sc.nextShort();
        System.out.print("b=");
        short h = sc.nextShort();
        int shortProductResult = g/h;
        int shortDivisionResult = g/h;
        System.out.print("Product=");
        System.out.println(shortProductResult);
        System.out.print("Division=");
        System.out.println(shortDivisionResult);


        System.out.println("Long Calculations:");
        System.out.print("a=");
        long i = sc.nextLong();
        System.out.print("b=");
        long j = sc.nextLong();
        long longProductResult = i/j;
        long longDivisionResult = i/j;
        System.out.print("Product=");
        System.out.println(longProductResult);
        System.out.print("Division=");
        System.out.println(longDivisionResult);


        System.out.println("Float Calculations:");
        System.out.print("a=");
        float c = sc.nextFloat();
        System.out.print("b=");
        float d = sc.nextFloat();
        float floatProductResult = c*d;
        float floatDivisionResult = c/d;
        System.out.print("Product=");
        System.out.println(floatProductResult);
        System.out.print("Division=");
        System.out.println(floatDivisionResult);

        System.out.println("Double Calculations:");
        System.out.print("a=");
        double e = sc.nextDouble();
        System.out.print("b=");
        double f = sc.nextDouble();
        double doubleProductResult = e*f;
        double doubleDivisionResult = e/f;
        System.out.print("Product=");
        System.out.println(doubleProductResult);
        System.out.print("Division=");
        System.out.println(doubleDivisionResult);


        System.out.println("Boolean Calculations:");
        System.out.print("a=");
        boolean m = sc.nextBoolean();
        System.out.print("b=");
        boolean n = sc.nextBoolean();
        System.out.println("You can't product boolean");
        System.out.print("You can't divide boolean");
    }
}