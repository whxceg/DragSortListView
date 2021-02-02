package com.mobeta.android.dslv.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.CursorAdapter;

import android.os.Bundle;

import com.mobeta.android.dslv.DragSortListView;

public class MainActivity extends AppCompatActivity {

    private DragSortListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.lv);

    }
}