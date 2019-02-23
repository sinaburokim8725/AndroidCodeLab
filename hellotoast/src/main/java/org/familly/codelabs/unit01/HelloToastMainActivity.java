package org.familly.codelabs.unit01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloToastMainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView txtCount;

    private String DEBUG_TAG = "CODE_LABS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast_main);
        txtCount = (TextView) findViewById(R.id.text_count);
    }
    //xml에서 버튼 속성으로 onClick 이벤트를 잡는 방식이다.
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        Log.d(DEBUG_TAG,"START countUp()");
        mCount++;
        if (txtCount != null) {
            txtCount.setText(Integer.toString(mCount));
        }

        Log.d(DEBUG_TAG,"END countUp()");

    }
}
