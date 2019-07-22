
package MinhChien;

import java.util.Scanner;


public class Thuoc {
    private String maThuoc;
    private String tenThuoc;
    private int soLuong;
    private double donGia;
    private String ngaySanXuat, hanSuDung, ngayNhapKho;

	public Thuoc() {
            maThuoc = "";
            tenThuoc = "";
            soLuong = 0;
            donGia = 0;
            ngaySanXuat = "";
            hanSuDung = "";
            ngayNhapKho = "";
	}

	public Thuoc(String mt, String tt, int sl, double dg, String nsx, String hsd, String nnk) {
		maThuoc = mt;
		tenThuoc = tt;
		soLuong = sl;
		donGia = dg;
		ngaySanXuat = nsx;
		hanSuDung = hsd;
		ngayNhapKho = nnk;
	}

	public void NhapThuoc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã thuốc: ");
		maThuoc = sc.nextLine();
		System.out.print("\nTên thuốc: ");
		tenThuoc = sc.nextLine();
		System.out.print("\nSố lương: ");
		soLuong = sc.nextInt();
		System.out.print("\nĐơn giá: ");
		donGia = sc.nextDouble();
		System.out.print("\nNgày sản xuất: ");
		ngaySanXuat = sc.nextLine();
		System.out.print("\nHạn sử dụng: ");
		hanSuDung = sc.nextLine();
		System.out.print("\nNgày nhập kho: ");
		ngayNhapKho = sc.nextLine();
	}

	public void InThuoc() {
		System.out.printf("\n%7s", maThuoc);
		System.out.printf("\n%15s", tenThuoc);
		System.out.printf("\n%10d", soLuong);
		System.out.printf("\n%10f", donGia);
		System.out.printf("\n%12s", ngaySanXuat);
		System.out.printf("\n%12s", hanSuDung);
		System.out.printf("\n%13s", ngayNhapKho);
	}

	public String getMaTHuoc() {
		return maThuoc;
	}

	public String getTenThuoc() {
		return tenThuoc;
	}

	public int getSoLuong() {
		return 0;
	}

	public double getDonGia() {
		return 0;
	}

	public String getNgayNhap() {
		return ngayNhapKho;
	}

	public String setMaThuoc(String maThuoc) {
		return this.maThuoc = maThuoc;
	}

	public String getTenThuoc(String tenThuoc) {
		return this.tenThuoc = tenThuoc;
	}

	public int getSoLuong(int soLuong) {
		return this.soLuong = soLuong;

	}

	public String ngayNhapKho(String ngayNhapKho) {
		return this.ngayNhapKho = ngayNhapKho;
	}
}
