package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a List of words Object
        ArrayList<word> words = new ArrayList<word>();

        // Adding Words to The word object

        words.add(new word("One","Lutti",R.drawable.number_one));
        words.add(new word("Two","Otiiko",R.drawable.number_two));
        words.add(new word("Three","Tolookosu",R.drawable.number_three));
        words.add(new word("Four","Oyyisa",R.drawable.number_four));
        words.add(new word("Five","Massokka",R.drawable.number_five));
        words.add(new word("Six","Temmokka",R.drawable.number_six));
        words.add(new word("Seven","Kenekaku",R.drawable.number_seven));
        words.add(new word("Eight","Kawinta",R.drawable.number_eight));
        words.add(new word("Nine","Wo’e",R.drawable.number_nine));
        words.add(new word("Ten","Na’aacha",R.drawable.number_ten));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the R.layout.list_item
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        wordAdapter Adapter = new wordAdapter(this,words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.numberPresenter);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);


    }
}