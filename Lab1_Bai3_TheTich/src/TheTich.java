/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Nhap dô dai canh
        System.out.print("Nhap do dai canh cua khoi lap phuong: ");
        double canh = scanner.nextDouble();
        
        // Tinh the tich
        double theTich = canh * canh * canh; 
        
        // Ket qua
        System.out.println("Do dai canh: " + canh);
        System.out.println("The tich khoi lap phuong: " + theTich);
        
        scanner.close();
	}

}
