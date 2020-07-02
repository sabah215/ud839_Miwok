package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColorResourceId = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        /**
         * Gets the selected view
         * */
        View listItemView = convertView;

        /**
         * Inflates the listview
         * */
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        /**
         * Gets the word of the given position
         * */
        Word currentWord = getItem(position);

        /**
         * Get the id of the linear layout of each list item
         * that has the yellow background
         * */
        View textContainer = listItemView.findViewById(R.id.textContainer_linearLayout);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        /**
         * Default textview is the textview that displays the english
         * translation of the word
         * */
        TextView defaultTextView = (TextView) listItemView
                .findViewById(R.id.default_textView);

        /*** Set the deafault translation of the word */
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView
                .findViewById(R.id.miwok_textView);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_imageView);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            /* Make imageview visible*/
            imageView.setVisibility(View.VISIBLE);
        } else imageView.setVisibility(View.GONE);


        return listItemView;
    }
}
