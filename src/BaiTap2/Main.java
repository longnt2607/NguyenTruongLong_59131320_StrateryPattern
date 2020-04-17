/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author long
 */
public class Main {
    public static void main (String[] args) {
        
        HangHoa hang1 = new HangHoa("bong den", "den Huynh Quang", 200000);
        HangHoa hang2 = new HangHoa("xe may", "xe Honda", 20000000);
        HangHoa hang3 = new HangHoa("laptop", "laptop MSI", 22000000);
        
        HangHoa hang4 = new HangHoa("giay the thao", "giay sneaker Adidas", 4000000);
        HangHoa hang5 = new HangHoa("smartphone", "Iphon X", 19000000);
        HangHoa hang6 = new HangHoa("quat dien", "quat dien Shenko", 150000);
        
        var thanhToanOnline = new ThanhToanOnline();
        var thanhToanCOD = new ThanhToanCOD();
        
        GioHang gioOnline = new GioHang(thanhToanOnline);
        GioHang gioCOD = new GioHang(thanhToanCOD);
        
        gioOnline.themHangHoa(hang1);
        gioOnline.themHangHoa(hang2);
        gioOnline.themHangHoa(hang3);
        
        gioCOD.themHangHoa(hang4);
        gioCOD.themHangHoa(hang5);
        gioCOD.themHangHoa(hang6);
        
        System.out.println("----- Hoa don gio hang Online -----");
        gioOnline.inHoaDon();
        System.out.println("Tong tien hang: " + (int)gioOnline.tongTienHang());
        System.out.println("So tien phai tra: " + (int)gioOnline.thanhToan() + "\n");
        
        System.out.println("----- Hoa don gio hang COD -----");
        gioCOD.inHoaDon();
        System.out.println("Tong tien hang: " + (int)gioCOD.tongTienHang());
        System.out.println("So tien phai tra: " + (int)gioCOD.thanhToan() + "\n");
    }
}
