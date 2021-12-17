package com.example.room2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button AddBtn, ResetBtn;
    RecyclerView recyclerView;

    List<MainData> dataList = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    RoomDB database;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign variable..

        editText = (EditText) findViewById(R.id.edit_text_Id);
        AddBtn = (Button) findViewById(R.id.addBtnId);
        ResetBtn =(Button) findViewById(R.id.resetBtnId);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);


        // Initialize database..
        database = RoomDB.getInstance(this);
        // Store database value in data list ..
        dataList = database.mainDao().getAll();

        // Initialize linear layout manager..
        linearLayoutManager = new LinearLayoutManager(this);
        // Set layout Manager..
        recyclerView.setLayoutManager(linearLayoutManager);
        // Initialize adapter..
        adapter = new MainAdapter(MainActivity.this,dataList);
        // Set Adapter ..
        recyclerView.setAdapter(adapter);

        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get String from Edit Text..
                String sText = editText.getText().toString().trim();

                //check condition..
                if (!sText.equals("")){

                    // When text is not empty..
                    // Initialize main data..
                    MainData data = new MainData();

                    // Set text on main data..
                    data.setText(sText);

                    // Insert text in database..
                    database.mainDao().Insert(data);

                    // Clear edit text..
                    editText.setText("");

                    // Notify when data is inserted..
                    dataList.clear();
                    dataList.addAll(database.mainDao().getAll());
                    adapter.notifyDataSetChanged();

                }
            }
        });
        ResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Delete all data from database..
                database.mainDao().reset(dataList);

                // Notify when all data is deleted..
                dataList.clear();
                dataList.addAll(database.mainDao().getAll());
                adapter.notifyDataSetChanged();
            }
        });
    }
}