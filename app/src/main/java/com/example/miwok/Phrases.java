package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        // Create a List of words
        ArrayList<word> words = new ArrayList<word>();

        // Adding Words to The word object

        words.add(new word("Where are you going?","minto wuksus"));
        words.add(new word("What is your name?", "tinnә oyaase'nә"));
        words.add(new word("My name is...","oyaaset..."));
        words.add(new word("How are you feeling?","michәksәs?"));
        words.add(new word("OlderBrother","taachi"));
        words.add(new word("I’m feeling good.","kuchi achit"));
        words.add(new word("Are you coming?","әәnәs'aa?"));
        words.add(new word("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new word("I’m coming.","әәnәm"));
        words.add(new word("Let’s go.","yoowutis"));
        words.add(new word("Come Here","әnni'nem"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the R.layout.list_item
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        wordAdapter Adapter = new wordAdapter(this,words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_phrases.xml layout file.
        ListView listView = findViewById(R.id.phrasesPresenter);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);

    }
}