package kidlocaliza.beacon.thelastmonkey.com.pruebagithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnHola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHola = (Button)findViewById(R.id.btnHola);


        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Funciona el boton");
                Toast.makeText(getApplicationContext(),"Hola saludos",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
