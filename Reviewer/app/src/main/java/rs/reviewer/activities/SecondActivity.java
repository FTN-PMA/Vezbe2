package rs.reviewer.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import rs.reviewer.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String value = bundle.getString("KEY", "DEFAULT_VALUE");
            Toast.makeText(this, "Sent from activity: "+value, Toast.LENGTH_SHORT).show();
        }
    }
}
