package kami.com.latihanrxjava.view;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import kami.com.latihanrxjava.R;

public class MainActivity extends AppCompatActivity {

    private Button amainBtnRemotesearch;
    private Button amainBtnLocalsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int flags = view.getSystemUiVisibility();
            flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            view.setSystemUiVisibility(flags);
            getWindow().setStatusBarColor(Color.WHITE);
        }
    }

    private void initView() {
        amainBtnRemotesearch = findViewById(R.id.amain_btn_remotesearch);
        amainBtnLocalsearch = findViewById(R.id.amain_btn_localsearch);
    }

}
