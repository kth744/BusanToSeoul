package com.busantoseoul.busan.board;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.busantoseoul.busan.R;

/**
 * Created by Naver on 2015-10-25.
 */
public class RegistBoard extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_view);
    }

    public void onClickRegistSave(View v) {
        System.out.println("new text wwwwww -_-");
    }

    public void onClickRegistCancel(View v) {
        System.out.println("new text cancel good");
    }
}
