package com.barbos.sergey.thl_spacetrip.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.barbos.sergey.thl_spacetrip.DataModel.Choice;
import com.barbos.sergey.thl_spacetrip.DataModel.Page;
import com.barbos.sergey.thl_spacetrip.DataModel.Story;
import com.barbos.sergey.thl_spacetrip.R;

public class StoryActivity extends AppCompatActivity {

    /*public final static String TAG = StoryActivity.class.getSimpleName();*/
    public final static String TAG = "Sergey,ll check it now!";
    private TextView mTempView;
    private ImageView mImageView;
    private Button mButton1;
    private Button mButton2;
    private Story mStory;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mImageView = (ImageView)findViewById(R.id.imageViewStory);
        mButton1 = (Button)findViewById(R.id.buttonChoice1);
        mButton2 = (Button)findViewById(R.id.buttonChoice2);
        mTempView = (TextView)findViewById(R.id.textViewStory);
        mStory = new Story();
        Intent intent = getIntent();
        name = intent.getStringExtra(getString(R.string.nameKey));
        if (name == null || name.isEmpty()) {
            name = "FRIEND";
        }
        Log.d(TAG, name);


        loadPage(0);
    }

    public void loadPage(int pageNumber) {
        final Page page = mStory.getPages(pageNumber);

        mImageView.setImageResource(page.getmImageId());
        String pageText;
        pageText = String.format(page.getmText(), name);
        mTempView.setText(pageText);


        if (page.isLastPage()) {
            mButton1.setVisibility(View.INVISIBLE);
            mButton2.setText("PLAY AGAIN");
            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        } else {
            mButton1.setText(page.getmChoice1().getmChoiceText());
            mButton2.setText(page.getmChoice2().getmChoiceText());

            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int nextPage = page.getmChoice1().getmChoiceId();
                    loadPage(nextPage);
                }
            });

            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int nextPage = page.getmChoice2().getmChoiceId();
                    loadPage(nextPage);
                }
            });
        }
    }

}
