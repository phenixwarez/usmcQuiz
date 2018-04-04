@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usmc_history);
    }

    int scoreHistory = 0;


    public void radiobutton_amphibLanding(View view) {
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

    public void radiobutton_firstfemale(View view) {
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

    public void radiobutton_mostdecorated(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_nasau:
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

    public void radiobutton_usmcAviation(View view) {
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

    public void submitHistory(View view) {

        RadioButton radioButtonNasau = (RadioButton) findViewById(R.id.radio_nasau);
        boolean hasNasau = radioButtonNasau.isChecked();
        RadioButton radioButtonOMJ = (RadioButton) findViewById(R.id.radio_omj);
        boolean hasOMJ = radioButtonOMJ.isChecked();
        RadioButton radioButtonChestyPuller = (RadioButton) findViewById(R.id.radio_chestypuller);
        boolean hasChestyPuller = radioButtonChestyPuller.isChecked();
        RadioButton radioButtonAACunningham = (RadioButton) findViewById(R.id.radio_aacunnigham);
        boolean hasAACunningham = radioButtonAACunningham.isChecked();

        if (hasNasau) {
            scoreHistory += 25;
        }
        if (hasOMJ) {
            scoreHistory += 25;
        }
        if (hasChestyPuller) {
            scoreHistory += 25;
        }
        if (hasAACunningham) {
            scoreHistory += 25;
        }

        Toast.makeText(this, "Your score is" + scoreHistory, Toast.LENGTH_LONG);
    }
}
