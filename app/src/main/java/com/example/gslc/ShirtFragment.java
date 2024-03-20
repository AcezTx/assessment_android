package com.example.gslc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.gslc.ImageAdapter;

import java.util.Arrays;
import java.util.List;

public class ShirtFragment extends Fragment {

    public ShirtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shoes, container, false);
        GridView gridView = rootView.findViewById(R.id.grid_view);

        // Resource IDs for the images
        Integer[] imageIds = {R.drawable.sh1, R.drawable.sh2, R.drawable.sh3, R.drawable.sh4, R.drawable.sh5};

        // Set up the custom adapter for the grid view
        ImageAdapter adapter = new ImageAdapter(requireContext(), Arrays.asList(imageIds));
        gridView.setAdapter(adapter);

        // Handle item click in the grid view
        gridView.setOnItemClickListener((parent, view, position, id) -> {
            // Handle item click here
        });

        return rootView;
    }
}
