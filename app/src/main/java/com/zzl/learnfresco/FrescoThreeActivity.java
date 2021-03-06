package com.zzl.learnfresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FrescoThreeActivity extends AppCompatActivity {
    @BindView(R.id.my_image_three)
    SimpleDraweeView simpleDraweeView;
    private GenericDraweeHierarchyBuilder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_three);
        ButterKnife.bind(this);
        builder = new GenericDraweeHierarchyBuilder(getResources());

    }

    //设置圆形图片
    @OnClick(R.id.btn_fresco_circle)
    void btn_fresco_circle(View view) {
        //设置圆形图片
        Uri uri = Uri.parse("http://img.hb.aicdn.com/b639d094e96cbe54ce7940e3c1d9bd365b0311a0346a7-gRBP0g_fw658");
        RoundingParams params = RoundingParams.asCircle();
        //设置边界 （颜色 大小）
        params.setBorder(getResources().getColor(R.color.colorAccent), 5);
        GenericDraweeHierarchy hierarchy = builder.setRoundingParams(params).build();
        simpleDraweeView.setHierarchy(hierarchy);
        simpleDraweeView.setImageURI(uri);
    }

    //设置圆角图片
    @OnClick(R.id.btn_fresco_conner)
    void btn_fresco_conner(View view) {
        Uri uri = Uri.parse("http://img.hb.aicdn.com/b639d094e96cbe54ce7940e3c1d9bd365b0311a0346a7-gRBP0g_fw658");
        //设置圆角大小
        RoundingParams parmas = RoundingParams.fromCornersRadius(50f);
        //设置覆盖颜色
//        parmas.setOverlayColor(getResources().getColor(R.color.colorPrimary));
        //设置边界 （颜色 大小）
           parmas.setBorder(getResources().getColor(R.color.colorAccent), 5);
        GenericDraweeHierarchy hierarchy = builder.setRoundingParams(parmas)
                .setActualImageScaleType(ScalingUtils.ScaleType.CENTER)
                .build();
        simpleDraweeView.setHierarchy(hierarchy);
        simpleDraweeView.setImageURI(uri);

    }
}
