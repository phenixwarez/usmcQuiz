package com.example.android.platoonformationquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class usmcHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usmc_history);
    }

    public void radioGroupAmphibLanding(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_nasau:
                if (checked)
                    // answer a
                    break;
            case R.id.radio_tripoli:
                if (checked)
                    // answer b
                    break;
            case R.id.radio_normandy:
                if (checked)
                    // answer c
                    break;
        }
    }
    public void radioGroup_firstfemale(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_hc:
                if (checked)
                    // answer a
                    break;
            case R.id.radio_omj:
                if (checked)
                    // answer b
                    break;
            case R.id.radio_rr:
                if (checked)
                    // answer c
                    break;
        }
    }

    public void radiobutton_mostdecorated(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_dandaly:
                if (checked)
                    // answer a
                    break;
            case R.id.radio_johnbasilone:
                if (checked)
                    // answer b
                    break;
            case R.id.radio_chestypuller:
                if (checked)
                    // answer c
                    break;
        }
    }

    public void radiobutton_usmcaviation(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_aacunnigham:
                if (checked)
                    // answer a
                    break;
            case R.id.radio_charlieChaplin:
                if (checked)
                    // answer b
                    break;
            case R.id.radio_drewcarey:
                if (checked)
                    // answer c
                    break;
        }
    }
}
