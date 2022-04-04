package com.rplbo.pecahan;

public class User {
    private String nama;
    private String Pin;
    private int uang;


    public User(String nama, String pin, int uang) {
        this.nama = nama;
        Pin = pin;
        this.uang = uang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }
}
