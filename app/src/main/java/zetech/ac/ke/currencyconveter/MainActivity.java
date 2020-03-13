package zetech.ac.ke.currencyconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText txtUSDollars;
    EditText txtEuros;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUSDollars = (EditText)findViewById(R.id.txtUSDollars);
        txtEuros = (EditText)findViewById(R.id.txtEuros);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEuros.setText("");
                txtUSDollars.setText("");
            }
        });
    }
}
