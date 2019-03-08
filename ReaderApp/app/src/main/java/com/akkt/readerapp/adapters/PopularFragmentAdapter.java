package com.akkt.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akkt.readerapp.R;
import com.akkt.readerapp.delegates.ItemViewDelegate;
import com.akkt.readerapp.views.holders.PopularViewHolder;

public class PopularFragmentAdapter extends RecyclerView.Adapter<PopularViewHolder> {

    private ItemViewDelegate mDelegate;

    public PopularFragmentAdapter(ItemViewDelegate mDelegate) {
        this.mDelegate = mDelegate;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_popular,viewGroup,false);
        return new PopularViewHolder(itemview,mDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder popularViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
