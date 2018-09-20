package com.example.emobilis.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    //declare an array of type string with data
    String [] myCarsArray ={
          "Subaru",
          "cruiser",
          "honda",
          "Tesla",
          "Range",
          "porsche",
          "Volvo",
          "Mitsubishi"
    };
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define an adapter to set data to view
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myCarsArray);

        //assign variables to views
        listView=(ListView)findViewById(R.id.lstvew);

        //set list view data
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MainActivity.this, "Item on index "+position+" is :"+myCarsArray[position], Toast.LENGTH_SHORT).show();


            }
        });



    }
}
