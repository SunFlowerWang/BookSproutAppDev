package com.example.wangxuying.booksprout;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MyMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);

        myButton.setId(1);


        myLayout.setBackgroundColor(Color.BLUE);
        myButton.setText("Click Here");

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        EditText userName = new EditText(this);
        userName.setId(2);
        RelativeLayout.LayoutParams userNameDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        userNameDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        userNameDetails.setMargins(0,0,0,50);

        Resources r = getResources();
        int px =  (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        userName.setWidth(px);



        myLayout.addView(myButton,buttonDetails);
        myLayout.addView(userName,userNameDetails);

        setContentView(myLayout);

        Log.i(TAG,"onCreate");
    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"OnStart");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"OnRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG,"OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"OnStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"OnSaveInstanceState");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"OnRestoreInstance");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }




}
