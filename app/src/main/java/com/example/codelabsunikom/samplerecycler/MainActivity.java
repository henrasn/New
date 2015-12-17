package com.example.codelabsunikom.samplerecycler;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Custom layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Model> data=new ArrayList<>();
        Model model ;
        model=new Model("henra","10111351");
        data.add(model);
        model=new Model("Setia","10111352");
        data.add(model);
        model=new Model("nugraha","10111353");
        data.add(model);

        recyclerView=(RecyclerView)findViewById(R.id.in_app_friends);
        layoutManager=new Custom(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        MyRecyclerView adapter=new MyRecyclerView(data);

        RecyclerView.LayoutManager manager=new Custom(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
