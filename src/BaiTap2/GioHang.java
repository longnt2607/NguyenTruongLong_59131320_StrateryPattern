/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author long
 */
public class GioHang {
    
    private IThanhToan gioHang;
    private ArrayList<HangHoa> list = new ArrayList<>(); // danh sach cac hang hoa

    public GioHang() {
    }

    public GioHang(IThanhToan gioHang) {
        this.gioHang = gioHang;
    }

    public void themHangHoa(HangHoa hang) {
        list.add(hang);
    }
    
    public void inHoaDon() {
        for (HangHoa x : list) {
            x.inThongTin();
        }
    }
            
    public double thanhToan() {
        double s = 0;
        for (HangHoa x : list) {
            s += x.getGia();
        }
        return gioHang.thanhToan((int)s);
    }
    
    public double tongTienHang() {
        double s = 0;
        for (HangHoa x : list) {
            s += x.getGia();
        }
        return s;
    }
}
