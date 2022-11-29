package vietmobi.net.datingapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import vietmobi.net.datingapp.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    TextView btnStart;
    EditText edtEmail, edtPasswd, edtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initViews();
        addEvents();
    }

    private void addEvents() {
        btnStart.setOnClickListener(this);
    }

    private void initViews() {
        btnStart = findViewById(R.id.btnStart);
        edtEmail = findViewById(R.id.edtEmail);
        edtPasswd = findViewById(R.id.edtPasswd);
        edtUser = findViewById(R.id.edtUser);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStart:
            checkSignUp();
        }
    }

    private void checkSignUp() {
    }
}