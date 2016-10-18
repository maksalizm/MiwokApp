package com.example.pms.miwokapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // Find the View that shows the numbers category
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//        TextView family = (TextView) findViewById(R.id.family);
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        // Set a click listener on that View
//        numbers.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numbersIntent);
//            }
//        });
//
//        family.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the familys View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//
//                startActivity(familyIntent);
//            }
//        });
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the phrases View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colorsIntent);
//            }
//        });

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        MiwokFragmentPagerAdapter adapter = new MiwokFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
