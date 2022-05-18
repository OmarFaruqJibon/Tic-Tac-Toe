package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, newGm;
String b1, b2, b3, b4, b5, b6, b7, b8, b9;
int flag = 0;
int count = 0;
TextView textview, winner, gmOvr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        textview = (TextView) findViewById(R.id.turn);
        winner = (TextView) findViewById(R.id.winner);
        gmOvr = (TextView) findViewById(R.id.gmOvr);
        newGm = findViewById(R.id.newGame);


        textview.setText("Your turn ( X )");

        newGm.setVisibility(View.INVISIBLE);

        newGm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newGame();
                newGm.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void Check(View v) {
        Button btnCurrent = (Button) v;
        count++;
        textview = (TextView) findViewById(R.id.turn);
        textview.setText("Your turn ( X )");

        if (btnCurrent.getText().toString().equals("")) {

            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
                textview.setText("Your turn ( O )");
            } else {
                btnCurrent.setText("0");
                flag = 0;
                textview.setText("Your turn ( X )");
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                //Conditions

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1st row
                    winner.setText("Winner is "+b1);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    //2st row
                    winner.setText("Winner is "+b4);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    //3st row
                    winner.setText("Winner is "+b7);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    //1st collum
                    winner.setText("Winner is "+b1);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    //2st collum
                    winner.setText("Winner is "+b2);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //3st collum
                    winner.setText("Winner is "+b3);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //left corner
                    winner.setText("Winner is "+b1);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //right corner
                    winner.setText("Winner is "+b3);
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                } else if(!b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("")
                        && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")){
                    //game draw
                    winner.setText("Game is draw");
                    gmOvr.setText("Game Over");
                    newGm.setVisibility(View.VISIBLE);

                }

            }
        }

    }

    public void newGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
        textview.setText("Your turn ( X )");
        winner.setText("");
        gmOvr.setText("");
    }


}