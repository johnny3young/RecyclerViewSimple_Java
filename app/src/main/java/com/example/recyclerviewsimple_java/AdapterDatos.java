package com.example.recyclerviewsimple_java;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    public AdapterDatos(ArrayList<String> listDatosParaMostrar) {
        this.listDatosParaMostrar = listDatosParaMostrar;
    }

    ArrayList<String> listDatosParaMostrar;

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_para_mostrar_en_recyclerview,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.asignarDatos(listDatosParaMostrar.get(i));

    }

    @Override
    public int getItemCount() {
        return listDatosParaMostrar.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView datoParaMostrar;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            datoParaMostrar = itemView.findViewById(R.id.textViewItem);
        }

        public void asignarDatos(String informacion) {
            datoParaMostrar.setText(informacion);
        }
    }
}
