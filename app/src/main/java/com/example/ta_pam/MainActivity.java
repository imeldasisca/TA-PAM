package com.example.ta_pam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecyclerView adapterRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i=0; i < MyItem.judulBuku.length; i++){
            data.add(new ItemModel(
                    MyItem.judulBuku[i],
                    MyItem.tahunBuku[i],
                    MyItem.cover[i]
            ));
        }

        adapterRecyclerView = new AdapterRecyclerView(data);
        recyclerView.setAdapter(adapterRecyclerView);
    }
}