package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button SignupRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        SignupRegister = findViewById(R.id.bSignupRegister);
        SignupRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == SignupRegister){
            Intent signupRegiser = new Intent(this, OptionSignupActivity.class);
            startActivity(signupRegiser);
        }
    }
}
