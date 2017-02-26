package fragments.android.csulb.edu.fragments_lab2;

/**
 * Created by prernaa on 2/25/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle
            savedInstanceState) {
        //----inflate the layout for this fragment --
        return inflater.inflate(R.layout.fragment1,container, false);
    }
}
