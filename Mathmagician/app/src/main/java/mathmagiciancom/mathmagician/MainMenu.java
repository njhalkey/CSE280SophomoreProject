package mathmagiciancom.mathmagician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{
    Button btnGrades;
    Button btnTimeAttack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btnGrades=(Button)findViewById(R.id.btnGrades);
        btnTimeAttack=(Button)findViewById(R.id.btntimeAttack);
        btnGrades.setOnClickListener(this);
       btnTimeAttack.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnGrades){
            launchGrades();
        }
        else if (v.getId()==R.id.btntimeAttack){
            launchTimeAttack();
        }


    }
    private void launchGrades(){

        startActivity(new Intent(this, Grades.class));
    }

    private void launchTimeAttack(){
        startActivity(new Intent(this, TimeAttack.class));
    }


}

