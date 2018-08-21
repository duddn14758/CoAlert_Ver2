package coalert_front.user.coalert_ver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cosmetic_review extends AppCompatActivity {
    private String name;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cosmetic_review);
        receiveIntentData();

        Button btn1=(Button)findViewById(R.id.btn1);
        TextView tv1=(TextView)findViewById(R.id.c_name);
        tv1.setText(name);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(cosmetic_review.this,product_list.class);
                startActivity(intent);
            }

        });

    }

    public void receiveIntentData() {
        Intent intent = getIntent();
        name=intent.getStringExtra("name");
    }
}
