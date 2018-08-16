package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button SignIn, Forgot,SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignIn = findViewById(R.id.bSignin);
        SignIn.setOnClickListener(this);

        Forgot = findViewById(R.id.bForgot);
        Forgot.setOnClickListener(this);

        SignUp = findViewById(R.id.bSigup);
        SignUp.setOnClickListener(this);





    }


    @Override
    public void onClick(View view) {
        if (view == SignIn){
            Intent i = new Intent(this, MapViewActivity.class);
            startActivity(i);
        }

        if (view == Forgot){
            Intent forgot = new Intent(this, ForgotActivity.class);
            startActivity(forgot);
        }

        if (view == SignUp){
            Intent signup = new Intent(this, SignUpActivity.class);
            startActivity(signup);
        }
    }
}
