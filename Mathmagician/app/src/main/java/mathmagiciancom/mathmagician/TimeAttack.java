package mathmagiciancom.mathmagician;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeAttack extends AppCompatActivity implements View.OnClickListener{
Button btnHome;
    SensorManager mSensorManager;
    Sensor mSensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);
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
