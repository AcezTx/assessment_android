package com.example.gslc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<Integer> mImageIds;

    public ImageAdapter(Context context, List<Integer> imageIds) {
        mContext = context;
        mImageIds = imageIds;
    }

    @Override
    public int getCount() {
        return mImageIds.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // If convertView is null, create a new ImageView
            imageView = new ImageView(mContext);
            // Set desired width and height for the ImageView
            int imageWidth = mContext.getResources().getDimensionPixelSize(R.dimen.grid_image_width);
            int imageHeight = mContext.getResources().getDimensionPixelSize(R.dimen.grid_image_height);
            imageView.setLayoutParams(new GridView.LayoutParams(imageWidth, imageHeight));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }

        // Set the image resource for the ImageView
        imageView.setImageResource(mImageIds.get(position));
        return imageView;
    }
}