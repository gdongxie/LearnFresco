package com.zzl.learnfresco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FrescoOneActivity extends AppCompatActivity {
    @BindView(R.id.my_image_one)
    SimpleDraweeView simpleDraweeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_one);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        //图片地址
        String path = "http://img1.mm131.com/pic/2619/16.jpg";
        //设置样式  进度条
        GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(getResources());
        GenericDraweeHierarchy hierarchy = builder.setProgressBarImage(new ProgressBarDrawable()).build();
        simpleDraweeView.setHierarchy(hierarchy);

        Uri uri = Uri.parse(path);
        //加载图片
        simpleDraweeView.setImageURI(uri);

    }
}
