/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.nhom6.services.impl;

import com.poly.it17322.nhom6.domainmodels.ChiTietSP;
import com.poly.it17322.nhom6.domainmodels.HoaDon;
import com.poly.it17322.nhom6.domainmodels.HoaDonChiTiet;
import com.poly.it17322.nhom6.domainmodels.Imel;
import com.poly.it17322.nhom6.domainmodels.ImelBan;
import com.poly.it17322.nhom6.domainmodels.KhachHang;
import com.poly.it17322.nhom6.repositories.ChiTietSPRepository;
import com.poly.it17322.nhom6.repositories.HoaDonChiTietRepository;
import com.poly.it17322.nhom6.repositories.HoaDonRepository;
import com.poly.it17322.nhom6.repositories.ImelBanRepository;
import com.poly.it17322.nhom6.repositories.ImelRepository;
import com.poly.it17322.nhom6.repositories.KhachHangRepository;
import com.poly.it17322.nhom6.repositories.TaiKhoanRepository;
import com.poly.it17322.nhom6.responses.DonHangRespone;
import com.poly.it17322.nhom6.responses.GioHangRespone;
import com.poly.it17322.nhom6.responses.HoaDonBanHangRespone;
import com.poly.it17322.nhom6.responses.ImelBanHangRespone;
import com.poly.it17322.nhom6.responses.ImelDaBanRespone;
import com.poly.it17322.nhom6.responses.SanPhamBanHangResponse;
import com.poly.it17322.nhom6.responses.khachHangBanHangRespone;
import com.poly.it17322.nhom6.services.IBanHangService;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author LiamTrieu
 */
public class BanHangServiceIml implements IBanHangService {

    ChiTietSPRepository ctsprepo = new ChiTietSPRepository();
    HoaDonChiTietRepository hdctrepo = new HoaDonChiTietRepository();
    HoaDonRepository hdrepo = new HoaDonRepository();
    TaiKhoanRepository tkrepo = new TaiKhoanRepository();
    KhachHangRepository khrepo = new KhachHangRepository();
    ImelBanRepository imlbrepo = new ImelBanRepository();
    ImelRepository imelrepo = new ImelRepository();

    @Override
    public List<HoaDonBanHangRespone> getALLHoaDonBanHang(UUID idNV, int dk) {
        List<HoaDonBanHangRespone> lstHd = new ArrayList<>();
        List<HoaDon> hds = hdrepo.getALLHDTaiQuay(idNV, dk);
        lstHd = hds.stream().map(HoaDonBanHangRespone::new).collect(Collectors.toList());
        List<HoaDonBanHangRespone> lstHDBH = new ArrayList<>();
        return lstHd;
    }

    @Override
    public List<SanPhamBanHangResponse> getAllSpBh() {
        List<ChiTietSP> ctsp = ctsprepo.getSP();
        List<SanPhamBanHangResponse> spbh = ctsp.stream().map(SanPhamBanHangResponse::new).collect(Collectors.toList());
        List<SanPhamBanHangResponse> lstSP = new ArrayList<>();
        for (SanPhamBanHangResponse s : spbh) {
            SanPhamBanHangResponse sp = new SanPhamBanHangResponse();
            try {
                sp = s;
            } catch (Exception e) {
            }
            lstSP.add(sp);
        }
        return lstSP;
    }

    @Override
    public List<GioHangRespone> getAllGH(UUID id) {
        HoaDon hd = hdrepo.SelectHoaDonById(id);
        List<HoaDonChiTiet> hdcts = hdctrepo.SelectByHoaDonCTID(hd.getId());
        List<GioHangRespone> gh = hdcts.stream().map(GioHangRespone::new).collect(Collectors.toList());
        return gh;
    }

