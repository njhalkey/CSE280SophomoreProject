package mathmagiciancom.mathmagician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstGrade extends AppCompatActivity implements View.OnClickListener {
Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_grade);
        btnHome=(Button)findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnHome){
            launchMainMenu();
        }
    }
    private void launchMainMenu(){
        startActivity(new Intent(this,MainMenu.class));
    }
}
