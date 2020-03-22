package rs.reviewer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import rs.reviewer.fragments.MyFragment;
import rs.reviewer.fragments.MySecondFragment;
import rs.reviewer.tools.FragmentTransition;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransition.to(MyFragment.newInstance(), this, false, R.id.upView);
        FragmentTransition.to(MySecondFragment.newInstance("FTN"), this, false, R.id.downView);
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    }
}
