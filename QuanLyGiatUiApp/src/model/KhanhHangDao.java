/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.KhachHang;
import java.sql.*;
import java.util.*;
import util.DBConnection;

/**
 *
 * @author Tai Smart PC
 */
public class KhanhHangDao {
    
    public List<KhachHang> getAll() throws SQLException {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new KhachHang(
                    rs.getInt("KhachHangId"),
                    rs.getString("HoTen"),
                    rs.getString("SoDienThoai"),
                    rs.getString("DiaChi")
                ));
            }
        }
        return list;
    }

    public void insert(KhachHang kh) throws SQLException {
        String sql = "INSERT INTO KhachHang(HoTen,SoDienThoai,DiaChi) VALUES(?,?,?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, kh.getHoTen());
            ps.setString(2, kh.getSdt());
            ps.setString(3, kh.getDiaChi());
            ps.executeUpdate();
        }
    }
}
