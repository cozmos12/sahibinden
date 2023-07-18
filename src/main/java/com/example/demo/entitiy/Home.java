
package com.example.demo.entitiy;

import jakarta.persistence.*;

@Entity
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "esya")
    private String esya;

    @Column(name = "oda_sayısı")
    private String odaSayisi;

    @Column(name = "ısıtma_türü")
    private String isitmaTuru;

    @Column(name = "bina_yaşı")
    private int binaYaşı;

    @Column(name = "satılık_kiralık")
    private String satılıkKiralık;

    @Column(name = "fiyat")
    private int fiyat;

    @Column(name = "il")
    private String il;

    @Column(name = "ilçe")
    private String ilçe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEsya() {
        return esya;
    }

    public void setEsya(String esya) {
        this.esya = esya;
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayısı) {
        this.odaSayisi = odaSayısı;
    }

    public String getIsitmaTuru() {
        return isitmaTuru;
    }

    public void setIsitmaTuru(String IsıtmaTürü) {
        this.isitmaTuru = IsıtmaTürü;
    }

    public int getBinaYaşı() {
        return binaYaşı;
    }

    public void setBinaYaşı(int binaYaşı) {
        this.binaYaşı = binaYaşı;
    }

    public String getSatılıkKiralık() {
        return satılıkKiralık;
    }

    public void setSatılıkKiralık(String satılıkKiralık) {
        this.satılıkKiralık = satılıkKiralık;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }
}
