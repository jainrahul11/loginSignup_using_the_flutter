package in.shopview.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et1= (EditText) findViewById(R.id.usernameet);
        et2= (EditText) findViewById(R.id.passwordet);
        et3= (EditText) findViewById(R.id.cpasswordet);
        b2= (Button) findViewById(R.id.buttonsignup);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = et1.getText().toString();
                String password = et2.getText().toString();
                String cpassword = et3.getText().toString();

                Toast.makeText(SignupActivity.this, "Signup Succcessfull", Toast.LENGTH_SHORT).show();

                Intent a = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(a);
            }
        });


    }

    public void onClick(View view){
        Intent a = new Intent(SignupActivity.this,LoginActivity.class);
        startActivity(a);

    }
}
