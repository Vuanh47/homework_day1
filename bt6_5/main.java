package bt6_5;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Nhập bán kính của hình tròn: ");
		        double radius = scanner.nextDouble();

		        Circle circle = new Circle(radius);
		        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
		        System.out.println("Diện tích hình tròn: " + circle.getArea());

		    }
		}
