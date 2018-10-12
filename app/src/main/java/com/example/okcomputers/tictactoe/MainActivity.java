package com.example.okcomputers.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int Player_1=0 ;
    private  int player_2 = 0;
    boolean player1_win = false;
    boolean player2_win = false;
    boolean player1_turn = true;
    boolean player2_turn = false;
    private TextView textView= (TextView)findViewById(R.id.player2_score);
    private  TextView textView1 = (TextView)findViewById(R.id.player_1_score);
    private Button button1 = (Button)findViewById(R.id.Button_1);
    private Button button2 = (Button)findViewById(R.id.Button_2);
    private Button button3 = (Button)findViewById(R.id.Button_3);
    private Button button4 = (Button)findViewById(R.id.Button_4);
    private Button button5 = (Button)findViewById(R.id.Button_5);
    private Button button6 = (Button)findViewById(R.id.Button_6);
    private Button button7 = (Button)findViewById(R.id.Button_7);
    private Button button8 = (Button)findViewById(R.id.Button_8);
    private Button button9 = (Button)findViewById(R.id.Button_9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Players_Turn(View view) {
        if (player1_turn) {
            /*player1_turn = button1.isClickable();
            player1_turn = button2.isClickable();
            player1_turn = button3.isClickable();
            player1_turn = button4.isClickable();
            player1_turn = button5.isClickable();
            player1_turn = button6.isClickable();
            player1_turn = button7.isClickable();
            player1_turn = button8.isClickable();
            player1_turn = button9.isClickable();*/
            if (button1.isPressed()) {
                button1.setText("X");
                player1_turn = false;
            } else if (button2.isPressed()) {
                button2.setText("X");
                player1_turn = false;
            } else if (button3.isPressed()) {
                button3.setText("X");
                player1_turn = false;
            } else if (button4.isPressed()) {
                button4.setText("X");
                player1_turn = false;
            } else if (button5.isPressed()) {
                button5.setText("X");
                player1_turn = false;
            } else if (button6.isPressed()) {
                button6.setText("X");
                player1_turn = false;
            } else if (button7.isPressed()) {
                button7.setText("X");
                player1_turn = false;
            } else if (button8.isPressed()) {
                button8.setText("X");
                player1_turn = false;
            } else if (button9.isPressed()) {
                button9.setText("X");
                player1_turn = false;
            }
        } else {
            player1_turn = false;
        }

        if (player2_turn) {
           /* player2_turn = button1.isClickable();
            player2_turn = button2.isClickable();
            player2_turn = button3.isClickable();
            player2_turn = button4.isClickable();
            player2_turn = button5.isClickable();
            player2_turn = button6.isClickable();
            player2_turn = button7.isClickable();
            player2_turn = button8.isClickable();
            player2_turn = button9.isClickable();*/
            if (button1.isPressed()) {
                button1.setText("O");
                player2_turn = false;
            } else if (button2.isPressed()) {
                button2.setText("O");
                player2_turn = false;
            } else if (button3.isPressed()) {
                button3.setText("O");
                player2_turn = false;
            } else if (button4.isPressed()) {
                button4.setText("O");
                player2_turn = false;
            } else if (button5.isPressed()) {
                button5.setText("O");
                player2_turn = false;
            } else if (button6.isPressed()) {
                button6.setText("O");
                player2_turn = false;
            } else if (button7.isPressed()) {
                button7.setText("O");
                player2_turn = false;
            } else if (button8.isPressed()) {
                button8.setText("O");
                player2_turn = false;
            } else if (button9.isPressed()) {
                button9.setText("O");
                player2_turn = false;
            }
        } else {
            player2_turn = false;
        }
        if (player1_win) {
            textView1.setText(Player_1++);
            Boardgame();
        } else if (player2_win) {
            textView.setText(player_2++);
            Boardgame();
        } else {
           Boardgame();
            Player_1 = 0;
            player_2 = 0;
        }
    }

    private void Boardgame()
    {
        if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() =="X")
        {
            player1_win = true;
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_SHORT).show();
        }
        else if(button1.getText() == "X" && button4.getText() == "X" && button7.getText() =="X")
        {
            player1_win = true;
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_SHORT).show();
        }
        else if(button1.getText() == "X" && button5.getText() == "X" && button9.getText() =="X")
        {
            player1_win = true;
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_SHORT).show();
        }
        else  if(button2.getText() == "X" && button5.getText() == "X" && button8.getText() =="X")
        {
            player1_win = true;
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_SHORT).show();
        }
        else if(button3.getText() == "X" && button6.getText() == "X" && button9.getText() =="X")
        {
            player1_win = true;
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_SHORT).show();

        }
        else if(button3.getText() == "X" && button5.getText() == "X" && button7.getText() =="X")
        {
            player1_win = true;
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_SHORT).show();
        }
        else    if(button1.getText() == "O" && button2.getText() == "O" && button3.getText() =="O")
        {
            player2_win = true;
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_SHORT).show();
        }
        else if(button1.getText() == "O" && button4.getText() == "O" && button7.getText() =="O")
        {
            player2_win = true;
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_SHORT).show();
        }
        else if(button1.getText() == "O" && button5.getText() == "O" && button9.getText() =="O")
        {
            player2_win = true;
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_SHORT).show();
        }
        else  if(button2.getText() == "O" && button5.getText() == "O" && button8.getText() =="O")
        {
            player2_win = true;
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_SHORT).show();
        }
        else if(button3.getText() == "O" && button6.getText() == "O" && button9.getText() =="O")
        {
            player2_win = true;
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_SHORT).show();

        }
        else if(button3.getText() == "O" && button5.getText() == "O" && button7.getText() =="O")
        {
            player2_win = true;
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Match Draw",Toast.LENGTH_SHORT).show();
        }
    }
}
