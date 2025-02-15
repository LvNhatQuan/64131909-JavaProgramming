/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        // Nhap cac he so
        System.out.println("Nhap cac he so cua phuong trinh ax^2 + bx + c = 0");
        
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
        // Tinh Delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Tinh can Delta neu Delta >= 0
        double canDelta = 0;
        if (delta >= 0) {
            canDelta = Math.sqrt(delta);
        }
        
        // Xuat ket qua
        System.out.println("Phương trình: " + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("Delta = " + delta);
        
        if (delta >= 0) {
            System.out.println("Can Delta = " + canDelta);
        } else {
            System.out.println("Delta am");
        }
        
        scanner.close();
	}

}
