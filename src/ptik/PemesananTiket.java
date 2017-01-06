/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;

/**
 *
 * @author SAMSUNG
 */
public class PemesananTiket {
    private int id;
    private String namapemesan;
    private String telp;
    private String namakereta;
    private String kelas;
    private String stasiunasal;
    private String stasiuntujuan;
    private String tglberangkat;
    private String jamberangkat;
    private int harga;

    public PemesananTiket() {
    }

    public PemesananTiket(int id, String namapemesan, String telp, String namakereta, String kelas, String stasiunasal, String stasiuntujuan, String tglberangkat, String jamberangkat, int harga) {
        this.id = id;
        this.namapemesan = namapemesan;
        this.telp = telp;
        this.namakereta = namakereta;
        this.kelas = kelas;
        this.stasiunasal = stasiunasal;
        this.stasiuntujuan = stasiuntujuan;
        this.tglberangkat = tglberangkat;
        this.jamberangkat = jamberangkat;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamapemesan() {
        return namapemesan;
    }

    public void setNamapemesan(String namapemesan) {
        this.namapemesan = namapemesan;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getNamakereta() {
        return namakereta;
    }

    public void setNamakereta(String namakereta) {
        this.namakereta = namakereta;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getStasiunasal() {
        return stasiunasal;
    }

    public void setStasiunasal(String stasiunasal) {
        this.stasiunasal = stasiunasal;
    }

    public String getStasiuntujuan() {
        return stasiuntujuan;
    }

    public void setStasiuntujuan(String stasiuntujuan) {
        this.stasiuntujuan = stasiuntujuan;
    }

    public String getTglberangkat() {
        return tglberangkat;
    }

    public void setTglberangkat(String tglberangkat) {
        this.tglberangkat = tglberangkat;
    }

    public String getJamberangkat() {
        return jamberangkat;
    }

    public void setJamberangkat(String jamberangkat) {
        this.jamberangkat = jamberangkat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
