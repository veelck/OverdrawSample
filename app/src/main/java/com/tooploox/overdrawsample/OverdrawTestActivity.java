package com.tooploox.overdrawsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

/**
 * BEERWARE - modified:
 *
 * Damian Walczak wrote this file. It is adviced, to leave this notice in this form.
 * You can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a beer in return.
 * <damian{at}tooploox.com>
 *
 */
public class OverdrawTestActivity extends Activity {

    RelativeLayout rlTestBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdraw_test);
        rlTestBackground = (RelativeLayout)findViewById(R.id.rl_test_background);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.overdraw_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_no_overdraw) {
            rlTestBackground.setBackgroundResource(R.drawable.no_overdraw_ninepatch);
            return true;
        }
        if (id == R.id.action_penta_overdraw) {
            rlTestBackground.setBackgroundResource(R.drawable.penta_layer_list);
        }
        if (id == R.id.action_stroke_overdraw) {
            rlTestBackground.setBackgroundResource(R.drawable.stroke_overdraw);
        }
        return super.onOptionsItemSelected(item);
    }
}
