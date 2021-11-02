package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity_search extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private SearchAdapter mSearchAdapter = new SearchAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mRecycleView = findViewById(R.id.rv);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(mSearchAdapter);

        List<String> items = new ArrayList<String>();
        for (int i=0;i<100;i++){
            items.add(String.valueOf(i));
        }
        mSearchAdapter.notifyItems(items);
    }
}