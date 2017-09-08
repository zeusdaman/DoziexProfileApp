package com.zeus.xero.doziexprofileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn1 = (Button) findViewById(R.id.facebook);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String url = "https://facebook.com/dozieakakuru";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button btn2 = (Button) findViewById(R.id.github);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String url = "https://github.com/zeusdaman";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button btn3 = (Button) findViewById(R.id.twitter);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String url = "https://twitter.com/dakakuru";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
        Button btn4 = (Button) findViewById(R.id.call);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + getString(R.string.phone_number);
                intent.setData(Uri.parse(temp));
                startActivity(intent);
            }
        });
        Button btn5 = (Button) findViewById(R.id.mail);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "chidozieakakuru@gmail.com; xyluz@ymail.com", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "HNG Internship");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
