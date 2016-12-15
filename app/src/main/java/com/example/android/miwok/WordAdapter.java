package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.opengl.Visibility;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by MeRKeZ on 14.11.2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private boolean hasImage;
    private int colorCode;
    private MediaPlayer mediaPlayer;
    int currentRecord;

    public WordAdapter(Activity context, ArrayList<Word> wordArrayList, int colorCode) {
        super(context,0, wordArrayList);
        this.colorCode = colorCode;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        LinearLayout textField = (LinearLayout) listItemView.findViewById(R.id.text_field);
        int color = ContextCompat.getColor(getContext(),colorCode);
        textField.setBackgroundColor(color);

        final Word currentWord = getItem(position);
        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwokTranslationText);
        miwokText.setText(currentWord.getMiwokTranslation());
        TextView defaultText = (TextView) listItemView.findViewById(R.id.defaultTranslationText);
        defaultText.setText(currentWord.getDefaultTranslation());
        ImageView miwokIcon = (ImageView) listItemView.findViewById(R.id.miwokImageView) ;

        //Ayni islem bu yontemle de gerceklestirilebilir. Aradaki farki ogrenmeye calis!

//        listItemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer = MediaPlayer.create(getContext(),currentWord.getAudıoID());
//                mediaPlayer.start();
//            }
//        });

        if (currentWord.hasImage()) {
            miwokIcon.setImageResource(currentWord.getImageID());
            miwokIcon.setVisibility(View.VISIBLE);
        }

        else{
            miwokIcon.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
