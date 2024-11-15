package com.example.infopariwisata;

public class TempatWisata {
    private String nama;
    private String lokasi;
    private int thumbnail;
    private int gambarDetail;
    private String deskripsi;  // Menambahkan deskripsi

    public TempatWisata(String nama, String lokasi, int thumbnail, int gambarDetail,  String deskripsi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.thumbnail = thumbnail;
        this.gambarDetail = gambarDetail;
        this.deskripsi = deskripsi;  // Menyimpan deskripsi
    }

    // Getter dan Setter untuk deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Getter dan Setter untuk nama, lokasi, dan thumbnail
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getGambarDetail() {
        return gambarDetail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
