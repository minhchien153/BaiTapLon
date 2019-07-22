
package MinhChien;

import java.util.Scanner;


public class HoaDon extends NhanVien{
    private String maHoaDon, ngayLap;
    public HoaDon(){
    }
    public HoaDon(String mnv, String tnv, String sdt, String dc, String gt, int tuoinv, String mhd, String nl){
        super (tnv,mnv,sdt,dc,gt,tuoinv);
        maHoaDon = mhd;
        ngayLap = nl;
    }
    public void nhapHD(){
        super.NhapNhanVien();
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập mã hóa đơn: ");
	maHoaDon = sc.nextLine();
        System.out.print("Nhập ngày lập: ");
	ngayLap = sc.nextLine();
    }
    public void inHD(){
        super.InNhanVien();
        System.out.printf("\n%10s", maHoaDon);
	System.out.printf("\n%15s", ngayLap);
    }
    
}
