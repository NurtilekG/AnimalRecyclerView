package com.zoro.animalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> animalList=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        animalList.add("Cat");
        animalList.add("Leon");
        animalList.add("Dog");
        animalList.add("Bear");
        animalList.add("Frog");
        animalList.add("Rat");
        animalList.add("Crocodile");
        animalList.add("Ant");
        animalList.add("Monkey");
        animalList.add("snake");
        animalList.add("carrot");
        animalList.add("Rustam");
        AnimalAdapter adapter1 = new AnimalAdapter(animalList);
        recyclerView.setAdapter(adapter1);
    }
}