package de.thk.vma.vma_praktikum3_aufgabe3;

/*
Bei Drücken des Buttons "AUFGABE3" wird ausschließlich die Activity aus Aufgabe 3.2 gestartet.
Warum ist das so?

*/


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {
    ArrayList<String> items = new ArrayList<>(Arrays.asList("AUFGABE31", "AUFGABE32", "AUFGABE3"));
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ListViewListener());
    }

    private class ListViewListener implements AdapterView.OnItemClickListener{
        public void onItemClick(AdapterView<?> adapterView, View datenElement, int position, long id) {
            CharSequence itemText = ((TextView)datenElement).getText();
            if (itemText == "AUFGABE31") {
                Intent intent = new Intent("AUFGABE31");
                startActivity(intent);
                //Toast.makeText(MainActivity.this, "AUFGABE31", Toast.LENGTH_SHORT).show();
            }
            if (itemText == "AUFGABE32") {
                Intent intent = new Intent("AUFGABE32");
                startActivity(intent);

                //Toast.makeText(MainActivity.this, "AUFGABE32", Toast.LENGTH_SHORT).show();

            }
            if (itemText == "AUFGABE3") {
                Intent intent = new Intent("AUFGABE3");
                startActivity(intent);
                //Toast.makeText(MainActivity.this, "AUFGABE3", Toast.LENGTH_SHORT).show();

            }
        }
    }
}