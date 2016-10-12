package com.example.pms.miwokapp;

import android.view.View;
import android.widget.Toast;

/**
 * Created by pms on 2016. 10. 12..
 */

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),
                "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
