package app.sasoi_example.rf01.ejemplo_passwod;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by 5T on 19/03/2018.
 */

public class ImageActivity extends AppCompatActivity{

    private CheckBox checkBox;
    private ImageView img_ok;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        CharSequence text = "Hola Que tal";
        int duration = Toast.LENGTH_SHORT;
        //int duration = Toast.SHORT;
        Toast.makeText(context, text, duration).show();

        checkBox = (CheckBox) findViewById(R.id.id_check);
        img_ok = (ImageView) findViewById(R.id.ima_view_ok);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                   img_ok.setVisibility(View.VISIBLE);
                }
                else
                {
                    img_ok.setVisibility(View.GONE);
                }
            }
        });

    }
}
