package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // Create a List of words
        ArrayList<word> words = new ArrayList<word>();

        // Adding Words to The word object

        words.add(new word("Father","әpә",R.drawable.family_father));
        words.add(new word("Mother", "әṭa",R.drawable.family_mother));
        words.add(new word("Son","angsi",R.drawable.family_son));
        words.add(new word("Daughter","tune",R.drawable.family_daughter));
        words.add(new word("OlderBrother","taachi",R.drawable.family_older_brother));
        words.add(new word("YoungerBrother","chalitti",R.drawable.family_younger_brother));
        words.add(new word("OlderSister","teṭe",R.drawable.family_older_sister));
        words.add(new word("YoungerSister","kolliti",R.drawable.family_younger_sister));
        words.add(new word("GradFather","ama",R.drawable.family_grandfather));
        words.add(new word("GrandMother","paapa",R.drawable.family_grandmother));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the R.layout.list_item
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        wordAdapter Adapter = new wordAdapter(this,words,R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_family.xml layout file.
        ListView listView = findViewById(R.id.familyPresenter);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);


    }
}