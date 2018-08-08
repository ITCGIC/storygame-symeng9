package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Horror, Drama, Nervous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Horror = findViewById(R.id.bHorror);
        Drama = findViewById(R.id.bDrama);
        Nervous = findViewById(R.id.bNervous);

        Horror.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        if (view == Horror){
            Intent i = new Intent(this, HorrorActivity.class);
            startActivity(i);
        }
    }
}
