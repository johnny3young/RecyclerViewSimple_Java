package com.example.recyclerviewsimple_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatosParaMostrar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reciclerViewMainActivity);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        listDatosParaMostrar = new ArrayList<String>();

        for (int i=0; i<20; i++){
            listDatosParaMostrar.add("Dato # " +i+ " ");
        }

        AdapterDatos adapterDatos = new AdapterDatos(listDatosParaMostrar);
        recyclerView.setAdapter(adapterDatos);
    }
}
