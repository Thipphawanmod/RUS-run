package rus.aimthiang.thipphawan.rusrun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText;
    ,passwordEditText;
    private ImageView imageView;
    private static final String urllogo = "http://swiftcodingthai.com/rus/image/logo_rus.png";
    private String userString;
    ,passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);
        imageView = (ImageView) findViewById(R.id.imageView6);


        //Load Image from Server
        Picasso.with(this).load(urllogo).into(imageView);


    }   // Main Method

    public void clickSignIn(View view) {
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();


    } // clickSign

    if(userString.equals("")||passwordString.equals(""))

    {
        //Have Space
        MyAlert myAlert = new MyAlert();
        MyAlert myDialog (this, "Have pace",
            "Pleslease Fill All Every Blank");

    }

    else
    //No Space

} //if



    public void ClickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
}    // Main Class นี่คือคลาสหลัก
