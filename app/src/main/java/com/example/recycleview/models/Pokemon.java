package com.example.recycleview.models;

import java.util.List;

public class Pokemon {
    private String name;
    private int number;
    private Tipo tipo;

    private List<String> ataques;

    public List<String> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<String> ataques) {
        this.ataques = ataques;
    }

    public Pokemon(String name, int number, Tipo tipo) {
        this.name = name;
        this.number = number;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
