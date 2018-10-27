package com.example.makwanamitesh.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner mSpinner;
    private ArrayList<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        mSpinner = findViewById( R.id.spinner );

        mData = new ArrayList<>(  );
        mData.add( "Text 1" );
        mData.add( "Text 2" );
        mData.add( "Text 3" );
        mData.add( "Text 4" );
        mData.add( "Text 5" );
        mData.add( "Text 6" );
        mData.add( "Text 7" );
        mData.add( "Text 8" );

        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, mData );
        mSpinner.setAdapter( adapter );

        mSpinner.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e( "Selected :", " -=> " + mData.get( i ) );
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        } );

    }
}
