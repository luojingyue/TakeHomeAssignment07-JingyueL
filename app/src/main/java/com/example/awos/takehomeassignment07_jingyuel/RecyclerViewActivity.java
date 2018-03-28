package com.example.awos.takehomeassignment07_jingyuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private List<Person> persons;
    private PersonsAdapter personsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTitle("Recycler View");
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        initialData();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        personsAdapter=new PersonsAdapter(persons,this);
        recyclerView.setAdapter(personsAdapter);

    }

    public void initialData(){
        persons = new ArrayList<>();
        persons.add(new Person("Bill Clinton","1993-2001",R.drawable.clinton));
        persons.add(new Person("George W. Bush","2001-2009",R.drawable.bush));
        persons.add(new Person("Barack Obama","2009-20171",R.drawable.obama));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_recycler,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                persons.add(getRandomPerson());
                personsAdapter.notifyDataSetChanged();

            default:
            return super.onOptionsItemSelected(item);
        }

    }

    private Person getRandomPerson(){
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Person("Bill Clinton", "1993-2001", R.drawable.clinton);
        else if (num == 1)
            return new Person("George W. Bush", "2001-2009", R.drawable.bush);
        else
            return new Person("Barack Obama", "2009-2017", R.drawable.obama);
    }

    public void add(View view) {
        persons.add(getRandomPerson());
        personsAdapter.notifyDataSetChanged();
    }
}

