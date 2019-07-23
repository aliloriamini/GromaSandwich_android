package com.example.ali.gromasandwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

  RelativeLayout full;
  Groma Groma;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    full = (RelativeLayout) findViewById(R.id.full);
    Groma = new Groma();
    full.addView(Groma.root,Groma.params);

  }
}
