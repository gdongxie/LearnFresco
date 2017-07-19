package com.zzl.learnfresco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    //带进度条的图片
    @OnClick(R.id.btn_one)
    void btn_one_click(View view) {
        intent = new Intent(this, FrescoOneActivity.class);
        startActivity(intent);
    }

    //图片的不同裁剪
    @OnClick(R.id.btn_two)
    void btn_two_click(View view) {
    }

    //圆形与圆角图片
    @OnClick(R.id.btn_three)
    void btn_three_click(View view) {

    }

    //渐进式展示图片
    @OnClick(R.id.btn_four)
    void btn_four_click(View view) {
    }

    //Gif动画图片
    @OnClick(R.id.btn_five)
    void btn_five_click(View view) {
    }

    //多图请求及图片的复用
    @OnClick(R.id.btn_six)
    void btn_six_click(View view) {
    }

    //图片加载监听
    @OnClick(R.id.btn_seven)
    void btn_seven_click(View view) {
    }

    //图片修改和旋转
    @OnClick(R.id.btn_eight)
    void btn_eight_click(View view) {
    }

    //修改图片
    @OnClick(R.id.btn_nine)
    void btn_nine_click(View view) {
    }

    //动态展示图片
    @OnClick(R.id.btn_ten)
    void btn_ten_click(View view) {
    }


}
