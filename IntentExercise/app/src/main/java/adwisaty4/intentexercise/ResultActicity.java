package adwisaty4.intentexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActicity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_acticity);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
                Intent i = new Intent(ResultActicity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void finish() {
        // Prepare data intent
        Intent data = new Intent();
        data.putExtra("returnKey1", "Swinging on a star. ");
        data.putExtra("returnKey2", "You could be better then you are. ");
        // Activity finished ok, return the data
        setResult(RESULT_OK, data);
        super.finish();
    }
}