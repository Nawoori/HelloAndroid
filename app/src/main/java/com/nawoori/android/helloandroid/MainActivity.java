package com.nawoori.android.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 클릭리스너 구형하는 방법 세가지
     * 1. 위젯을 사용하는 객체가 상속 받아서 구형
     * 2. 객체 내에서 변수로 생성
     * 3. setOnclickListener 함수에 익명 객체로 전달
     * @param savedInstanceState
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final TextView tv = (TextView) findViewById(R.id.textView);
        Button btn = (Button) findViewById(R.id.btnclick);

        //1번 형태로 구형
        btn.set

//        //2번형태로 구현
//        View.OnClickListener listner = new Viw.OnClickListener(){

//        // 3
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setText("안녕 안드로이드!!");

            }
        };
    }
 }