    @Override
    public boolean createHoaDon(UUID idNV, int trangThai) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        HoaDon hd = new HoaDon();
        try {
            String maHD = "HD" + sdf.format(new Date());
            if (trangThai == 0) {
                hd.setDiaChi("Tại cửa hàng");
                hd.setKhachHang(khrepo.SelectKHByMa("MacDinh"));
            }
            hd.setMa(maHD);
            hd.setTaiKhoan(tkrepo.SelectTaiKhoanById(idNV));
            hd.setTrangThai(trangThai);
            hd.setNgayTao(new Date());
            hd.setTongTien(new BigDecimal(0));
            hd.setTienShip(new BigDecimal(0));
            hd.setTienMat(new BigDecimal(0));
            hd.setChuyenKhoan(new BigDecimal(0));
            hd.setGiamGia(new BigDecimal(0));
            hd.setLoaiThanhToan(0);
            hdrepo.InsertHoaDon(hd);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean clearHoaDon(DonHangRespone dh) {
        HoaDon hd = hdrepo.SelectHoaDonById(dh.getId());
        try {
            if (dh.getTrangThai() == 1) {
                hd.setDiaChi(null);
                hd.setSdtNguoiShip(null);
                hd.setTenNguoiShip(null);
                hd.setNgayNhanMongMuon(null);
                hd.setTenKH(null);
                hd.setKhachHang(null);
            } else {
                hd.setKhachHang(khrepo.SelectKHByMa("MacDinh"));
            }
            hd.setNgayTao(new Date());
            hd.setTongTien(new BigDecimal(0));
            hd.setTienShip(new BigDecimal(0));
            hd.setTienMat(new BigDecimal(0));
            hd.setChuyenKhoan(new BigDecimal(0));
            hd.setGiamGia(new BigDecimal(0));
            hd.setLoaiThanhToan(0);
            hdrepo.UpdateHoaDon(hd);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean unGH(UUID idHD) {
        try {
            List<HoaDonChiTiet> hdcts = hdctrepo.SelectByHoaDonCTID(idHD);
            for (HoaDonChiTiet s : hdcts) {
                for (ImelBan i : imlbrepo.selectALLImelBan(s.getId())) {
                    Imel imel = imelrepo.SelectImelBanByMa(i.getMa());
                    imel.setTrangThai(1);
                    imelrepo.UpdateImel(imel);
                }
                UUID idSP = s.getChiTietSP().getId();
                int sl = s.getSoLuong();
                ChiTietSP ctsp = ctsprepo.SelectChiTietSPById(idSP);
                int slSP = ctsp.getSoLuong();
                ctsp.setSoLuong(slSP + sl);
                ctsprepo.UpdateChiTietSP(ctsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public DonHangRespone getDonHang(UUID id) {
        HoaDon hd = hdrepo.SelectHoaDonById(id);
        DonHangRespone dh = new DonHangRespone(hd);
        return dh;
    }

    @Override
    public boolean updateDonHang(DonHangRespone dh) {
        try {
            HoaDon hd = hdrepo.SelectHoaDonById(dh.getId());
            if (dh.getTrangThai() == 5) {
                hd.setLyDo(dh.getLyDo());
            }
            if (dh.getIdKH() != null) {
                hd.setKhachHang(khrepo.SelectKhachHangById(dh.getIdKH()));
            }
            hd.setTaiKhoan(tkrepo.SelectTaiKhoanById(dh.getIdNV()));
            hd.setTongTien(dh.getTongTien());
            hd.setGiamGia(dh.getGiamGia());
            hd.setLoaiThanhToan(dh.getHinhThuc());
            hd.setTienMat(dh.getTienMat());
            hd.setChuyenKhoan(dh.getChuyenKhoan());
            hd.setTenKH(dh.getTenkhachHang());
            hd.setDiaChi(dh.getDiaChi());
            if (dh.getTrangThai() == 3 || dh.getTrangThai() == 4) {
                hd.setNgayThanhToan(new Date());
                if (hd.getTrangThai() != 6) {
                    hd.setNgayNhanHang(new Date());
                } else {
                    hd.setNgayNhanHang(dh.getNgayNhan());
                }
            }
            hd.setTrangThai(dh.getTrangThai());
            if (dh.getTrangThai() == 2) {
                hd.setNgayShip(new Date());
                hd.setTienShip(dh.getPhiShip());
                hd.setSdtNguoiShip(dh.getSdtship());
                hd.setTenNguoiShip(dh.getTenship());
                hd.setNgayNhanMongMuon(dh.getNgayNhanMongMuon());
            }
            return hdrepo.UpdateHoaDon(hd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public GioHangRespone getGH(UUID idhd, UUID idsp) {
        List<HoaDonChiTiet> hdcts = hdctrepo.getGH(idhd, idsp);
        List<GioHangRespone> gh = hdcts.stream().map(GioHangRespone::new).collect(Collectors.toList());
        for (GioHangRespone s : gh) {
            if (s.getTrangThai() == 1) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean updateGH(UUID idhd, UUID idsp, int sl) {
        HoaDonChiTiet hdct = new HoaDonChiTiet();
        GioHangRespone gh = getGH(idhd, idsp);
        HoaDon hd = hdrepo.SelectHoaDonById(idhd);
        ChiTietSP ctsp = ctsprepo.SelectChiTietSPById(idsp);
        try {
            if (gh == null) {
                String tensp = ctsp.getSanPham().getTen() + " " + ctsp.getMauSac().getTen() + " " + ctsp.getRam().getTen() + "/" + ctsp.getRom().getTen() + " " + (ctsp.getLoaiHang() == 1 ? "Cũ" : "Mới");
                hdct.setChiTietSP(ctsp);
                hdct.setCreatedDate(new Date());
                hdct.setDonGia(ctsp.getGia());
                hdct.setHoaDon(hd);
                hdct.setSoLuong(sl);
                hdct.setKhuyenMai(new BigDecimal(0));
                hdct.setThanhTien(ctsp.getGia().multiply(new BigDecimal(sl)));
                hdct.setTenSP(tensp);
                hdct.setTrangThai(1);
            } else {
                hdct = hdctrepo.SelectHoaDonChiTietById(gh.getId());
                int soLuong = hdct.getSoLuong();
                hdct.setSoLuong(soLuong + sl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hdctrepo.UpdateHoaDonChiTiet(hdct)) {
            int solg = ctsp.getSoLuong();
            ctsp.setSoLuong(solg - sl);
        }
        return ctsprepo.UpdateChiTietSP(ctsp);
    }

    @Override
    public boolean updateGHXoa(UUID idHDCT) {
        HoaDonChiTiet hdct = hdctrepo.SelectHoaDonChiTietById(idHDCT);
        ChiTietSP ctsp = ctsprepo.SelectChiTietSPById(hdct.getChiTietSP().getId());
        int solg = ctsp.getSoLuong();
        ctsp.setSoLuong(solg + 1);
        ctsprepo.UpdateChiTietSP(ctsp);
        int soLuong = hdct.getSoLuong();
        hdct.setSoLuong(soLuong - 1);
        soLuong = hdct.getSoLuong();
        if (soLuong <= 0) {
            hdctrepo.delete(hdct);
            return true;
        }
        return hdctrepo.UpdateHoaDonChiTiet(hdct);
    }

    @Override
    public List<ImelBanHangRespone> getImel(UUID id) {
        List<Imel> imels = imelrepo.Selectmamel(id);
        return imels.stream().map(ImelBanHangRespone::new).collect(Collectors.toList());
    }

    @Override
    public List<ImelDaBanRespone> getImelBan(UUID idHDCT) {
        List<ImelBan> imels = imlbrepo.selectALLImelBan(idHDCT);
        return imels.stream().map(ImelDaBanRespone::new).collect(Collectors.toList());
    }

    @Override
    public boolean createImelBan(String maImel, UUID hoaDon) {
        try {
            ImelBan imelb = new ImelBan();
            imelb.setMa(maImel);
            imelb.setTrangThai(1);
            imelb.setHoaDonChiTiet(hdctrepo.SelectHoaDonChiTietById(hoaDon));
            if (imlbrepo.InsertImelBan(imelb)) {
                Imel imel = imelrepo.SelectImelBanByMa(maImel);
                imel.setTrangThai(0);
                return imelrepo.UpdateImel(imel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public khachHangBanHangRespone getkh(UUID id) {
        return new khachHangBanHangRespone(khrepo.SelectKhachHangById(id));
    }

    @Override
    public boolean addSpSanner(String maImel, UUID idHD) {
        try {
            Imel imel = imelrepo.SelectImelBanByMa(maImel);
            if (imel.getId() == null) {
                return false;
            } else if (imel.getTrangThai() == 0) {
                return false;
            }
            if (updateGH(idHD, imel.getChiTietSP().getId(), 1)) {
                if (createImelBan(maImel, getGH(idHD, imel.getChiTietSP().getId()).getId())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteImelBan(String ma) {
        ImelBan iml = imlbrepo.SelectImelBanByMa(ma);
        Imel im = imelrepo.SelectImelBanByMa(ma);
        if (imlbrepo.delete(iml)) {
            im.setTrangThai(1);
        }
        return imelrepo.UpdateImel(im);
    }

    @Override
    public void updatRank(UUID id) {
        KhachHang kh = khrepo.SelectKhachHangById(id);
        if (kh.getMa().equals("MacDinh")) {
            return;
        }
        BigDecimal tongTien = hdrepo.getTienByKH(id);
        int rank = 0;
        while (tongTien.compareTo(new BigDecimal(20000000)) >= 0) {
            rank++;
            tongTien = tongTien.subtract(new BigDecimal(20000000));
        }
        if (kh.getCapDo() != rank) {
            kh.setNgayTutHang(new Date());
        }
        kh.setCapDo(rank);
        khrepo.UpdateKhachHang(kh);
    }

    @Override
    public void updateKM(UUID idhdct, BigDecimal km) {
        HoaDonChiTiet hdct = hdctrepo.SelectHoaDonChiTietById(idhdct);
        hdct.setKhuyenMai(km);
        hdctrepo.UpdateHoaDonChiTiet(hdct);
    }
}
