package QuadraticSolver.java;

import java.util.Scanner;

public class QuadraticSolver {
	public static void main(String[] Strings)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap gia tri cua a: ");
		double a = input.nextDouble();
		System.out.print("Nhap gia tri cua b: ");
		double b = input.nextDouble();
		System.out.print("Nhap gia tri cua c: ");
		double c =  input.nextDouble();
		double d = b*b - 4*a*c;
		if (d>0.0)
		{
			//math.pow use to raise the power the some number
			//in this case it means d^1/2
			//example math.pow(3,2) means 3^2 = 9
			double r1 = (-b +Math.pow(d, 0.5))/(2.0*a);
			double r2 = (-b -Math.pow(d, 0.5))/(2.0*a);
			System.out.println("Gia tri cua r1 la: "+r1+" Gia tri cua r2 la: "+r2);
		}
		else if (d==0.0)
		{
			double r =(-b)/(2*a);
			System.out.println("Gia tri cua r1 va r2 la: "+r);
		}
		else
		{
			double r = (-b)/(2*a);
			double i = (-Math.pow(d, 0.5))/2*a;
			System.out.println("Phuong trinh vo nghiem");
			System.out.println("Gia tri cua r1 la: "+r+" +i"+i+" Gia tri cua r2 la: "+r+" -i"+i);
		}
	}

}
