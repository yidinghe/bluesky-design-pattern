package com.blueskyhe.blueskydesignpattern.factorypattern;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.blueskyhe.blueskydesignpattern.R;
import com.blueskyhe.blueskydesignpattern.factorypattern.domains.Operation;
import com.blueskyhe.blueskydesignpattern.factorypattern.factory.OperationFactory;


public class FactoryActivity extends Activity {

    private EditText mInputNumberA;
    private EditText mInputNumberB;
    private Spinner mSpinner;
    private TextView mResult;


    private Operation mOper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        initViews();
    }

    private void initViews() {
        mInputNumberA = (EditText) findViewById(R.id.et_input_number_A);
        mInputNumberB = (EditText) findViewById(R.id.et_input_number_B);
        mSpinner = (Spinner) findViewById(R.id.spinner);
        mResult = (TextView) findViewById(R.id.tv_results);

        final String[] mItems = OperationFactory.getAllOperations();

        mSpinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems));

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mOper = OperationFactory.createOperation(mItems[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(FactoryActivity.this, "Please check your inputs", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void calculate(View view) {
        String mNumberA = mInputNumberA.getText().toString().trim();
        String mNumberB = mInputNumberB.getText().toString().trim();

        if (TextUtils.isEmpty(mNumberA) || TextUtils.isEmpty(mNumberB)) {
            Toast.makeText(this, "Please check your inputs", Toast.LENGTH_SHORT).show();
            return;
        }

        mOper.setNumberA(Double.parseDouble(mNumberA));
        mOper.setNumberB(Double.parseDouble(mNumberB));

        mResult.setText(mOper.getResult() + "");
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
