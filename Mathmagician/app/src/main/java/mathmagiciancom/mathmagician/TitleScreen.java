package mathmagiciancom.mathmagician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TitleScreen extends AppCompatActivity implements View.OnClickListener {
Button btnGetStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
        btnGetStarted = (Button)findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        launchMainMenu();
    }
    private void launchMainMenu(){
        startActivity(new Intent(this,MainMenu.class));
    }
}
