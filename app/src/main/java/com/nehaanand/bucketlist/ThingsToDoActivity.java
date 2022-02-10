package com.nehaanand.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        RecyclerView list = findViewById(R.id.recycler_view_things);

        Thing[] things = {
                new Thing("Swimming", "Swim in each of the four major oceans.", R.drawable.swimming),
                new Thing("Wonders of the World", "Visit at least three out of the seven new Wonders of the World.", R.drawable.wonders),
                new Thing("Continents", "Touch six out of the seven continents (Antarctica is optional!).", R.drawable.continents),
                new Thing("Road Trip", "Road trip across the entire India.", R.drawable.road_trip),
                new Thing("Northern Lights", "Experience the Northern Lights.", R.drawable.northern_lights),
                new Thing("Safari", "Go on a wildlife safari.", R.drawable.safari),
                new Thing("Helicopter", "Ride in a helicopter.", R.drawable.helicopter),
                new Thing("Hot Air Balloon", "Fly in a Hot Air Balloon.", R.drawable.hot_air),
                new Thing("Bottle with a message", "Send a message in the bottle", R.drawable.bottle),
                new Thing("Trip with Friends", "Stay up and watch the sunrise, hanging out and making memories with friends ", R.drawable.trip)
        };

        ThingAdapter adapter = new ThingAdapter(things);
        list.setAdapter(adapter);
    }
}