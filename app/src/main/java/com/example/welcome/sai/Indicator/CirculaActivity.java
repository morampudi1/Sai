package com.example.welcome.sai.Indicator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.example.welcome.sai.R;

import java.util.HashMap;

public class CirculaActivity extends AppCompatActivity {
        SliderLayout sliderLayout;
        HashMap<Object, Object> sliderImages;
        TextSliderView  textSliderView;
        String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circula);
        sliderLayout = (SliderLayout) findViewById(R.id.sliderLayout);
        sliderImages = new HashMap<>();
        sliderImages.put("Great Indian Deal", R.drawable.carside1);
        sliderImages.put("New Deal Every Hour",R.drawable.carside2);
        sliderImages.put("Appliances Sale", R.drawable.carside3);
        sliderImages.put("UnBox snapdeal",R.drawable.caeside4);
        sliderImages.put("Great Deals", R.drawable.car);

        for ( name : sliderImages.keySet()) {

            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description(name)
                    .image((Integer) sliderImages.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);
            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(3000);
        sliderLayout.addOnPageChangeListener((ViewPagerEx.OnPageChangeListener) this);
    }
}
