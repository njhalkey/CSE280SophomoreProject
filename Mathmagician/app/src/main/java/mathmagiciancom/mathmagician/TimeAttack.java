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

public class TimeAttack extends AppCompatActivity implements View.OnClickListener,SensorEventListener {
Button btnHome;
    SensorManager mSensorManager;
    Sensor mSensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);
        mSensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mSensor=mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        btnHome=(Button)findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnHome){
            launchMainMenu();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    private void launchMainMenu(){
        startActivity(new Intent(this,MainMenu.class));
    }
}
