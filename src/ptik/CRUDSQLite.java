/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SAMSUNG
 */
public class CRUDSQLite implements CRUDInterface{
    private Connection conn;
    
    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:Sqlite:datapemesanantiket.db");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<PemesananTiket> read() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from pemesanan");
        ArrayList<PemesananTiket> listPemesananTiket = new ArrayList();
        while (rs.next()) {
            PemesananTiket pt = new PemesananTiket();
            pt.setId(rs.getInt(1));
            pt.setNamapemesan(rs.getString(2));
            pt.setTelp(rs.getString(3));
            pt.setNamakereta(rs.getString(4));
            pt.setKelas(rs.getString(5));
            pt.setStasiunasal(rs.getString(6));
            pt.setStasiuntujuan(rs.getString(7));
            pt.setTglberangkat(rs.getString(8));
            pt.setJamberangkat(rs.getString(9));
            pt.setHarga(rs.getInt(10));
            listPemesananTiket.add(pt);
        }
        return listPemesananTiket;
    }

    @Override
    public PemesananTiket readById(int id) throws SQLException {
        String query = "select * from pemesanan where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);  
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        PemesananTiket pt = new PemesananTiket();
        while (rs.next()) {            
            pt.setId(rs.getInt(1));
            pt.setNamapemesan(rs.getString(2));
            pt.setTelp(rs.getString(3));
            pt.setNamakereta(rs.getString(4));
            pt.setKelas(rs.getString(5));
            pt.setStasiunasal(rs.getString(6));
            pt.setStasiuntujuan(rs.getString(7));
            pt.setTglberangkat(rs.getString(8));
            pt.setJamberangkat(rs.getString(9));
            pt.setHarga(rs.getInt(10));
        }
        return pt;
    }

    @Override
    public void create(PemesananTiket pt) throws SQLException {
        String query = "insert into pemesanan(nama_pemesan, telp, nama_kereta, kelas, stasiun_asal, stasiun_tujuan, tgl_berangkat, jam_berangkat, harga) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, pt.getNamapemesan());
        ps.setString(2, pt.getTelp());
        ps.setString(3, pt.getNamakereta());
        ps.setString(4, pt.getKelas());
        ps.setString(5, pt.getStasiunasal());
        ps.setString(6, pt.getStasiuntujuan());
        ps.setString(7, pt.getTglberangkat());
        ps.setString(8, pt.getJamberangkat());
        ps.setInt(9, pt.getHarga());
        ps.execute();
    }

    @Override
    public void delete(PemesananTiket pt) throws SQLException {
        String query = "delete from pemesanan where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, pt.getId());
        ps.execute();
    }

    @Override
    public void update(PemesananTiket pt) throws SQLException {
        String query = "update pemesanan set nama_pemesan=?, telp=?, nama_kereta=?, kelas=?, stasiun_asal=?, stasiun_tujuan=?, tgl_berangkat=?, jam_berangkat=?, harga=? where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, pt.getNamapemesan());
        ps.setString(2, pt.getTelp());
        ps.setString(3, pt.getNamakereta());
        ps.setString(4, pt.getKelas());
        ps.setString(5, pt.getStasiunasal());
        ps.setString(6, pt.getStasiuntujuan());
        ps.setString(7, pt.getTglberangkat());
        ps.setString(8, pt.getJamberangkat());
        ps.setInt(9, pt.getHarga());
        ps.setInt(10, pt.getId());
        ps.execute();
    }  
}

