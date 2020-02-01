package com.sheikh.multipleactivitiesandsearchbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Button btnNext = findViewById(R.id.btnNext);
        final EditText inTxt = findViewById(R.id.inTxt);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(inTxt.getText().toString().trim())){

                    String valOfActivity1 = inTxt.getText().toString();

                    Intent intent = new Intent(MainActivity.this, Activity2.class);

                    intent.putExtra("keyA",valOfActivity1);


                    startActivity(intent);
                    finish();
                }

                else{
                    Toast.makeText(MainActivity.this,"Enter input",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
