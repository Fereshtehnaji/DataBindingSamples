package com.naji.databindingsamples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.naji.databindingsamples.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Actor actor = new Actor(getString(R.string.actor1_name),
                getString(R.string.actor1_bio), R.drawable.actor_peyman_maadi);

        mBinding.setActor(actor);

    }
}