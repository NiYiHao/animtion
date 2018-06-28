package com.example.administrator.animtion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] buttons;
    int resType;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_anim );
        buttons = new Button[6];
        for (int i = 0; i < buttons.length; i++) {
            String buttonID = "button" + i;
            int resID = getResources().getIdentifier( buttonID, "id", getPackageName() );
            buttons[i] = findViewById( resID );
            buttons[i].setOnClickListener( this );
        }
        logo = findViewById( R.id.logo );
    }
    public void animation(View view, int type,ImageView img){

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                type);
        logo.startAnimation(animation);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                resType = getResources().getIdentifier("fade_in", "anim", getPackageName());
                animation( v , resType , logo);
                break;
            case R.id.button1:
                resType = getResources().getIdentifier("fade_out", "anim", getPackageName());
                animation( v , resType , logo);
                break;
            case R.id.button2:
                resType = getResources().getIdentifier("rotate_in", "anim", getPackageName());
                animation( v , resType , logo);
                break;
            case R.id.button3:
                resType = getResources().getIdentifier("scale_in", "anim", getPackageName());
                animation( v , resType , logo);
                break;
            case R.id.button4:
                resType = getResources().getIdentifier("translate_in", "anim", getPackageName());
                animation( v , resType , logo);
                break;
            case R.id.button5:
                resType = getResources().getIdentifier("translate_out", "anim", getPackageName());
                animation( v , resType , logo);
                break;
        }
    }

//    public void fadein(View view) {
//        ImageView logo = findViewById( R.id.logo );
//        Animation fadein = AnimationUtils.loadAnimation( this, R.anim.fade_in );
//        logo.startAnimation( fadein );
//    }
//
//    public void fadeout(View view) {
//        ImageView logo = findViewById( R.id.logo );
//        Animation fadeout = AnimationUtils.loadAnimation( this, R.anim.fade_out );
//        logo.startAnimation( fadeout );
//    }
//
//    public void rotate(View view) {
//        ImageView logo = findViewById( R.id.logo );
//        Animation rotate = AnimationUtils.loadAnimation( this, R.anim.rotate_in );
//        logo.startAnimation( rotate );
//    }
//
//    public void scale(View view) {
//        ImageView logo = findViewById( R.id.logo );
//        Animation scale = AnimationUtils.loadAnimation( this, R.anim.scale_in );
//        logo.startAnimation( scale );
//    }
//
//    public void transate_in(View view) {
//        ImageView logo = findViewById( R.id.logo );
//        Animation translate_in = AnimationUtils.loadAnimation( this, R.anim.translate_in );
//        logo.startAnimation( translate_in );
//    }
//
//    public void transate_out(View view) {
//        ImageView logo = findViewById( R.id.logo );
//        Animation translate_out = AnimationUtils.loadAnimation( this, R.anim.translate_out );
//        logo.startAnimation( translate_out );
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button0:
//                fadein( v );
//                break;
//            case R.id.button1:
//                fadeout( v );
//                break;
//            case R.id.button2:
//                rotate( v );
//                break;
//            case R.id.button3:
//                scale( v );
//                break;
//            case R.id.button4:
//                transate_in( v );
//                break;
//            case R.id.button5:
//                transate_out( v );
//                break;
//        }
//    }
}
