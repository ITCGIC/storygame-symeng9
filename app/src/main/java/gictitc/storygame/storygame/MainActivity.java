package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignIn = findViewById(R.id.bSignin);
        SignIn.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        if (view == SignIn){
            Intent i = new Intent(this, HorrorActivity.class);
            startActivity(i);
        }
    }
}
