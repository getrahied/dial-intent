package com.example.devsufy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        no=(EditText)findViewById(R.id.no);
        String num="tel:"+no.getText().toString();
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(num));
        startActivity(intent);
    }
}
