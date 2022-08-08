package com.example.meterrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] name, desc;
    int[] images;

    public MyAdapter(Context context, String[] name, String[] desc, int[] images) {
        this.context = context;
        this.name = name;
        this.desc = desc;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.name.setText(name[position]);
    holder.desc.setText(desc[position]);
    holder.img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView desc;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             name = itemView.findViewById(R.id.nameView);
             desc = itemView.findViewById(R.id.descView);
             img = itemView.findViewById(R.id.itemImageV);
        }
    }
}
