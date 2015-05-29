package com.blueskyhe.blueskydesignpattern.factory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;

import com.blueskyhe.blueskydesignpattern.R;
import com.blueskyhe.blueskydesignpattern.factory.domains.Operation;
import com.blueskyhe.blueskydesignpattern.factory.factory.OperationFactory;


public class FactoryActivity extends Activity {

    private EditText mInputNumberA;
    private EditText mInputNumberB;
    private Spinner mSpinner;

    private Operation mOper;
    private OperationFactory mOperationFactory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        initViews();
    }

    private void initViews() {
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_factory, menu);
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
