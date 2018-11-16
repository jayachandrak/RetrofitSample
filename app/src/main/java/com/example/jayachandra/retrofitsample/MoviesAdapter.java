package com.example.jayachandra.retrofitsample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Subject> moviesList;
    private MainActivity mcontext;
    public MoviesAdapter(List<Subject> moviesList, MainActivity mainActivity) {
        this.moviesList = moviesList;
        this.mcontext=mainActivity;
    }

    @NonNull
    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MyViewHolder holder, final int i) {
        final Subject movie = moviesList.get(i);
        holder.title.setText(movie.getTitle());
        /*holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fm=new DetailFragemt();
                FragmentTransaction ft=mcontext.getSupportFragmentManager().beginTransaction();
                Bundle mBundle=new Bundle();
                mBundle.putString("Title",movie.getTitle());
                fm.setArguments(mBundle);
                ft.add(R.id.famelayout,fm);
                ft.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            //genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


}
