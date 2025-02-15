/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Kich thuoc hai canh
		System.out.print("Nhap chieu dai: ");
		double chieuDai = scanner.nextDouble();
		
		System.out.print("Nhap chieu rrong: ");
		double chieuRong = scanner.nextDouble();
		
		 // Tinh toan
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        double canhNho = Math.min(chieuDai, chieuRong);
        
        // Ket qua
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        System.out.println("Canh nho của hinh chu nhat: " + canhNho);
        
        scanner.close();
	}

}
