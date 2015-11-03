package mathmagiciancom.mathmagician;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Random;

public class Patterns extends AppCompatActivity {


    private TextView ans1, ans2, ans3, ans4, seq, txtRight, txtWrong;
    private Button exit;
    private TextView[] ans;
    private int question_num, right_num, answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patterns);

        question_num = 0;

        //creates a random array of zeros of length 9
        int[] randArray = new int[9];
        //creates random variables to generate the sequence
        Random r = new Random();
        int randint1 = r.nextInt(10);

        Random q = new Random();
        int randint2 = q.nextInt(8);
        //fills the empty array, randArray, with the sequence
        for(int i=0 ;i < randArray.length; i++) {
            if (randint2 == 0 || randint2 == 1){
                randint2 = 1;
            }
            randArray[i] = randint1 += randint2;
        }
        //prints the sequence to the label
        seq = (TextView) findViewById(R.id.lblSeq);
        seq.setText(Arrays.toString(randArray));
        //assigns variables to the labels on the app
        ans1 = (TextView) findViewById(R.id.lblAns1);
        ans2 = (TextView) findViewById(R.id.lblAns2);
        ans3 = (TextView) findViewById(R.id.lblAns3);
        ans4 = (TextView) findViewById(R.id.lblAns4);
        txtRight = (TextView) findViewById(R.id.lblRight);
        txtWrong = (TextView) findViewById(R.id.lblWrong);
        exit = (Button) findViewById(R.id.btnExit);
        TextView ansBox = (TextView)findViewById(R.id.lblAns);

        exit.setVisibility(View.INVISIBLE);

        right_num = randArray[randArray.length - 1] + randint2;

        ans1.setText(Integer.toString(right_num + 1));
        ans2.setText(Integer.toString(right_num + 2));
        ans3.setText(Integer.toString(right_num + -1));
        ans4.setText(Integer.toString(right_num + -2));

        ans = new TextView[4];
        ans[0] = ans1;
        ans[1] = ans2;
        ans[2] = ans3;
        ans[3] = ans4;
        //throws the right answer into a slot in the array
        answers = (int) (Math.random()*4);
        ans[answers].setText(Integer.toString(right_num));

        //sets touch listeners on every label
        ans1.setOnTouchListener(new ChoiceTouchListener());
        ans2.setOnTouchListener(new ChoiceTouchListener());
        ans3.setOnTouchListener(new ChoiceTouchListener());
        ans4.setOnTouchListener(new ChoiceTouchListener());
        ansBox.setOnDragListener(new ChoiceDragListener());

    }
    //touch listener class
    private final class ChoiceTouchListener implements View.OnTouchListener{
        public boolean onTouch(View view, MotionEvent motionEvent){
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data,shadowBuilder,view, 0);
                return true;
            }
            else{
                return false;
            }
        }
    }
    //drag listener class
    private class ChoiceDragListener implements View.OnDragListener{
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                //sets what to do in case of a drop
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    view.setVisibility(View.INVISIBLE);
                    //assigns the answer box and ans* to dropTarget and dropped respectively.
                    TextView dropTarget = (TextView) v;
                    TextView dropped = (TextView) view;
                    //********************************************
                    dropTarget.setTypeface(Typeface.DEFAULT_BOLD);
                    Object tag = dropTarget.getTag();
                    if (tag != null) {
                        int existingID = (Integer) tag;
                        findViewById(existingID).setVisibility(View.VISIBLE);
                    }
                    dropTarget.setTag(dropped.getId());
                    dropTarget.setText(dropped.getText());
                    //displays a label if the answer is right.

                    if (dropped.getText() != ans[answers].getText()) {
                        txtWrong.setVisibility(View.VISIBLE);
                        txtWrong.setText("Try counting how far the numbers are from each other.");
                        txtRight.setVisibility(View.INVISIBLE);
                        //displays a label if the answer is wrong.
                    } else {
                        view.setVisibility(View.VISIBLE);
                        txtRight.setVisibility(View.VISIBLE);
                        txtRight.setText("Great Job! You did it!");
                        txtWrong.setVisibility(View.INVISIBLE);
                        //creates a random array of zeros of length 9
                        int[] randArray = new int[9];
                        //creates random variables to generate the sequence
                        Random r = new Random();
                        int randint1 = r.nextInt(10);

                        Random q = new Random();
                        int randint2 = q.nextInt(5);
                        //fills the empty array, randArray, with the sequence
                        for(int i=0 ;i < randArray.length; i++) {
                            if (randint2 == 0){
                                randint2 = 1;
                            }
                            randArray[i] = randint1 += randint2;
                        }

                        seq.setText(Arrays.toString(randArray));

                        right_num = randArray[randArray.length - 1] + randint2;

                        ans1.setText(Integer.toString(right_num + 1));
                        ans2.setText(Integer.toString(right_num + 2));
                        ans3.setText(Integer.toString(right_num + -1));
                        ans4.setText(Integer.toString(right_num + -2));

                        ans = new TextView[4];
                        ans[0]= ans1;
                        ans[1] = ans2;
                        ans[2] = ans3;
                        ans[3] = ans4;
                        //throws the right answer into a slot in the array
                        answers = (int) (Math.random()*4);
                        ans[answers].setText(Integer.toString(right_num));

                        question_num += 1;

                        if(question_num == 10){
                            ans1.setVisibility(View.INVISIBLE);
                            ans2.setVisibility(View.INVISIBLE);
                            ans3.setVisibility(View.INVISIBLE);
                            ans4.setVisibility(View.INVISIBLE);

                            exit.setOnClickListener(new Button.OnClickListener(){
                                public void onClick(View v){
                                    if (v.getId() == R.id.btnExit){
                                        launchMainMenu();
                                    }
                                }
                            });

                            exit.setVisibility(View.VISIBLE);
                            txtRight.setText("All Done.");

                        }
                    }
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private void launchMainMenu() {
        startActivity(new Intent(this, MainMenu.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_patterns, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}