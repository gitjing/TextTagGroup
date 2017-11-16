package com.example.ljj.texttagdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ljj.texttagdemo.tool.TagGroupNoEdit;

public class MainActivity extends AppCompatActivity {

    private TagGroupNoEdit tagGroupNoEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tagGroupNoEdit = findViewById(R.id.tag_group);

        tagGroupNoEdit.setTags("哈哈哈哈");

    }
}
