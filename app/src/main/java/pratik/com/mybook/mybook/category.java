package pratik.com.mybook.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class category extends AppCompatActivity {

    private ImageButton imageButton_about_me;
    private TextView textView_family;
    private Button button_friends;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        imageButton_about_me = (ImageButton) findViewById(R.id.imageButton_about_me);
        textView_family = (TextView) findViewById(R.id.textView_family);
        button_friends = (Button) findViewById(R.id.button_friends);
        // About me click listener
        imageButton_about_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // call mySelf activity by explicit intent
                Intent intent = new Intent(category.this, mySelf.class);
                startActivity(intent);
            }
        });

        // Friends click listener
        button_friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // call AllFriends activity by explicit intent
                Intent intent = new Intent(category.this, AllFriends.class);
                startActivity(intent);
            }
        });

        // Family click listener
        textView_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // call AllFriends activity by explicit intent
                Intent intent = new Intent(category.this, AllFamily.class);
                startActivity(intent);
            }
        });
    }
}
