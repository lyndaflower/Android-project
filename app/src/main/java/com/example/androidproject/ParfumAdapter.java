package com.example.androidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ParfumAdapter extends BaseAdapter {
    private Context mParfumes;
    private int[] mPictures;
    private String[] mPrice;

    public ParfumAdapter(Context mParfumes, int[] mPictures, String[] price) {
        this.mParfumes = mParfumes;
        this.mPictures = mPictures;
        this.mPrice = price;
    }

    public int getCount() {
        return mPictures.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mParfumes
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView = convertView;
        if (convertView == null) {

            gridView = inflater.inflate(R.layout.grid_items, null);

        }
        ImageView pictureView = (ImageView) gridView.findViewById(R.id.grid_item_image);
        pictureView.setImageResource(mPictures[position]);


//        TextView amount  = (TextView) gridView.findViewById(R.id.gridItem);
//        amount.setText("Narciso rodriguez: $67.2");
        return pictureView;


    }

}

