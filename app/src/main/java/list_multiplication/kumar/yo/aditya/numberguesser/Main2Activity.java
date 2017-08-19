package list_multiplication.kumar.yo.aditya.numberguesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();
       // Toolbar tb=
        //tb.setLogo(R.drawable.guessmy);
        iv=(ImageView)findViewById(R.id.img);
        Animation am= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_guess);
        iv.setAnimation(am);
        am.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i1);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
