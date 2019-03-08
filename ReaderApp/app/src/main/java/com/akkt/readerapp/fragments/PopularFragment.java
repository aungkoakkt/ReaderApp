package com.akkt.readerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.akkt.readerapp.R;
import com.akkt.readerapp.adapters.PopularFragmentAdapter;
import com.akkt.readerapp.delegates.ItemViewDelegate;

public class PopularFragment extends Fragment implements ItemViewDelegate {

    private RecyclerView mRvFragmentPopular;
    private TextView mTvTitle;
    private TextView mTvSeeMore;
    private PopularFragmentAdapter mPopularAdapter;

    public static PopularFragment newInstance(){
        return new PopularFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_popular,container,false);
        mRvFragmentPopular=view.findViewById(R.id.rv_fragment_popular);
        mTvSeeMore=view.findViewById(R.id.tv_fragment_popular_see_more);
        mTvTitle=view.findViewById(R.id.tv_fragment_popular_title);

        mRvFragmentPopular.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        mPopularAdapter=new PopularFragmentAdapter(this);

        mRvFragmentPopular.setAdapter(mPopularAdapter);

        return view;
    }

    @Override
    public void onTapViewItem(int position) {
        Toast.makeText(getContext(), "Tap on item "+position, Toast.LENGTH_SHORT).show();
    }
}
