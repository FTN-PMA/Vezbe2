package rs.reviewer.tools;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class FragmentTransition
{
	public static void to(Fragment newFragment, FragmentActivity activity, boolean addToBackstack, int id)
	{
		FragmentTransaction transaction = activity.getSupportFragmentManager()
			.beginTransaction()
			.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
			.replace(id, newFragment);
		if(addToBackstack) transaction.addToBackStack(null);
		transaction.commit();
	}
}
