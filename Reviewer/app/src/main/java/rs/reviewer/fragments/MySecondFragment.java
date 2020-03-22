package rs.reviewer.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import rs.reviewer.R;

public class MySecondFragment extends Fragment {

    public static MySecondFragment newInstance(String someParam) {
        Bundle args = new Bundle();
        args.putString("SOME_PARAM_KEY", someParam);

        MySecondFragment fragment = new MySecondFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle data) {
        View view = inflater.inflate(R.layout.mysecondfragment_layout, vg, false);

        Bundle bundle = getArguments();
        if (bundle != null){
            String param = bundle.getString("SOME_PARAM_KEY", "DEFAULT");
            TextView textView = view.findViewById(R.id.textView2);
            textView.setText(param);
        }

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "onActivityCreated()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "onAttach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "onDeatach()", Toast.LENGTH_SHORT).show();
    }
}
