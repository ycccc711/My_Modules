package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Modules extends AppCompatActivity {

    TextView tvDetails;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        tvDetails = findViewById(R.id.tvDetails);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String value = intent.getStringExtra("Modules");
        tvDetails.setText(value);

        //navigate back to the previous activity 
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Modules.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
