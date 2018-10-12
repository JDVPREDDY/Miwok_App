package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {



    public WordAdapter(Activity context, ArrayList<word> words, int colorResourceId) {
        super(context, 0, words);
        mcolorResourceId = colorResourceId;
    }
        private int mcolorResourceId;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        nameTextView.setText(currentWord.getMiwokTranslation());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage())
            imageView.setImageResource(currentWord.getImage());
        else
            imageView.setVisibility(View.GONE);

        View setContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mcolorResourceId);
        setContainer.setBackgroundColor(color);

        return listItemView;
    }
}