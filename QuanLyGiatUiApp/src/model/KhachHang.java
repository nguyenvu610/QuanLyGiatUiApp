/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tai Smart PC
 */
public class KhachHang {
    private int id;
    private String hoTen;
    private String sdt;
    private String diaChi;

    // Constructors
    public KhachHang() {}
    public KhachHang(int id, String hoTen, String sdt, String diaChi) {
        this.id = id; this.hoTen = hoTen; this.sdt = sdt; this.diaChi = diaChi;
    }

    // Getter, Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public String getSdt() { return sdt; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
}
