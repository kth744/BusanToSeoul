package com.busantoseoul.busan.board;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.busantoseoul.busan.R;

/**
 * Created by Naver on 2015-10-25.
 */
public class RegistBoard extends Activity {
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_view);
    }

    public void onClickRegistSave(View v) {
        System.out.println("new text wwwwww -_-");
    }

    public void onClickRegistCancel(View v) {
        if (isEmptyContent()) {
            finish();
        }

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);

        dialogBuilder.setTitle("test title");
        dialogBuilder.setMessage("글 작성을 취소하시겠습니까?");
        dialogBuilder.setPositiveButton("yes", null);
        dialogBuilder.setNegativeButton("no", null);

        AlertDialog dialog = dialogBuilder.create();
        dialog.show();
    }

    private boolean isEmptyContent() {
        EditText title = (EditText)findViewById(R.id.regist_title);
        EditText content = (EditText)findViewById(R.id.regist_content);

        return (title.getText() == null || title.getText().toString().equals("")) && (content.getText() == null || content.getText().toString().equals(""));
    }
}
