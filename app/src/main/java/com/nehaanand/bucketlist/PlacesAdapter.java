package com.nehaanand.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder> {

    private Place[] places;

    public PlacesAdapter(Place[] places) {
        this.places = places;
    }


    @Override
    public int getItemCount() {
        return places.length;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesAdapter.PlacesViewHolder holder, int position) {
        holder.bind(places[position]);
    }


    static class PlacesViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName;
        TextView placeDescription;

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.image_view_icon);
            placeName = itemView.findViewById(R.id.text_view_title);
            placeDescription = itemView.findViewById(R.id.text_view_description);
        }

        public void bind(Place places){
            placeName.setText(places.name);
            placeDescription.setText(places.description);
            placeImage.setImageResource(places.image);
        }
    }

}
