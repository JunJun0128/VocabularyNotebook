package com.example.junekelectric.vocabnotebook;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Junekelectric on 15/09/11.
 */
public class CustomAdapter extends ArrayAdapter{

    List<Vocab> mVocab;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int textViewResourceId, List<Vocab> objects){
        super(context, textViewResourceId, objects);

        mVocab = objects;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return mVocab.size();
    }

    @Override
    public Object getItem(int position){
        return mVocab.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Vocab item = (Vocab)getItem(position);

        if (null == convertView){
            convertView = layoutInflater.inflate(R.layout.rowdata, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.text);
        textView.setText(item.spell);
        textView.setTextColor(Color.parseColor("#0000cc"));

        return convertView;
    }
}