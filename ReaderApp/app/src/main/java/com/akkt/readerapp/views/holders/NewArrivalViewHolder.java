package com.akkt.readerapp.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.akkt.readerapp.delegates.ItemViewDelegate;

public class NewArrivalViewHolder extends RecyclerView.ViewHolder {

    private ItemViewDelegate mDelegate;

    public NewArrivalViewHolder(@NonNull View itemView,ItemViewDelegate itemViewDelegate) {
        super(itemView);
        mDelegate=itemViewDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapViewItem(getAdapterPosition());
            }
        });
    }
}
