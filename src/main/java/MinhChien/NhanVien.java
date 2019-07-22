
package MinhChien;

import java.util.Scanner;


public class NhanVien {
    private String maNhanVien, tenNhanVien, soDienThoai, diaChi, gioiTinh;
    private int tuoiNhanVien;

	public NhanVien() {
	}

	public NhanVien(String mnv, String tnv, String sdt, String dc, String gt, int tuoinv) {
		maNhanVien = mnv;
		tenNhanVien = tnv;
		soDienThoai = sdt;
		diaChi = dc;
		gioiTinh = gt;
		tuoiNhanVien = tuoinv;
	}
	public void NhapNhanVien() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã nhân viên: ");
		maNhanVien = sc.nextLine();
		System.out.print("\nTên nhân viên: ");
                sc.nextLine();
		tenNhanVien = sc.nextLine();
		System.out.print("\nSố điện thoại: ");
		soDienThoai = sc.nextLine();
		System.out.print("\nĐịa chỉ: ");
		diaChi = sc.nextLine();
		System.out.print("\nGiới tính: ");
		gioiTinh = sc.nextLine();
		System.out.print("\nTuổi: ");
		tuoiNhanVien = sc.nextInt();
	}
	
	public void InNhanVien() {
		System.out.printf("\n%7s", maNhanVien);
		System.out.printf("\n%15s", tenNhanVien);
		System.out.printf("\n%10s", soDienThoai);
		System.out.printf("\n%15s", diaChi);
		System.out.printf("\n%7s", gioiTinh);
		System.out.printf("\n%12d", soDienThoai);
	}
	
	public String getTenNV() {
		return this.tenNhanVien;
	}
	public String setTenNV(String tenNhanVien) {
		return this.tenNhanVien  =tenNhanVien;
	}
}
