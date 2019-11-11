package com.example.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        book =new Book();
        book.setName("你好");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //use bundle and data implements Parcelable
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("data", book);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
