package businessLogics;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javaBeans.NguoiDung;

public class NguoiDungBL {
	public static NguoiDung timNguoiDung(String email,String password) {
		String sql = "select * from nguoidung where email ='" + email + "' and password = '" + password +"'";
		try (Connection kn = CSDL.getKetNoi()){
			Statement stm = kn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			NguoiDung nd = new NguoiDung();
			if(rs.next()) {
				nd.setId(rs.getInt("id"));
				nd.setEmail(rs.getString("email"));
				nd.setPassword(rs.getString("password"));
				nd.setHoTen(rs.getString("hoten"));
				nd.setDiaChi(rs.getString("diachi"));
				nd.setDtdd(rs.getString("dtdd"));
				nd.setIdVaiTro(rs.getInt("id_vaitro"));
			}
			return nd;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	//kiểm thử
//	public static void main (String [] args) {
//		NguoiDung nd = timNguoiDung("bichle@gmail.com" , "bichle");
//		if(nd!=null)
//			System.out.println("Tìm thấy người dùng");
//		else
//			System.out.println("Không tìm thấy người dùng");
//	}
}
