package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {

    // For TextContainer Background Image Resource id
    private int colorsResourceId;

    /**
     *  Custom wordAdapter to set multiple views
     * @param context
     * @param words
     * @param colorsId
     */

    public wordAdapter(Activity context, ArrayList<word> words,int colorsId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,words);

        // here we store image Resource ID to set back ground for text container for Each Activity.
        colorsResourceId = colorsId;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link word} object located at this position in the list
        word presenter = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwokView
        TextView miwokLanguage = listItemView.findViewById(R.id.miwokView);
        // Get the MiwokTranslation  object and
        // set this text on the miwokView TextView
        miwokLanguage.setText(presenter.getMiwokTranslation());


        // Find the TextView in the list_item.xml layout with the ID englishView
        TextView numberTextView = listItemView.findViewById(R.id.englishView);
        // Get the DefaultTranslation object and
        // set this text on the englishView TextView
        numberTextView.setText(presenter.getDefaultTranslation());

        // Find The Image view in the list_item.xml layout with the id imageView
        ImageView imagePresenter = listItemView.findViewById(R.id.imageView);

        // Checking weather Activity contains ImageView or Not
        if(presenter.hasImage()){
            // Get the image Resource Id
            // Set the image one the imageView view
            imagePresenter.setImageResource(presenter.getImagesResourceId());
            // setting the visibility of image
            imagePresenter.setVisibility(View.VISIBLE);
        }
        else{
            // Setting Image Visibility  Gone for No Without image Activity
            imagePresenter.setVisibility(View.GONE);
        }
        // find the text container layout to set background color
        View textContainer = listItemView.findViewById(R.id.Text_container);
        // Find the color That resource d maps to
        int color = ContextCompat.getColor(getContext(),colorsResourceId);
        //Set the background color of the text container
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
