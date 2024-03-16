package com.example.gslc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Button btnShoes = findViewById(R.id.btnShoes);
        btnShoes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //ContainerView to ShoesFragment
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, ShoesFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });

        //Shoes to ShirtFragment
        Button btnShirt = findViewById(R.id.btnShirt);
        btnShirt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, ShirtFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });

        Button btnFood = findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, FoodFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });
    }
}