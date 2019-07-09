package what.is.recycleviewexercise;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    MaterialButton btnLoad;
    RecyclerView recyclerView;
    PersonAdapter personAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        personAdapter = new PersonAdapter(fetchPeople());
        
        recyclerView = findViewById(R.id.rv_people);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(personAdapter);

    }

    public List<Person> fetchPeople(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ryan Holloway", "235-4562", "https://images.unsplash.com/photo-1480535339474-e083439a320d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Tamara Bellis", "482-7342", "https://images.unsplash.com/photo-1505033575518-a36ea2ef75ae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Cesar Ricon", "926-5576", "https://images.unsplash.com/photo-1522075469751-3a6694fb2f61?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Jake Jackson", "388-1698","https://images.unsplash.com/photo-1495516372021-9c815fa7e668?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Brock Leibee","646-8821","https://images.unsplash.com/photo-1518806118471-f28b20a1d79d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Tarica Noah", "446-9127","https://images.unsplash.com/photo-1526382925646-27b5eb86796e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Omar De", "554-9722", "https://images.unsplash.com/photo-1518977081765-9b1b0c2538e2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Heather Newton", "881-7645", "https://images.unsplash.com/photo-1554243279-24d1d994d64d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Martin Badasin", "436-9138","https://images.unsplash.com/photo-1520107439942-20002c77062b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        people.add(new Person("Markson Sepra", "499-5815","https://images.unsplash.com/photo-1529074723-3167de44a1da?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        return people;
    }

}
