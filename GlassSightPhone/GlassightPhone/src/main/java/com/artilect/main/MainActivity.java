package com.artilect.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    //view variables

    private Button tapButton;
    private Button leftButton;
    private Button rightButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCallbacks();

    }

    private void initCallbacks() {
        tapButton = (Button) findViewById(R.id.tap);
        tapButton = (Button) findViewById(R.id.tap);
        tapButton = (Button) findViewById(R.id.tap);
        tapButton = (Button) findViewById(R.id.tap);


    }

}
