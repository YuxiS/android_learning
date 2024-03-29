package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.TextViewHolder;
import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<TextViewHolder> {
    @NonNull
    private List<String> mItems = new ArrayList<String>();

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new TextViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_text, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {


    }

    @Override
    public  int getItemCount(){return mItems.size();}

    public void notifyItems(@NonNull List<String> items){
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }

}
