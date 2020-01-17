package tatastrive.application.dayzerozero1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b, b1,b2,b3;
    EditText t1, t2;
    String s, ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t1 = findViewById( R.id.editText );
        t2 = findViewById( R.id.editText1 );
        b = findViewById( R.id.button2 );
        b1 = findViewById( R.id.button3 );
        b2 = findViewById( R.id.button4 );
        b3= findViewById( R.id.button5 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = t1.getText().toString().trim();
                ss = t2.getText().toString().trim();
                int i = Integer.parseInt( s ) + Integer.parseInt( ss );

                Toast.makeText( MainActivity.this, "answer is:" + i, Toast.LENGTH_SHORT ).show();


            }

        } );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = t1.getText().toString().trim();
                ss = t2.getText().toString().trim();
                int j = Integer.parseInt( s ) - Integer.parseInt( ss );
                Toast.makeText( MainActivity.this, "answer is:" + j, Toast.LENGTH_SHORT ).show();


            }

        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = t1.getText().toString().trim();
                ss = t2.getText().toString().trim();
                int j = Integer.parseInt( s ) * Integer.parseInt( ss );
                Toast.makeText( MainActivity.this, "answer is:" + j, Toast.LENGTH_SHORT ).show();


            }

        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = t1.getText().toString().trim();
                ss = t2.getText().toString().trim();
                int a = Integer.parseInt( s );
                int b= Integer.parseInt( ss );
                int j =b/a;
                Toast.makeText( MainActivity.this, "answer is : " + j, Toast.LENGTH_SHORT ).show();


            }

        } );
    }
}




