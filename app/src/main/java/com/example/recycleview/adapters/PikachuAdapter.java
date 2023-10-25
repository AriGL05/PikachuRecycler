package com.example.recycleview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;
import com.example.recycleview.models.Pikachu;

import java.util.List;

public class PikachuAdapter extends RecyclerView.Adapter<PikachuAdapter.ViewHolder> {

    private List<Pikachu> pikachus;

    public PikachuAdapter(List<Pikachu> pikachus) {
        this.pikachus = pikachus;
    }

    @NonNull
    @Override
    public PikachuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly=LayoutInflater.from(parent.getContext());
        View v=ly.inflate(R.layout.pokemonitem,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PikachuAdapter.ViewHolder holder, int position) {
    Pikachu p=pikachus.get(position);
    holder.setdata(p);
    }

    @Override
    public int getItemCount() {
        return pikachus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtchapeteIzq;
        TextView txtchapeteDer;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtchapeteIzq=itemView.findViewById(R.id.txtChapeteIzq);
            txtchapeteDer=itemView.findViewById(R.id.txtChapeteDerecho);
        }
        public void setdata(Pikachu p){
            txtchapeteIzq.setText(p.getChapeteIZO().getColor());
            txtchapeteDer.setText(p.getChapeteDer().getColor());
        }
    }
}
