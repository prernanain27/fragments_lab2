package fragments.android.csulb.edu.fragments_lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Display;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //get the current display info
        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();
        if(d.getWidth() > d.getHeight())
        { //landscape mode display fragment 1
            Fragment1 fragment1 = new Fragment1();
            //adroid.R.id.content refers to the content
            //view of the activity
            fragmentTransaction.replace(android.R.id.content, fragment1);
        }
        else
        { //portrait --display fragment 2
            Fragment2 fragment2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content, fragment2);
        }
        fragmentTransaction.commit();
        setContentView(R.layout.activity_main);

    }
}
