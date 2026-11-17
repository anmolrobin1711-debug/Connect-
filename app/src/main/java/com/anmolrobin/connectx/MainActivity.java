package com.anmolrobin.connectx;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 40, 30, 30);
        layout.setBackgroundColor(Color.rgb(245, 247, 255));

        TextView title = new TextView(this);
        title.setText("ConnectX");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(40, 70, 180));
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 30, 10, 30);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Connect with your friends");
        subtitle.setTextSize(17);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        addButton("💬  Private Chat");
        addButton("👥  Group Chat");
        addButton("📷  Share Photos");
        addButton("🎙  Voice Messages");
        addButton("🟢  Online Friends");

        setContentView(layout);
    }

    void addButton(String text) {
        Button button = new Button(this);
        button.setText(text);
        button.setTextSize(17);

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            );

        params.setMargins(0, 15, 0, 5);
        layout.addView(button, params);
    }
}
