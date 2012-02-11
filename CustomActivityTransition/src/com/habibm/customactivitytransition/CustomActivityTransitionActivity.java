package com.habibm.customactivitytransition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CustomActivityTransitionActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClickNext(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}