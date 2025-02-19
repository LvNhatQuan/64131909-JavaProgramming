package nhatquan.ntu;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Chuong trinh tinh tong \n");
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Moi nhap a");
		double a= banPhim.nextDouble();
		System.out.println("Moi nhap b");
		double b= banPhim.nextDouble();
		double Long = a+b;
		System.out.print("Tong la: ");
		System.out.print(Long);
	}

}
