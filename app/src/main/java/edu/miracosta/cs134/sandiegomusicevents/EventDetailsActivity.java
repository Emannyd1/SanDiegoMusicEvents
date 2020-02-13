package edu.miracosta.cs134.sandiegomusicevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDetailsActivity extends AppCompatActivity {


    //wire all text views and image view

    ImageView eventImageView;
    TextView eventArtistTextView;
    TextView eventDateTextView;
    TextView eventDayTextView;
    TextView eventTimeTextView;
    TextView eventVenueTextView;
    TextView eventCityTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);


        eventArtistTextView = findViewById(R.id.eventArtistTextView);
        eventDateTextView = findViewById(R.id.eventDateDayTextView);
        eventDayTextView = findViewById(R.id.eventDateDayTextView);
        eventTimeTextView = findViewById(R.id.eventTimeTextView);
        eventVenueTextView = findViewById(R.id.eventVenueTextView);
        eventCityTextView = findViewById(R.id.eventCityTextView);
        eventImageView = findViewById(R.id.eventImageView);

        //Extract the intent (from MainActivity)
        Intent intent = getIntent();
        String artist = intent.getStringExtra("Artist");
        String date = intent.getStringExtra("Date");
        String day = intent.getStringExtra("Day");
        String time = intent.getStringExtra("Time");
        String venue = intent.getStringExtra("Venue");
        String city = intent.getStringExtra("City");


        //set the text in each of the text views

        eventArtistTextView.setText(artist);
        eventDateTextView.setText(date);
        eventDayTextView.setText(day);
        eventTimeTextView.setText(time);
        eventVenueTextView.setText(venue);
        eventCityTextView.setText(city);
    }
}
