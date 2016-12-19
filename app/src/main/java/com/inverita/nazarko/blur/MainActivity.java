package com.inverita.nazarko.blur;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.wonderkiln.blurkit.BlurKit;
import com.wonderkiln.blurkit.BlurLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private BlurLayout mBlurLayout;
    private ArrayList<String> mDataset = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mBlurLayout = (BlurLayout) findViewById(R.id.blurLayout);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        for (int i=0;i<100;i++){
            mDataset.add("posution : "+i);
        }
        mAdapter = new MyAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mBlurLayout.setBlurRadius(12);
                mBlurLayout.setDownscaleFactor(0.12f);
                mBlurLayout.invalidate();
            }
        },3000);
    }
}
