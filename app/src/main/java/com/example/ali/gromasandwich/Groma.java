package com.example.ali.gromasandwich;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by ali on 02/02/2018.
 */
public class Groma {

  ImageView root;
  RelativeLayout.LayoutParams params;
  int width =30;
  int height = 30;

  public Groma(){
    root = new ImageView(MyApplication.getAppContext());
    params = new RelativeLayout.LayoutParams(
      ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    params.height = height;
    params.width = width;
    root.setBackgroundResource(R.drawable.groma);
  }

}
