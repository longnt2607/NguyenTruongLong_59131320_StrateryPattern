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
public class HangHoa {
    
    private String tenHH, moTa;
    private int gia;
    
    public HangHoa(){
        
    }

    public HangHoa(String tenHH, String moTa, int gia) {
        this.tenHH = tenHH;
        this.moTa = moTa;
        this.gia = gia;
    }

    public String getTenHH() {
        return tenHH;
    }

    public String getMoTa() {
        return moTa;
    }
    
    public int getGia() {
        return gia;
    }
     
    public void inThongTin() {
        System.out.println("Ten hang: " + tenHH + "; Loai hang: " + moTa + "; Gia ban: " + gia);
    }
}
