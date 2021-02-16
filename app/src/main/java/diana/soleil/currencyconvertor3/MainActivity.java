package diana.soleil.currencyconvertor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void converter (View view) {
        EditText editText = (EditText) findViewById(R.id.editText);

        String text = editText.getText().toString();
        double textChanged = Double.parseDouble(text);
        double converterPrice = textChanged * 1.27;

        Toast.makeText(this, "$" + Double.toString(textChanged) +" is "+"$"+Double.toString(converterPrice), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}