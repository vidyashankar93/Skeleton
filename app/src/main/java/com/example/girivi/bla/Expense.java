package com.example.girivi.bla;

import android.app.ProgressDialog;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Expense extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    // Movies json url
    private static final String url = "http://jctmys.16mb.com/list.php";
    private ProgressDialog pDialog;
    private List<Movie> movieList = new ArrayList<Movie>();
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
    }
}
