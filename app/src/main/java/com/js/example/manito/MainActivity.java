package com.js.example.manito;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("알림", "확인");
//                NaverShoppingTask mNaverShoppingTask = new NaverShoppingTask();
//                mNaverShoppingTask.execute();

            }

            public void on1(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }

        });

/*
        public class NaverShoppingTask extends AsyncTask<String[], Void, String> {

            @Override
            public String doInBackground(String[]... String) {
//            APIExamDatalabTrend.main(new String[]{""});
                return null;

            }

            @Override
            public void onPostExecute(String result) {
                super.onPostExecute(result);
            }
        }

    */
    }
}
