package com.example.miku.cse110;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Pop extends Activity
{
    EditText task, time, description;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        Button add = (Button) findViewById(R.id.submit);

        add.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                task = (EditText) findViewById(R.id.editText);
                time = (EditText) findViewById(R.id.editText2);
                description = (EditText) findViewById(R.id.editText3);

                String getInput1 = task.getText().toString().trim();
                String getInput2 = time.getText().toString().trim();
                String getInput3 = description.getText().toString().trim();

                if (getInput1 == null)
                {
                    Toast.makeText(getBaseContext(), "Please Enter the title of the task/event", Toast.LENGTH_LONG).show();
                }
                else
                {
                    MainActivity.addArray.add(getInput1 + " || Time for this is: " + getInput2 + " || Description: " + getInput3);
                }
            }
        });

        //DisplayMetrics dm = new DisplayMetrics();

       // getWindowManager().getDefaultDisplay().getMetrics(dm);

       // int width = dm.widthPixels;
       // int height = dm.heightPixels;

        //getWindow().setLayout((int) (width * 0.75), (int) (height * 0.6));


    }
}
