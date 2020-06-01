package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private  int mColorResourceID;
    public WordAdapter(Activity context, ArrayList<Word> words,int backgroundColorId) {

        super(context, 0, words);
        mColorResourceID=backgroundColorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {} object located at this position in the list
        Word currentWord= getItem(position);


        TextView miowkTextView = (TextView) listItemView.findViewById(R.id.miowk_text_view);

        miowkTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView image=(ImageView) listItemView.findViewById((R.id.image));
        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getResourceID());
            //if the view was hidden previously we make sure its visible now
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.GONE);
        }

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceID);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
