package com.texocoyotl.ptd1recyclerviewanimationsapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.texocoyotl.ptd1recyclerviewanimationsapp.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show();
    }
}
