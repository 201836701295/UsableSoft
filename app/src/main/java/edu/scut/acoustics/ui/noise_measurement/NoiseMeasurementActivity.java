package edu.scut.acoustics.ui.noise_measurement;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.scut.acoustics.R;
import edu.scut.acoustics.databinding.ActivityNoiseMeasurementBinding;

public class NoiseMeasurementActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNoiseMeasurementBinding activity = DataBindingUtil.setContentView(this, R.layout.activity_noise_measurement);
    }


    @Override
    public void onClick(View view) {

    }
}
