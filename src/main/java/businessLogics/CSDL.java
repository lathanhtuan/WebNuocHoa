package businessLogics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection ketNoi;
	private static final String url = "jdbc:mysql://localhost:3306/phuong_perfume?useUnicode=true&characterEncoding=UTF-8";
	public static Connection getKetNoi() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ketNoi = DriverManager.getConnection(url,"root", "");
			return ketNoi;
		} catch (ClassNotFoundException |SQLException e) {
			return null;
		}
	}
	
	//kiểm thử chạy được không
	public static void main(String [] args) {
		Connection kn = getKetNoi();
		if(kn!=null)
			System.out.println("Kết nối thành công");
		else
			System.out.println("Kết nối thất bại");
	}
}

