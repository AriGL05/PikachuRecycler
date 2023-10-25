package com.example.recycleview.models;

public class Pikachu extends Pokemon{
    private Chapete chapeteIZO;
    private Chapete chapeteDer;

    public Pikachu(Chapete chapeteIZO, Chapete chapeteDer) {
        this.chapeteIZO = chapeteIZO;
        this.chapeteDer = chapeteDer;
    }

    public Chapete getChapeteIZO() {
        return chapeteIZO;
    }

    public void setChapeteIZO(Chapete chapeteIZO) {
        this.chapeteIZO = chapeteIZO;
    }

    public Chapete getChapeteDer() {
        return chapeteDer;
    }

    public void setChapeteDer(Chapete chapeteDer) {
        this.chapeteDer = chapeteDer;
    }
}
