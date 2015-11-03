package mathmagiciancom.mathmagician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
public class Money extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnPenny1,btnPenny2,btnPenny3,btnPenny4,btnEndPenny1,btnEndPenny2,btnEndPenny3,btnEndPenny4;
    ImageButton btnNickel1,btnEndNickel1;
    ImageButton btnDime1,btnDime2,btnEndDime1,btnEndDime2;
    ImageButton btnQuarter1,btnQuarter2,btnQuarter3,btnEndQuarter1,btnEndQuarter2,btnEndQuarter3;
    ImageButton btnOneDollar1,btnOneDollar2,btnOneDollar3,btnOneDollar4,btnEndOneDollar1,btnEndOneDollar2,btnEndOneDollar3,btnEndOneDollar4;
    ImageButton btnFiveDollar,btnEndFiveDollar;
    Button btnFinish;
    Button btnHome;
    TextView txtQuestion;
    TextView txtDirections;
    TextView txtCorrect;
    double QuestionTarget;
    double Total=0.0;
    int questionCount=1;
    int questionCorrect=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        idAttach();
        listnerAttach();
        QuestionTarget=createQuestion();
    }
    private void listnerAttach(){
        btnPenny1.setOnClickListener(this);
        btnPenny2.setOnClickListener(this);
        btnPenny3.setOnClickListener(this);
        btnPenny4.setOnClickListener(this);
        btnEndPenny1.setOnClickListener(this);
        btnEndPenny2.setOnClickListener(this);
        btnEndPenny3.setOnClickListener(this);
        btnEndPenny4.setOnClickListener(this);
        btnNickel1.setOnClickListener(this);
        btnEndNickel1.setOnClickListener(this);
        btnDime1.setOnClickListener(this);
        btnDime2.setOnClickListener(this);
        btnEndDime1.setOnClickListener(this);
        btnEndDime2.setOnClickListener(this);
        btnQuarter1.setOnClickListener(this);
        btnQuarter2.setOnClickListener(this);
        btnQuarter3.setOnClickListener(this);
        btnEndQuarter1.setOnClickListener(this);
        btnEndQuarter2.setOnClickListener(this);
        btnEndQuarter3.setOnClickListener(this);
        btnOneDollar1.setOnClickListener(this);
        btnOneDollar2.setOnClickListener(this);
        btnOneDollar3.setOnClickListener(this);
        btnOneDollar4.setOnClickListener(this);
        btnEndOneDollar1.setOnClickListener(this);
        btnEndOneDollar2.setOnClickListener(this);
        btnEndOneDollar3.setOnClickListener(this);
        btnEndOneDollar4.setOnClickListener(this);
        btnFiveDollar.setOnClickListener(this);
        btnEndFiveDollar.setOnClickListener(this);
        btnFinish.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }

    private void idAttach(){
    btnFinish=(Button)findViewById(R.id.btnFinish);
    btnHome=(Button)findViewById(R.id.btnHome);
    txtQuestion=(TextView)findViewById(R.id.txtQuestion);
    txtCorrect=(TextView)findViewById(R.id.txtQuestionsCorrect);
    txtDirections=(TextView)findViewById(R.id.txtDirections);
    btnPenny1=(ImageButton)findViewById(R.id.btnOneCent1);
    btnPenny2=(ImageButton)findViewById(R.id.btnOneCent2);
    btnPenny3=(ImageButton)findViewById(R.id.btnOneCent3);
    btnPenny4=(ImageButton)findViewById(R.id.btnOneCent4);
    btnEndPenny1=(ImageButton)findViewById(R.id.btnEndOneCent1);
    btnEndPenny2=(ImageButton)findViewById(R.id.btnEndOneCent2);
    btnEndPenny3=(ImageButton)findViewById(R.id.btnEndOneCent3);
    btnEndPenny4=(ImageButton)findViewById(R.id.btnEndOneCent4);
    btnNickel1=(ImageButton)findViewById(R.id.btnNickel1);
    btnEndNickel1=(ImageButton)findViewById(R.id.btnEndNickel1);
    btnDime1=(ImageButton)findViewById(R.id.btnDime1);
    btnDime2=(ImageButton)findViewById(R.id.btnDime2);
    btnEndDime1=(ImageButton)findViewById(R.id.btnEndDime1);
    btnEndDime2=(ImageButton)findViewById(R.id.btnEndDime2);
    btnQuarter1=(ImageButton)findViewById(R.id.btnQuarter1);
    btnQuarter2=(ImageButton)findViewById(R.id.btnQuarter2);
    btnQuarter3=(ImageButton)findViewById(R.id.btnQuarter3);
    btnEndQuarter1=(ImageButton)findViewById(R.id.btnEndQuarter1);
    btnEndQuarter2=(ImageButton)findViewById(R.id.btnEndQuarter2);
    btnEndQuarter3=(ImageButton)findViewById(R.id.btnEndQuarter3);
    btnOneDollar1=(ImageButton)findViewById(R.id.btnOneDollar1);
    btnOneDollar2=(ImageButton)findViewById(R.id.btnOneDollar2);
    btnOneDollar3=(ImageButton)findViewById(R.id.btnOneDollar3);
    btnOneDollar4=(ImageButton)findViewById(R.id.btnOneDollar4);
    btnEndOneDollar1=(ImageButton)findViewById(R.id.btnEndOneDollar1);
    btnEndOneDollar2=(ImageButton)findViewById(R.id.btnEndOneDollar2);
    btnEndOneDollar3=(ImageButton)findViewById(R.id.btnEndOneDollar3);
    btnEndOneDollar4=(ImageButton)findViewById(R.id.btnEndOneDollar4);
    btnFiveDollar=(ImageButton)findViewById(R.id.btnFiveDollar);
    btnEndFiveDollar=(ImageButton)findViewById(R.id.btnEndFiveDollar);

}
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btnEndOneCent1:
            case R.id.btnOneCent1:
                if(btnPenny1.getVisibility()==v.VISIBLE) {
                    btnPenny1.setVisibility(v.INVISIBLE);
                    btnEndPenny1.setVisibility(v.VISIBLE);
                    Total += 0.01;
                }
                else{
                    btnEndPenny1.setVisibility(v.INVISIBLE);
                    btnPenny1.setVisibility(v.VISIBLE);
                    Total -= 0.01;

                }
                break;
            case R.id.btnEndOneCent2:
            case R.id.btnOneCent2:
                if(btnPenny2.getVisibility()==v.VISIBLE){
                    btnPenny2.setVisibility(v.INVISIBLE);
                    btnEndPenny2.setVisibility(v.VISIBLE);
                    Total += 0.01;

                }
                else{
                    btnEndPenny2.setVisibility(v.INVISIBLE);
                    btnPenny2.setVisibility(v.VISIBLE);
                    Total -= 0.01;

                }
                break;
            case R.id.btnEndOneCent3:
            case R.id.btnOneCent3:
                if(btnPenny3.getVisibility()==v.VISIBLE){
                    btnPenny3.setVisibility(v.INVISIBLE);
                    btnEndPenny3.setVisibility(v.VISIBLE);
                    Total += 0.01;

                }
                else{
                    btnEndPenny3.setVisibility(v.INVISIBLE);
                    btnPenny3.setVisibility(v.VISIBLE);
                    Total -= 0.01;

                }
                break;
            case R.id.btnEndOneCent4:
            case R.id.btnOneCent4:
                if(btnPenny4.getVisibility()==v.VISIBLE){
                    btnPenny4.setVisibility(v.INVISIBLE);
                    btnEndPenny4.setVisibility(v.VISIBLE);
                    Total += 0.01;


                }
                else{
                    btnEndPenny4.setVisibility(v.INVISIBLE);
                    btnPenny4.setVisibility(v.VISIBLE);
                    Total -= 0.01;

                }
                break;
            case R.id.btnEndNickel1:
            case R.id.btnNickel1:
                if(btnNickel1.getVisibility()==v.VISIBLE){
                    btnNickel1.setVisibility(v.INVISIBLE);
                    btnEndNickel1.setVisibility(v.VISIBLE);
                    Total += 0.05;

                }
                else{
                    btnEndNickel1.setVisibility(v.INVISIBLE);
                    btnNickel1.setVisibility(v.VISIBLE);
                    Total -= 0.05;

                }
                break;
            case R.id.btnEndDime1:
            case R.id.btnDime1:
                if(btnDime1.getVisibility()==v.VISIBLE){
                    btnDime1.setVisibility(v.INVISIBLE);
                    btnEndDime1.setVisibility(v.VISIBLE);
                    Total += 0.10;

                }
                else{
                    btnEndDime1.setVisibility(v.INVISIBLE);
                    btnDime1.setVisibility(v.VISIBLE);
                    Total -= 0.10;
                }
                break;
            case R.id.btnEndDime2:
            case R.id.btnDime2:
                if(btnDime2.getVisibility()==v.VISIBLE){
                    btnDime2.setVisibility(v.INVISIBLE);
                    btnEndDime2.setVisibility(v.VISIBLE);
                    Total += 0.10;
                }
                else{
                    btnEndDime2.setVisibility(v.INVISIBLE);
                    btnDime2.setVisibility(v.VISIBLE);
                    Total -= 0.10;
                }
                break;
            case R.id.btnEndQuarter1:
            case R.id.btnQuarter1:
                if(btnQuarter1.getVisibility()==v.VISIBLE){
                    btnQuarter1.setVisibility(v.INVISIBLE);
                    btnEndQuarter1.setVisibility(v.VISIBLE);
                    Total += 0.25;
                }
                else{
                    btnEndQuarter1.setVisibility(v.INVISIBLE);
                    btnQuarter1.setVisibility(v.VISIBLE);
                    Total -= 0.25;
                }
                break;
            case R.id.btnEndQuarter2:
            case R.id.btnQuarter2:
                if(btnQuarter2.getVisibility()==v.VISIBLE){
                    btnQuarter2.setVisibility(v.INVISIBLE);
                    btnEndQuarter2.setVisibility(v.VISIBLE);
                    Total += 0.25;
                }
                else{
                    btnEndQuarter2.setVisibility(v.INVISIBLE);
                    btnQuarter2.setVisibility(v.VISIBLE);
                    Total -= 0.25;
                }
                break;
            case R.id.btnEndQuarter3:
            case R.id.btnQuarter3:
                if(btnQuarter3.getVisibility()==v.VISIBLE){
                    btnQuarter3.setVisibility(v.INVISIBLE);
                    btnEndQuarter3.setVisibility(v.VISIBLE);
                    Total += 0.25;
                }
                else{
                    btnEndQuarter3.setVisibility(v.INVISIBLE);
                    btnQuarter3.setVisibility(v.VISIBLE);
                    Total -= 0.25;
                }
                break;
            case R.id.btnEndOneDollar1:
            case R.id.btnOneDollar1:
                if(btnOneDollar1.getVisibility()==v.VISIBLE){
                    btnOneDollar1.setVisibility(v.INVISIBLE);
                    btnEndOneDollar1.setVisibility(v.VISIBLE);
                    Total += 1.00;
                }
                else{
                    btnEndOneDollar1.setVisibility(v.INVISIBLE);
                    btnOneDollar1.setVisibility(v.VISIBLE);
                    Total -= 1.00;
                }
                break;
            case R.id.btnEndOneDollar2:
            case R.id.btnOneDollar2:
                if(btnOneDollar2.getVisibility()==v.VISIBLE){
                    btnOneDollar2.setVisibility(v.INVISIBLE);
                    btnEndOneDollar2.setVisibility(v.VISIBLE);
                    Total += 1.00;
                }
                else{
                    btnEndOneDollar2.setVisibility(v.INVISIBLE);
                    btnOneDollar2.setVisibility(v.VISIBLE);
                    Total -= 1.00;
                }
                break;
            case R.id.btnEndOneDollar3:
            case R.id.btnOneDollar3:
                if(btnOneDollar3.getVisibility()==v.VISIBLE){
                    btnOneDollar3.setVisibility(v.INVISIBLE);
                    btnEndOneDollar3.setVisibility(v.VISIBLE);
                    Total += 1.00;
                }
                else{
                    btnEndOneDollar3.setVisibility(v.INVISIBLE);
                    btnOneDollar3.setVisibility(v.VISIBLE);
                    Total -= 1.00;
                }
                break;
            case R.id.btnEndOneDollar4:
            case R.id.btnOneDollar4:
                if(btnOneDollar4.getVisibility()==v.VISIBLE){
                    btnOneDollar4.setVisibility(v.INVISIBLE);
                    btnEndOneDollar4.setVisibility(v.VISIBLE);
                    Total += 1.00;
                }
                else{
                    btnEndOneDollar4.setVisibility(v.INVISIBLE);
                    btnOneDollar4.setVisibility(v.VISIBLE);
                    Total -= 1.00;
                }
                break;
            case R.id.btnEndFiveDollar:
            case R.id.btnFiveDollar:
                if(btnFiveDollar.getVisibility()==v.VISIBLE){
                    btnFiveDollar.setVisibility(v.INVISIBLE);
                    btnEndFiveDollar.setVisibility(v.VISIBLE);
                    Total += 5.00;
                }
                else{
                    btnEndFiveDollar.setVisibility(v.INVISIBLE);
                    btnFiveDollar.setVisibility(v.VISIBLE);
                    Total -= 5.00;
                }
                break;

        }
        if(v.getId()==R.id.btnFinish){
            Total=Math.round(Total * 100.0) / 100.0;
            if (Total==QuestionTarget){
                Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show();
                questionCorrect++;
                Total=0.0;
                reset();
            }
            else{Toast.makeText(this, "Incorrect", Toast.LENGTH_LONG).show();
                Total=0.0;
                reset();
            }
            if(questionCount>=11){
                Finish();
                txtCorrect.setText("The total number of correct questions answered is: " + questionCorrect+".");
                txtDirections.setText("Press the Home Button to go back to the home menu.");
            }
            QuestionTarget=createQuestion();
        }
        if (v.getId()==R.id.btnHome){
            launchMainMenu();
        }
    }
    private void Finish(){
        btnPenny1.setVisibility(View.INVISIBLE);
        btnPenny2.setVisibility(View.INVISIBLE);
        btnPenny3.setVisibility(View.INVISIBLE);
        btnPenny4.setVisibility(View.INVISIBLE);
        btnEndPenny1.setVisibility(View.INVISIBLE);
        btnEndPenny2.setVisibility(View.INVISIBLE);
        btnEndPenny3.setVisibility(View.INVISIBLE);
        btnEndPenny4.setVisibility(View.INVISIBLE);
        btnNickel1.setVisibility(View.INVISIBLE);
        btnEndNickel1.setVisibility(View.INVISIBLE);
        btnDime1.setVisibility(View.INVISIBLE);
        btnDime2.setVisibility(View.INVISIBLE);
        btnEndDime1.setVisibility(View.INVISIBLE);
        btnEndDime2.setVisibility(View.INVISIBLE);
        btnQuarter1.setVisibility(View.INVISIBLE);
        btnQuarter2.setVisibility(View.INVISIBLE);
        btnQuarter3.setVisibility(View.INVISIBLE);
        btnEndQuarter1.setVisibility(View.INVISIBLE);
        btnEndQuarter2.setVisibility(View.INVISIBLE);
        btnEndQuarter3.setVisibility(View.INVISIBLE);
        btnOneDollar1.setVisibility(View.INVISIBLE);
        btnOneDollar2.setVisibility(View.INVISIBLE);
        btnOneDollar3.setVisibility(View.INVISIBLE);
        btnOneDollar4.setVisibility(View.INVISIBLE);
        btnEndOneDollar1.setVisibility(View.INVISIBLE);
        btnEndOneDollar2.setVisibility(View.INVISIBLE);
        btnEndOneDollar3.setVisibility(View.INVISIBLE);
        btnEndOneDollar4.setVisibility(View.INVISIBLE);
        btnFiveDollar.setVisibility(View.INVISIBLE);
        btnEndFiveDollar.setVisibility(View.INVISIBLE);
        btnFinish.setVisibility(View.INVISIBLE);
        txtQuestion.setVisibility(View.INVISIBLE);
        txtCorrect.setVisibility(View.VISIBLE);
        btnHome.setVisibility(View.VISIBLE);
    }
    private void reset(){
        btnPenny1.setVisibility(View.VISIBLE);
        btnPenny2.setVisibility(View.VISIBLE);
        btnPenny3.setVisibility(View.VISIBLE);
        btnPenny4.setVisibility(View.VISIBLE);
        btnEndPenny1.setVisibility(View.INVISIBLE);
        btnEndPenny2.setVisibility(View.INVISIBLE);
        btnEndPenny3.setVisibility(View.INVISIBLE);
        btnEndPenny4.setVisibility(View.INVISIBLE);
        btnNickel1.setVisibility(View.VISIBLE);
        btnEndNickel1.setVisibility(View.INVISIBLE);
        btnDime1.setVisibility(View.VISIBLE);
        btnDime2.setVisibility(View.VISIBLE);
        btnEndDime1.setVisibility(View.INVISIBLE);
        btnEndDime2.setVisibility(View.INVISIBLE);
        btnQuarter1.setVisibility(View.VISIBLE);
        btnQuarter2.setVisibility(View.VISIBLE);
        btnQuarter3.setVisibility(View.VISIBLE);
        btnEndQuarter1.setVisibility(View.INVISIBLE);
        btnEndQuarter2.setVisibility(View.INVISIBLE);
        btnEndQuarter3.setVisibility(View.INVISIBLE);
        btnOneDollar1.setVisibility(View.VISIBLE);
        btnOneDollar2.setVisibility(View.VISIBLE);
        btnOneDollar3.setVisibility(View.VISIBLE);
        btnOneDollar4.setVisibility(View.VISIBLE);
        btnEndOneDollar1.setVisibility(View.INVISIBLE);
        btnEndOneDollar2.setVisibility(View.INVISIBLE);
        btnEndOneDollar3.setVisibility(View.INVISIBLE);
        btnEndOneDollar4.setVisibility(View.INVISIBLE);
        btnFiveDollar.setVisibility(View.VISIBLE);
        btnEndFiveDollar.setVisibility(View.INVISIBLE);

    }
    private double createQuestion()
    {
        questionCount++;
        double question=0.00;
        String strDisplayQuestion;
        Random rand = new Random();
        question =0.01+(10-0.01)*rand.nextDouble();
        question=Math.round(question * 100.00) / 100.00;
        DecimalFormat decF=new DecimalFormat("#0.00");
        txtQuestion.setText("Please select $"+decF.format(question)+" from the left. press $ when you're done.");
        return question;
    }
    private void launchMainMenu(){
        startActivity(new Intent(this,MainMenu.class));
    }
}

