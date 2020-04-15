/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author long
 */
public class Context {
    
    private ITinh tinhToan;

    public Context() {
    }
    
    
    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }
    
    public static void main (String[] args) {
        
        var phepCong = new Cong();
        var phepTru = new Tru();      
        var conText = new Context();
        
        conText.setTinhToan(phepCong);
        System.out.println("75 + 12 = " + conText.tinh(75, 12));
        
        conText.setTinhToan(phepTru);
        System.out.println("54 - 78 = " + conText.tinh(54, 78));
    }
}
