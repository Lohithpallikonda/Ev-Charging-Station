package com.example.myapplication.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class FeaturedAdapater extends RecyclerView.Adapter<FeaturedAdapater.FeaturedViewHolder>{

    ArrayList<FeaturedHelperClass>featuredLocations;

    public FeaturedAdapater(ArrayList<FeaturedHelperClass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent,false);
        FeaturedViewHolder featuredViewHolder=new FeaturedViewHolder(view);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FeaturedHelperClass featuredHelperClass=featuredLocations.get(position);
        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTile());
        holder.description.setText(featuredHelperClass.getDescription());
        holder.connector.setText(featuredHelperClass.getConnector());
    }

    @Override
    public int getItemCount() {

        return featuredLocations.size();
    }

    public static class FeaturedViewHolder extends  RecyclerView.ViewHolder{
        ImageView image;
        TextView title,description,connector;

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            //Hooks
            image=itemView.findViewById(R.id.featured_img1);
            title=itemView.findViewById(R.id.featured_title1);
            description=itemView.findViewById(R.id.featured_discription1);
            connector=itemView.findViewById(R.id.featured_watts1);

        }
    }
}
