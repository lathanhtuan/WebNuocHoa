package businessLogics;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javaBeans.SanPham;
import javaBeans.SanPhamMua;

public class GioHang {
	private Hashtable<Integer, Integer> dsh;
	public GioHang() {
		dsh = new Hashtable<>(); //key: id sản phẩm , value:số lượng mua.
	}
	
	public void them (int idsp, int slm) {
		if(dsh.containsKey(idsp))
			dsh.replace(idsp, dsh.get(idsp) + slm);
		else
			dsh.put(idsp, slm);
	}
	
	public int soMatHang() {
		return dsh.size();
	}
	
	public double tongTien() {
		double tt = 0 ;
		for(int id:dsh.keySet()) {
			SanPham sp= SanPhamBL.docTheoId(id);
			tt += sp.getDonGiaKM() * dsh.get(id);
		}
		return tt;
	}
//	public static void main (String [] args) {
//		GioHang gh = new GioHang();
//		gh.them(1, 1);
//		gh.them(2, 1);
//		gh.them(1, 1);
//		for(int id:gh.dsh.keySet()) {
//			SanPham sp = SanPhamBL.docTheoId(id);
//			System.out.println("id: " +id +" Ten: " +sp.getTenSanPham() + " So luong mua: " +gh.dsh.get(id));
//			
//		}
//		System.out.println("So mat hang: " +gh.soMatHang());
//		System.out.println("Tong so tien: " +gh.tongTien());
//		List<SanPhamMua> ds = gh.danhSachSanPhamMua();
//		ds.forEach(spm->System.out.println(spm.getTenSanPham()));
//	}
	
	public List<SanPhamMua> danhSachSanPhamMua(){
		List<SanPhamMua> ds = new ArrayList<>();
		for(int id:dsh.keySet()) {
			SanPham sp = SanPhamBL.docTheoId(id);
			SanPhamMua spm = new SanPhamMua();
			spm.setId(sp.getId());
			spm.setTenSanPham(sp.getTenSanPham());
			spm.setMoTa(sp.getMoTa());
			spm.setHinhAnh(sp.getHinhAnh());
			spm.setDonGia(sp.getDonGia());
			spm.setDonGiaKM(sp.getDonGiaKM());
			spm.setSoLuong(sp.getSoLuong());
			spm.setNgayTao(sp.getNgayTao());
			spm.setHienThi(sp.getHienThi());
			spm.setIdLoai(sp.getIdLoai());
			spm.setIdThuongHieu(sp.getIdThuongHieu());
			spm.setSoLuongMua(dsh.get(id));
			ds.add(spm);
		}
		return ds;
	}
}
