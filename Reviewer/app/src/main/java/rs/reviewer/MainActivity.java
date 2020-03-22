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

        /*
        * Fragmenti ne mogu da postoje samostalno, njih 'lepimo' na aktivnosti.
        * Pogledati detalje ovih metoda.
        * */
        FragmentTransition.to(MyFragment.newInstance(), this, false, R.id.upView);
        FragmentTransition.to(MySecondFragment.newInstance("FTN"), this, false, R.id.downView);
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    }
}
