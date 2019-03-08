package com.akkt.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akkt.readerapp.R;
import com.akkt.readerapp.delegates.ItemViewDelegate;
import com.akkt.readerapp.views.holders.NewArrivalViewHolder;

public class NewArrivalAdapter extends RecyclerView.Adapter<NewArrivalViewHolder> {

    private ItemViewDelegate mItemViewDelegate;

    public NewArrivalAdapter(ItemViewDelegate mItemViewDelegate) {
        this.mItemViewDelegate = mItemViewDelegate;
    }

    @NonNull
    @Override
    public NewArrivalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_new_arrival,viewGroup,false);
        return new NewArrivalViewHolder(view,mItemViewDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull NewArrivalViewHolder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
