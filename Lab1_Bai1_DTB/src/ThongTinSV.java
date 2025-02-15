/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class ThongTinSV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhap thong tin sinh vien
		System.out.print("Nhap ho ten sinh vien: ");
		String hoTen = scanner.nextLine();
		
		System.out.print("Nhap diem trung binh: ");
        double diemTB = scanner.nextDouble();
		
        // Xuat
        System.out.println("Ho va Ten: " + hoTen);
        System.out.println("Diem trung binh: " + diemTB);
        
        scanner.close();
	}

}
