package com.example.welcome.sai.Indicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.welcome.sai.R;

public class GridviewActivity extends AppCompatActivity {
            Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new Adapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(),SingleActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setTitle("defaulttoolbar");
    }
    public boolean onSupportNavigateUp() {
        Intent intent=new Intent(GridviewActivity.this,Login.class);
        startActivity(intent);
        return true;
    }
}
