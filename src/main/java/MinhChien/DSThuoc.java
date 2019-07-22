
package MinhChien;

import java.util.ArrayList;
import java.util.Scanner;


public class DSThuoc {
    ArrayList<Thuoc> listT;
    public DSThuoc(){
        listT = new ArrayList();
    }
    public void nhapDSThuoc(){
    int i,n;
    Scanner sc = new Scanner (System.in);
    System.out.print("Nhập số lượng thuốc:");
    n = sc.nextInt();
    listT = new ArrayList(n);
    for (i=0;i<n;i++){
        Thuoc x = new Thuoc();
        x.NhapThuoc();
        listT.add(x);
        }
    }
    public void inDSThuoc(){
        System.out.print("\nDS Thuốc đã nhập:");
        for (Thuoc x: listT)
            x.InThuoc();
    }
}
