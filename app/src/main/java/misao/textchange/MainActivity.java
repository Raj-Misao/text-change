package misao.textchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textChange(View v)
    {
        tv_hello = (TextView)findViewById(R.id.tv_hello);

        tv_hello.setText("Welcome in Misao!!!!!!");
    }
}
