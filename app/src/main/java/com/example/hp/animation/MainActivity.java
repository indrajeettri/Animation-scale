package com.example.hp.animation;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Drawable frameanimation;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imge1);
        imageView.setBackgroundResource(R.drawable.myframeanimation);
        frameanimation=imageView.getBackground();
       animation= AnimationUtils.loadAnimation(this,R.anim.myanimtion1);
    }
    public void start(View view) {
        if(frameanimation instanceof Animatable){
            ((Animatable)frameanimation).start();
        }
    }
    public void stop(View view) {
        if(((Animatable)frameanimation).isRunning()){
            ((Animatable)frameanimation).stop();
        }
    }
}