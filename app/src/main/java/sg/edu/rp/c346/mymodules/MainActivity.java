package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMo1;
    TextView tvMo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMo1 = findViewById(R.id.tvMod1);
        tvMo2 = findViewById(R.id.tvMod2);

        tvMo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Modules.class);
                intent.putExtra("Modules","Module Code: C346 \nModule Name: Android Programming \nAcademic Year: 2018 \nSemester: 1 \nModule Credit: 4 \nVenue: W66M");
                startActivity(intent);
            }
        });

        tvMo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Modules.class);
                intent.putExtra("Modules","Module Code: C349 \nModule Name: iPad Programming \nAcademic Year: 2018 \nSemester: 1 \nModule Credit: 4 \nVenue: W66M");
                startActivity(intent);
            }
        });
    }
}
