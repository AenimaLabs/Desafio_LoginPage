package cl.aenimalabs.desafio_1_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = getString(R.string.url);
        ImageView image1 = findViewById(R.id.image1);
        Picasso.get().load(url).into(image1);
        final Context context = getApplicationContext();
        final Button boton = findViewById(R.id.button2);

        boton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        EditText user = findViewById(R.id.usuario);
                        String usertexto = user.getText().toString();
                        EditText pass = findViewById(R.id.Password);
                        String passtexto = pass.getText().toString();

                        if (!passtexto.isEmpty() && !usertexto.isEmpty()) {
                            Toast toast = Toast.makeText(context, getString(R.string.aprobado), Toast.LENGTH_SHORT);
                            toast.show();
                        } else {
                            Toast toast = Toast.makeText(context, getString(R.string.fallo), Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }

                }
        );


    }
}



