package test.jinesh.awesometoggleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    AwesomeToggle awesomeToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        awesomeToggle= (AwesomeToggle) findViewById(R.id.sample);
        awesomeToggle.setOnCheckedChangeListner(new AwesomeToggle.OnCheckedChangeListner() {
            @Override
            public void onChecked(boolean isChecked) {

            }
        });
    }
}
