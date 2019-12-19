package com.vaadin.menu.domain;

import com.vaadin.menu.common.BaseDomain;

public class Menu extends BaseDomain {
    private Long id;
    private EnumIcecek icecek;
    private String tatli;
    private String anaYemek;
    private String suluYemek;
    private boolean salata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumIcecek getIcecek() {
        return icecek;
    }

    public void setIcecek(EnumIcecek icecek) {
        this.icecek = icecek;
    }

    public String getTatli() {
        return tatli;
    }

    public void setTatli(String tatli) {
        this.tatli = tatli;
    }

    public String getAnaYemek() {
        return anaYemek;
    }

    public void setAnaYemek(String anaYemek) {
        this.anaYemek = anaYemek;
    }

    public String getSuluYemek() {
        return suluYemek;
    }

    public void setSuluYemek(String suluYemek) {
        this.suluYemek = suluYemek;
    }

    public boolean isSalata() {
        return salata;
    }

    public void setSalata(boolean salata) {
        this.salata = salata;
    }
}
