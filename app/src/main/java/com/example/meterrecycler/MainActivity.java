package com.example.meterrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private String [] name, desc;
    private static int [] images = {R.drawable.meter, R.drawable.transformer, R.drawable.tower};
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        name = getResources().getStringArray(R.array.item_name);
        desc = getResources().getStringArray(R.array.item_desc);
        nextButton = findViewById(R.id.nextButton);

        MyAdapter adapter = new MyAdapter(this, name, desc, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(nextIntent);
            }
        });

    }
}