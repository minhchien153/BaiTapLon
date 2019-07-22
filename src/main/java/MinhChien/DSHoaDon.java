
package MinhChien;

import java.util.ArrayList;
import java.util.Scanner;


public class DSHoaDon {
    ArrayList<HoaDon> listHD;
    public DSHoaDon(){
        listHD = new ArrayList();
    }
    public void nhapDSHD(){
        int i,n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập số hóa đơn:");
        n = sc.nextInt();
        listHD = new ArrayList(n);
        for (i=0;i<n;i++){
            HoaDon x = new HoaDon();
            x.nhapHD();
            listHD.add(x);
        }
    }
    public void inDSHD(){
        System.out.print("\nDS hóa đơn đã nhập:\n");
        for (HoaDon x: listHD)
            x.inHD();
    }
}
