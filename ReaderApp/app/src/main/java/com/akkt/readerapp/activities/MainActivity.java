package com.akkt.readerapp.activities;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.akkt.readerapp.R;
import com.akkt.readerapp.adapters.NewArrivalAdapter;
import com.akkt.readerapp.delegates.ItemViewDelegate;

public class MainActivity extends AppCompatActivity implements ItemViewDelegate {


    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private NewArrivalAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.tb_activity_main);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mNavigationView = findViewById(R.id.navigation_view);
        mRecyclerView = findViewById(R.id.rv_activity_main);

        mToolbar.setTitle("မေဟာ္သဓာ");
        setSupportActionBar(mToolbar);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mAdapter=new NewArrivalAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public void onTapViewItem(int position) {
        Toast.makeText(this, "Tap on item "+position, Toast.LENGTH_SHORT).show();
    }
}
