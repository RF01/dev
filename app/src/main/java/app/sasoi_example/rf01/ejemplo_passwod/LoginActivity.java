package app.sasoi_example.rf01.ejemplo_passwod;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText mUserView , mPasswordView;
    private Button btn_send;
    private static final String PASSWORD="1234";
    private String myPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserView = (EditText) findViewById(R.id.edi_usuario);
        mPasswordView = (EditText) findViewById(R.id.edi_password);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mPasswordView.getText().toString().equals(PASSWORD)) {
                    Intent myIntent = new Intent(getApplicationContext(), ImageActivity.class);
                    //  myIntent.putExtra("SESSION_ID", mUserView.getText());
                    startActivity(myIntent);
                } else {
                    AlertDialog alertDialog = new AlertDialog.Builder(LoginActivity.this).create();
                    alertDialog.setTitle("AVISO");
                    alertDialog.setMessage("Alert MENSAJE PARA EL AVISO to be shown");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                }
            }
        });

        }

    }


