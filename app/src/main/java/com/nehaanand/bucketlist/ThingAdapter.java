package com.nehaanand.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ThingAdapter extends RecyclerView.Adapter<ThingAdapter.ThingViewHolder> {

    private Thing[] things;

    public ThingAdapter(Thing[] things) {
        this.things = things;
    }


    @Override
    public int getItemCount() {
        return things.length;
    }

    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ThingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThingAdapter.ThingViewHolder holder, int position) {
        holder.bind(things[position]);
    }


    static class ThingViewHolder extends RecyclerView.ViewHolder{

        private ImageView thingImage;
        private TextView thingName;
        private TextView thingDescription;
        public ThingViewHolder(@NonNull View itemView) {
            super(itemView);
            thingDescription = itemView.findViewById(R.id.text_view_description);
            thingName = itemView.findViewById(R.id.text_view_title);
            thingImage = itemView.findViewById(R.id.image_view_icon);

        }

        public void bind(Thing things){
            thingName.setText(things.name);
            thingDescription.setText(things.description);
            thingImage.setImageResource(things.image);
        }
    }
}
