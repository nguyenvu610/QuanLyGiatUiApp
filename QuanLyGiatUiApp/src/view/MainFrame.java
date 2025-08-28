/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Tai Smart PC
 */
public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {
        setTitle("Quản Lý Tiệm Giặt Ủi");
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        // Quản lý Khách hàng
        JMenu menuKhanhHang = new JMenu("Khách hàng");
        JMenuItem qlKhanhHang = new JMenuItem("Quản Lý khách Hàng");

        // Quản lý Dịch vụ
        JMenu menuDichVu = new JMenu("Dịch Vụ");
        JMenuItem qlDichVu = new JMenuItem("Quản Lý Dịch Vụ");

        // Quản lý Đơn hàng
        JMenu menuDonGiat = new JMenu("Đơn Giặt Ủi");
        JMenuItem qlDonGiat = new JMenuItem("Quản Lý Đơn Giặt");

        // Thanh toán
        JMenu menuThanhToan = new JMenu("Thanh Toán");
        JMenuItem qlThanhToan = new JMenuItem("Hóa Đơn Thanh Toán");

        // Tra cứu Đơn hàng
        JMenu menuTraCuu = new JMenu("Tra Cứu Đơn Hàng");
        JMenuItem qlTimKiem = new JMenuItem("Tìm Kiếm Đơn Hàng");

        // Thống kê - Báo cáo
        JMenu menuThongKe = new JMenu("Thống Kê - Báo Cáo");
        JMenuItem tkDoanhThu = new JMenuItem("Doanh thu");
        JMenuItem tkDon = new JMenuItem("Số lượng đơn");

        // Gắn item vào menu
        menuKhanhHang.add(qlKhanhHang);
        menuDichVu.add(qlDichVu);
        menuDonGiat.add(qlDonGiat);
        menuThanhToan.add(qlThanhToan);
        menuTraCuu.add(qlTimKiem);
        menuThongKe.add(tkDoanhThu);
        menuThongKe.add(tkDon);

        // Thêm tất cả menu vào MenuBar
        menuBar.add(menuKhanhHang);
        menuBar.add(menuDichVu);
        menuBar.add(menuDonGiat);
        menuBar.add(menuThanhToan);
        menuBar.add(menuTraCuu);
        menuBar.add(menuThongKe);
        setJMenuBar(menuBar);

        // Panel chính dùng CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Thêm các panel chức năng
        mainPanel.add(new QuanLyKhachHangPanel(), "QL_KHANHHANG");
        mainPanel.add(new QuanLyDichVuPanel(), "QL_DICHVU");
        mainPanel.add(new QuanLyDonGiatUiPanel(), "QL_DONGIATUI");
        mainPanel.add(new ThanhToanHoaDonPanel(), "QL_HOADON");
        mainPanel.add(new TraCuuDonHangPanel(), "QL_TIMKIEM");
        mainPanel.add(new ThongKeDonHangPanel(), "QL_DONHANG");
        mainPanel.add(new ThongKeDoanhThuPanel(), "QL_DOANHTHU");

        add(mainPanel, BorderLayout.CENTER);

        // Xử lý sự kiện menu
        qlKhanhHang.addActionListener(e -> cardLayout.show(mainPanel, "QL_KHANHHANG"));
        qlDichVu.addActionListener(e -> cardLayout.show(mainPanel, "QL_DICHVU"));
        qlDonGiat.addActionListener(e -> cardLayout.show(mainPanel, "QL_DONGIATUI"));
        qlThanhToan.addActionListener(e -> cardLayout.show(mainPanel, "QL_HOADON"));
        qlTimKiem.addActionListener(e -> cardLayout.show(mainPanel, "QL_TIMKIEM"));
        tkDon.addActionListener(e -> cardLayout.show(mainPanel, "QL_DONHANG"));
        tkDoanhThu.addActionListener(e -> cardLayout.show(mainPanel, "QL_DOANHTHU"));
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
