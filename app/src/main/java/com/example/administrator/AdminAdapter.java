package com.example.administrator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdminAdapter extends RecyclerView.Adapter<AdminAdapter.MyViewHolder>
{
    Context context;
    ArrayList<AdminModel> adminModels;
    public  AdminAdapter(Context context, ArrayList<AdminModel> adminModels){
        this.context = context;
        this.adminModels = adminModels;
    }
    @NonNull
    @Override
    public AdminAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_validation_page,
                parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminAdapter.MyViewHolder holder, int position)
    {

        holder.button.setText("Validate User");
        holder.name.setText(adminModels.get(position).getAuthorname());
        Glide.with(context).load(adminModels.get(position).getImage()).into(holder.imageView);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button
            }
        });

    }

    @Override
    public int getItemCount() {
        return adminModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        Button button;
        ImageView imageView;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView2);
            button = itemView.findViewById(R.id.button2);
        }
    }
}
