package com.nehaanand.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Places_To_Go_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        RecyclerView list = findViewById(R.id.recycler_view_places);

        Place[] places = {
                new Place("Paris, France", "'One of the most iconic cities in the world', famous landmarks are : the Eiffel Tower, Arc de Triomphe, Notre Dame cathedral—the list is never-ending.", R.drawable.paris),
                new Place("Bali, Indonesia", "Place full of beaches, volcanoes, Komodo dragons and jungles sheltering elephants, orangutans and tigers. Basically, it’s paradise.", R.drawable.bali),
                new Place("Sydney", "It is known around the world as one of the greatest and most iconic cities on the planet. Amazing things to do aren’t hard to find; the city has gorgeous beaches, great cafes and world-class entertainment on offer wherever you look.", R.drawable.sydney),
                new Place("New York", "It is one of America’s most exciting states. With charming upstate scenery, world-class cuisine and culture and more things to do than you could fit in one lifetime. The city’s five boroughs all have special features; it’s almost impossible to narrow it down", R.drawable.new_york),
                new Place("Edinburgh, Scotland", "With the historic Edinburgh castle looming over the city, culture in spades and wonderfully friendly locals, this is one of the world’s greatest city breaks.", R.drawable.edinburgh),
                new Place("Los Angeles", "In a city with year-round sunshine, glam bars, beaches and hikes, there are endless incredible experiences to enjoy in Los Angeles.", R.drawable.los_angeles),
                new Place("Santorini, Greece", "Santorini is actually a group of islands; Thíra, Thirassiá, Asproníssi, Palea and Nea Kaméni. Beaches with volcanic black or red sand and clear blue waters make this an ideal holiday spot.", R.drawable.santorini),
                new Place("Moscow, Russia", "Russia’s cosmopolitan capital, Moscow is a beautiful destination to visit in any season. Colorful domes and bell chimes ring out from over 600 churches in the city, and the sense of history is immense. Culture lovers will be impressed with the museums and ballet.", R.drawable.moscow),
                new Place("London, England", "Pretty pink restaurants, futuristic space-age toilets and jungle skyline views are just some of our favorite things about London. And of course, all the classics: Big Ben, red phone boxes and world-class museums and galleries.", R.drawable.london),
                new Place("Rio de Janeiro, Brazil", "Rio de Janeiro has always been one of the most iconic cities in the world with instantly recognizable landscapes and landmarks.", R.drawable.rio_de_janeiro),
        };

        PlacesAdapter adapter = new PlacesAdapter(places);
        list.setAdapter(adapter);
    }
}