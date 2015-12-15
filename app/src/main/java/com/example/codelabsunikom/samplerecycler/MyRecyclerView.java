package com.example.codelabsunikom.samplerecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by codelabsunikom on 12/15/15.
 */
public class MyRecyclerView extends android.support.v7.widget.RecyclerView.Adapter<MyRecyclerView.ReViewHolder>{

    private ArrayList<Model> models;

    public MyRecyclerView(ArrayList<Model> models) {
        this.models = models;
    }

    @Override
    public ReViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ReViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReViewHolder holder, int position) {
        holder.name.setText(models.get(position).getName());
        holder.nim.setText(models.get(position).getNim());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ReViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder{

        private TextView name;
        private TextView nim;

        public ReViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            nim=(TextView)itemView.findViewById(R.id.nim);
        }
    }
}
