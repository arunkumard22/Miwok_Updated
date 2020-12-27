package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        // Create a List of words
        ArrayList<word> words = new ArrayList<word>();

        // Adding Words to The word object

        words.add(new word("Red","weṭeṭṭi",R.drawable.color_red));
        words.add(new word("Green","chokokki",R.drawable.color_green));
        words.add(new word("Brown","ṭakaakki",R.drawable.color_brown));
        words.add(new word("Gray","ṭopoppi",R.drawable.color_gray));
        words.add(new word("Black","kululli",R.drawable.color_black));
        words.add(new word("White","kelelli",R.drawable.color_white));
        words.add(new word("DustyYellow","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new word("MustardYellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the R.layout.list_item
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        wordAdapter Adapter = new wordAdapter(this,words,R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_colors.xml layout file.
        ListView listView = findViewById(R.id.colorsPresent);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);


    }
}