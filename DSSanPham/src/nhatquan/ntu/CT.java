package nhatquan.ntu;

import java.util.ArrayList;

public class CT {

    public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham;
        dsSanPham = new ArrayList<SanPham>();
        
        SanPham sp1 = new SanPham(0, "Kem", "Giai khat", null);
        SanPham sp2 = new SanPham(0, "Com", "Do an", null);
        SanPham sp3 = new SanPham(0, "Pho", "Do an", null);
        
        dsSanPham.add(sp1);
        dsSanPham.add(sp2);
        dsSanPham.add(sp3);
        
        for (int i = 0; i < dsSanPham.size(); i++) {
            SanPham sp = dsSanPham.get(i);
            System.out.println(sp.toString());
        }
    }
}
