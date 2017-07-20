package com.zzl.learnfresco;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FrescoTwoActivity extends Activity {
    @BindView(R.id.my_image_two)
    SimpleDraweeView simpleDraweeView;
    @BindView(R.id.tv_introduce)
    TextView textView;
    private GenericDraweeHierarchyBuilder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_two);
        ButterKnife.bind(this);
        builder = new GenericDraweeHierarchyBuilder(getResources());
    }

    //居中  无缩放
    @OnClick(R.id.btn_fresco_center)
    void btn_fresco_center(View view) {
        textView.setText("居中  无缩放");
        //样式设置
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.CENTER).build();
        displayImage(hierarchy);

    }

    //保持宽高比，放大或缩小，使得两边大于或者等于显示边界，居中显示
    @OnClick(R.id.btn_fresco_centerCrop)
    void btn_fresco_centerCrop(View view) {
        textView.setText("保持宽高比，放大或缩小，使得两边大于或者等于显示边界，居中显示");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP).build();
        displayImage(hierarchy);
    }

    //同centerCrop， 但居中点不是中点，而是指定某个点，这里我设置为图片的左上角那个点
    @OnClick(R.id.btn_fresco_focusCrop)
    void btn_fresco_focusCrop(View view) {
        textView.setText("同centerCrop， 但居中点不是中点，而是指定某个点，这里我设置为图片的左上角那个点");
        PointF point = new PointF(0, 0);
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.FOCUS_CROP)
                .setActualImageFocusPoint(point)
                .build();
        displayImage(hierarchy);
    }

    //使两边显示在边界内，居中显示，如果图片尺寸大于显示边界，则保持长宽比缩小图片
    @OnClick(R.id.btn_fresco_centerInside)
    void btn_fresco_centerInside(View view) {
        textView.setText("使两边显示在边界内，居中显示，如果图片尺寸大于显示边界，则保持长宽比缩小图片");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE)
                .build();
        displayImage(hierarchy);
    }

    //保持宽高比，缩小或者放大，使得图片完全显示在边界内，居中显示
    @OnClick(R.id.btn_fresco_fitCenter)
    void btn_fresco_fitCenter(View view) {
        textView.setText("保持宽高比，缩小或者放大，使得图片完全显示在边界内，居中显示");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER)
                .build();
        displayImage(hierarchy);
    }

    //保持宽高比，缩小或者放大，使得图片完全显示在边界内，不居中，和显示边界左上对齐
    @OnClick(R.id.btn_fresco_fitStart)
    void btn_fresco_fitStart(View view) {
        textView.setText("保持宽高比，缩小或者放大，使得图片完全显示在边界内，不居中，和显示边界左上对齐");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.FIT_START)
                .build();
        displayImage(hierarchy);
    }

    //保持宽高比，缩小或者放大，使得图片完全显示在边界内，不居中，和显示边界右下对齐
    @OnClick(R.id.btn_fresco_fitEnd)
    void btn_fresco_fitEnd(View view) {
        textView.setText("保持宽高比，缩小或者放大，使得图片完全显示在边界内，不居中，和显示边界右下对齐");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.FIT_END).build();
        displayImage(hierarchy);
    }

    //不保持宽高比，填充满显示边界
    @OnClick(R.id.btn_fresco_fitxy)
    void btn_fresco_fitxy(View view) {
        textView.setText("不保持宽高比，填充满显示边界");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(ScalingUtils.ScaleType.FIT_XY).build();
        displayImage(hierarchy);
    }

    //如果使用title mode 显示，需要设置为none
    @OnClick(R.id.btn_fresco_none)
    void btn_fresco_none(View view) {
        textView.setText("如果使用title mode 显示，需要设置为none");
        GenericDraweeHierarchy hierarchy = builder.setActualImageScaleType(null).build();
        displayImage(hierarchy);

    }


    private void displayImage(GenericDraweeHierarchy hierarchy) {
        simpleDraweeView.setHierarchy(hierarchy);
        simpleDraweeView.setImageURI(Uri.parse("http://img1.mm131.com/pic/2619/16.jpg"));
    }

}
