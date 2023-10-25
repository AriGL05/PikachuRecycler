package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.adapters.PikachuAdapter;
import com.example.recycleview.models.Chapete;
import com.example.recycleview.models.Pikachu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Pikachu> pikachus =new ArrayList<>();
        pikachus.add(new Pikachu(new Chapete("Amarillo"),new Chapete("Rojo")));
        pikachus.add(new Pikachu(new Chapete("Amarillo"),new Chapete("Amarillo")));

        rc=findViewById(R.id.rc);
        PikachuAdapter pia =new PikachuAdapter(pikachus);
        rc.setAdapter(rc);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
    }
}