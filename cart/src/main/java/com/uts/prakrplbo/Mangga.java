package com.uts.prakrplbo;

public class Mangga {
    private int harga;
    private String manggaku;

    public String getManggaku() {
        return manggaku;
    }

    public void setManggaku(String manggaku) {
        this.manggaku = manggaku;
    }

    public Mangga(String manggaku) {
        this.manggaku = manggaku;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Mangga(int harga) {
        this.harga = harga;
    }

    public Mangga(Object manggaku) {
    }
}
