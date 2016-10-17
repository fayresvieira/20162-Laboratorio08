package  com.example.fabricio.laboratorio08;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListJava extends Activity {

    // Array of strings...
    String[] JavaArray = {"Java Android","Java JPA","Java JFS","Java EE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, JavaArray);

        ListView listView = (ListView) findViewById(R.id.java_list);
        listView.setAdapter(adapter);
    }
}