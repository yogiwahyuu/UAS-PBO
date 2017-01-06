/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SAMSUNG
 */
public interface CRUDInterface {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<PemesananTiket> read() throws SQLException;
    public PemesananTiket readById(int id) throws SQLException;
    public void create(PemesananTiket pt) throws SQLException;
    public void delete(PemesananTiket pt) throws SQLException;
    public void update(PemesananTiket pt) throws SQLException;    
}
