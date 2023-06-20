package jp.suntech.s22037.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);

        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClea = findViewById(R.id.btClea);
        btClea.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etHouse);
            EditText inputl = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            if(id==R.id.btClick){
                String inputStr = input.getText().toString();
                String inputStrl = input.getText().toString();
                output.setText(inputStr + "にお住まいの" + inputStrl + "さん、こんにちは！");
            }
            else if(id==R.id.btClea){
                input.setText("");
                output.setText("");
            }
            else{
                inputl.setText("");
                output.setText("");
            }

        }
    }
}