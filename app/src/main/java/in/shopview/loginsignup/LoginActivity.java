package in.shopview.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1= (EditText) findViewById(R.id.usernameet);
        et2= (EditText) findViewById(R.id.passwordet);
        b1= (Button) findViewById(R.id.buttonlogin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = et1.getText().toString();
                String Password= et2.getText().toString();

                if (Username.equals("admin")){
                    if (Password.equals("123456")){

                        Toast.makeText(LoginActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(LoginActivity.this,HomeActivity.class);
                        startActivity(a);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                    }


                }
                else {
                    Toast.makeText(LoginActivity.this, "Wrong Username", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onSubmit(View view){
        Intent a = new Intent(LoginActivity.this,SignupActivity.class);
        startActivity(a);
    }
}