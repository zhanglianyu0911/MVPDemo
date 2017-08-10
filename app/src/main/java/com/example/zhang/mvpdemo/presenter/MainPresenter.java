package com.example.zhang.mvpdemo.presenter;

import com.example.zhang.mvpdemo.MainScreen.MainScreen;

/**
 * Created by zhang on 8/10/2017.
 */

public class MainPresenter {
    public void OnShowPostsButtonClick(MainScreen mainScreen) {
        mainScreen.launchPostsActivity();
    }
}
