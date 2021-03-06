package com.example.android.popularmovies.app;


import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class ReviewsCursorAdapter  extends CursorAdapter {

    public ReviewsCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        return LayoutInflater.from(context).inflate(R.layout.list_item_movie_review, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView trailer = (TextView) view.findViewById(R.id.list_item_movie_review_textview);
        trailer.setText(
                cursor.getString(cursor.getColumnIndex("review_content")));

    }
}