package br.java.android.lab01;

import br.java.android.lab01.R;
import android.app.Activity;
import android.os.Bundle;

public class Lab01Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}