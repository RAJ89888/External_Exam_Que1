package com.example.external_exam_que1_by_rajvohera;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView up,down,left,right;
    CardView cardView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        up=findViewById(R.id.up);
        down=findViewById(R.id.down);
        left=findViewById(R.id.left);
        right=findViewById(R.id.right);
        cardView=findViewById(R.id.cardview);
        
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.up);
                cardView.startAnimation(animation);

            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.left);
                cardView.startAnimation(animation);

            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.right);
                cardView.startAnimation(animation);

            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.down);
                cardView.startAnimation(animation);

            }
        });

    }
}