package id.putraprima.myapplication.models;

/**
 * Created by putraprima on 14/11/17.
 */

public class RiwayatSekolah {
    String namaSekolah,tingkatSekolah,tahunSekolah;

    public RiwayatSekolah(String namaSekolah, String tingkatSekolah, String tahunSekolah) {
        this.namaSekolah = namaSekolah;
        this.tingkatSekolah = tingkatSekolah;
        this.tahunSekolah = tahunSekolah;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getTingkatSekolah() {
        return tingkatSekolah;
    }

    public void setTingkatSekolah(String tingkatSekolah) {
        this.tingkatSekolah = tingkatSekolah;
    }

    public String getTahunSekolah() {
        return tahunSekolah;
    }

    public void setTahunSekolah(String tahunSekolah) {
        this.tahunSekolah = tahunSekolah;
    }
}
