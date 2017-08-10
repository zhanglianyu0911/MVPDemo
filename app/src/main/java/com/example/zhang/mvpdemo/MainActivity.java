package com.example.zhang.mvpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhang.mvpdemo.MainScreen.MainScreen;
import com.example.zhang.mvpdemo.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainScreen{

    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);
        mainPresenter = new MainPresenter();

    }

    public void showActivity(View view){
        mainPresenter.OnShowPostsButtonClick(this);
    }
    @Override
    public void launchPostsActivity() {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }
}
