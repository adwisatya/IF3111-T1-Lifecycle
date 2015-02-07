package adwisaty4.intentexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultActicity.class);
                i.putExtra("Value1", "This value one for ActivityTwo ");
                i.putExtra("Value2", "This value two ActivityTwo");
                // set the request code to any code you like,
                // you can identify the callback via this code
                startActivityForResult(i,1232);
                }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 1232) {
            if (data.hasExtra("returnKey1")) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(data.getExtras().getString("returnKey1"));
            }
        }
    }
}
