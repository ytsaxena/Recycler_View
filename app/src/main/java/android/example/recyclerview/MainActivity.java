package android.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ModelClass> userlist;





    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userlist = new ArrayList<>();
        userlist.add(new ModelClass(R.drawable.d,"Sachin Saxena","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.ff,"Raman Raghav","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.images,"Aam Admi","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.pig,"Amit","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.d,"Raghu","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.ff,"Rajiv","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.images,"Nandu","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.pig,"Bunty","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.d,"Hari","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.ff,"Saurabh","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.images,"Sumit","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.pig,"Riya","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.d,"Raunit","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.ff,"Rahul","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.images,"Ravi","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.pig,"Sweksha","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.d,"Payal","05:00","Internship Accepted","__________________________________________"));
        userlist.add(new ModelClass(R.drawable.ff,"Fauq","05:00","Internship Accepted","__________________________________________"));






        recyclerView = findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}