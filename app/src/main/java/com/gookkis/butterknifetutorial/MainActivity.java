package com.gookkis.butterknifetutorial;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.BindDrawable;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //inisialisasi TextView
    @Bind(R.id.tv_butterknife)
    TextView textViewButterKnife;

    //inisialisasi Button
    @Bind(R.id.button_butterknife)
    Button btnButterKnife;

    //inisialisasi ImageView
    @Bind(R.id.iv_butterknife)
    ImageView imageViewButterKnife;

    //Binding resource Drawable
    @BindDrawable(R.drawable.gookkis)
    Drawable gookkisLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instance Libray ButterKnife
        ButterKnife.bind(this);

    }

    //OnClik method dari button Butter Knife
    @OnClick(R.id.button_butterknife)
    public void btnClicked() {
        textViewButterKnife.setText(R.string.btn_clicked_info);
        imageViewButterKnife.setImageDrawable(gookkisLogo);
    }
}
