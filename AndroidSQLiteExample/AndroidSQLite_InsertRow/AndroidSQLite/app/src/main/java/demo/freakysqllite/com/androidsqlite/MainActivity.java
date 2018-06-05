package demo.freakysqllite.com.androidsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    UsersDatabaseAdapter usersDatabaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the instance of Databse
        usersDatabaseAdapter=new UsersDatabaseAdapter(getApplicationContext());
    }

    public void insertRowActivity(View view) {
        Intent myIntent = new Intent(MainActivity.this, InsertRowActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

}
