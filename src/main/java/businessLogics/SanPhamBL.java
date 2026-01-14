package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.SanPham;

public class SanPhamBL {
	public static List<SanPham> docSanPhamMoi(int top){
		String sql = "select * from sanpham order by ngaytao desc limit 0," +top;
		List<SanPham> ds  = new ArrayList<>();
		try (Connection kn = CSDL.getKetNoi()){
			Statement stm = kn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()){
				SanPham p = new SanPham();
				p.setId(rs.getInt("id"));
				p.setTenSanPham(rs.getString("tenSanPham"));
				p.setMoTa(rs.getString("mota"));
				p.setHinhAnh(rs.getString("hinhAnh"));
				p.setDonGia(rs.getDouble("dongia"));
				p.setDonGiaKM(rs.getDouble("dongiakm"));
				p.setSoLuong(rs.getInt("soluong"));
				p.setNgayTao(rs.getDate("ngaytao"));
				p.setHienThi(rs.getInt("hienthi"));
				p.setIdLoai(rs.getInt("id_loai"));
				p.setIdThuongHieu(rs.getInt("id_thuonghieu"));
				ds.add(p);
			}
			return ds;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static SanPham docTheoId(int id){
		String sql = "select * from sanpham where id=" +id;
		try (Connection kn = CSDL.getKetNoi()){
			Statement stm = kn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			SanPham sp = new SanPham();
			while(rs.next()){
				sp.setId(rs.getInt("id"));
				sp.setTenSanPham(rs.getString("tenSanPham"));
				sp.setMoTa(rs.getString("mota"));
				sp.setHinhAnh(rs.getString("hinhAnh"));
				sp.setDonGia(rs.getDouble("dongia"));
				sp.setDonGiaKM(rs.getDouble("dongiakm"));
				sp.setSoLuong(rs.getInt("soluong"));
				sp.setNgayTao(rs.getDate("ngaytao"));
				sp.setHienThi(rs.getInt("hienthi"));
				sp.setIdLoai(rs.getInt("id_loai"));
				sp.setIdThuongHieu(rs.getInt("id_thuonghieu"));
			}
			return sp;
		} catch (Exception e) {
			return null;
		}
	}
	// kiểm tra coi thử đúng không
	public static void main(String[] args) {
		SanPham sp = docTheoId(1);
		System.out.println(sp.getTenSanPham());
	}
	
	
}
