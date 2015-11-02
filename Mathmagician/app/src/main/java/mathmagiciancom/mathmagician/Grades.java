package mathmagiciancom.mathmagician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Grades extends AppCompatActivity implements View.OnClickListener {
    Button btnHome;
    Button btn1st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);
        btnHome=(Button)findViewById(R.id.btnHome);
        btn1st=(Button)findViewById(R.id.btn1st);
        btnHome.setOnClickListener(this);
        btn1st.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnHome){
        launchMainMenu();
        }
        if(v.getId()==R.id.btn1st){
            launchFirstGrade();
        }
    }
    private void launchMainMenu(){
        startActivity(new Intent(this,MainMenu.class));
    }
    private void launchFirstGrade(){
        startActivity(new Intent(this,FirstGrade.class));
    }
}
