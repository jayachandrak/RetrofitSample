package com.example.jayachandra.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
ArrayList<Subject> mMovies =new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApIInterface apIInterface = ApIClient.getClient().create(ApIInterface.class);
        apIInterface.doGetListResources(0,1000).enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                Log.e("TAG","Count"+response.body().getSubjects().get(0).getCasts().toString());
                mMovies.addAll(response.body().getSubjects());


                Log.e("TAG","Movies Size"+mMovies.size());
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

                MoviesAdapter mAdapter = new MoviesAdapter(mMovies,MainActivity.this);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {

            }
        });

    }

}
