package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"a","s","q","w","e","r","t","y","u","i","o","p","d","f","g"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        //适配器
        //当前上下文，ListView子项布局的id，要适配的参数
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
