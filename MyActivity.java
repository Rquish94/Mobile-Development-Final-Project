package com.cornez.unitconversioncalculator;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MyActivity extends Activity {

    private TextView inputLabel;
    private TextView outputLabel;
    private TextView outputMeasurement;
    private EditText inputMeasurement;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView1
        );
        imageView.setImageResource(R.drawable.aspheader);

        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView text1 = (TextView)findViewById(R.id.textview1);
                text1.setText("Welcome back Net-Neutrality");
            }
        });


        Button clickButton2 = (Button) findViewById(R.id.button2);
        clickButton2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView text2 = (TextView) findViewById(R.id.textview1);
                text2.setText("Goodbye Net-Neutrality");
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                    }


                });}});

        View myView = findViewById(R.id.imageView1);
        myView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {


                switch(event.getAction() & MotionEvent.ACTION_MASK)
                {
                    case MotionEvent.ACTION_DOWN :
                        imageView.setImageResource(R.drawable.aspflag);
                        break;
                    case MotionEvent.ACTION_UP :
                        imageView.setImageResource(R.drawable.aspheader);
                        break;
                }
                return true;
            }


        });






        Button clickButton3 = (Button) findViewById(R.id.button3);
        clickButton3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText edit3 = (EditText)findViewById(R.id.editText3);
                if (edit3.getText().toString().equals(dispinfo.AWNSER)){ edit3.setText("COREECT");
                }
                else{ edit3.setText("WRONG");
                }
            }



        })





        ;





    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.menuitem_feet_meters){

            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
