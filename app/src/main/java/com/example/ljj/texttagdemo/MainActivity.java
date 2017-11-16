package com.example.ljj.texttagdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ljj.texttagdemo.tool.TagGroupNoEdit;

public class MainActivity extends AppCompatActivity {

    private TagGroupNoEdit tagGroupNoEdit;
    private TextView showtags;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tagGroupNoEdit = findViewById(R.id.tag_group);
        tagGroupNoEdit.setMaxChooseNum(5);
        tagGroupNoEdit.setTags(DataManager.tags);


        showtags = findViewById(R.id.show_tv);


        tagGroupNoEdit.setOnTagClickListener(new TagGroupNoEdit.OnTagClickListener() {
            @Override
            public void onTagClick(String tag) {
                String[] checkedTags = tagGroupNoEdit.getCheckedTags();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < checkedTags.length; i++) {
                    stringBuilder.append(checkedTags[i] + "  ");
                }

                showtags.setText(stringBuilder.toString());
            }
        });
    }
}
