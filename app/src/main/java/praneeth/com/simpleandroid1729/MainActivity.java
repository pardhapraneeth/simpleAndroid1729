package praneeth.com.simpleandroid1729;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    EditText mEditText;

    TextView mTextView1;
    EditText mEditText1;

    TextView result1;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.textView);
        mTextView1 = (TextView)findViewById(R.id.textView2);
        result1 =(TextView)findViewById(R.id.result);
        mEditText=(EditText)findViewById(R.id.editText);
        mEditText1=(EditText)findViewById(R.id.editText2);
        button1=(Button)findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(mEditText.getText().toString());
                double b = Double.parseDouble(mEditText1.getText().toString());

                 double res = a+b;
                result1.setText(Double.toString((double) res));
            }
        });



    }
}
