package com.bva.anhbui.puzzlegame;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button5, button1, button2, button3, button4, button6, button7, button8, button9, buttonNext;
    TextView textViewScore;
    ArrayList[] listsNumber;
    private int count = 0;
    private int score = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();
        listsNumber = new ArrayList[50];
        for (int i = 0; i < 50; i++) {
            listsNumber[i] = new ArrayList();
        }
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().equals("")) {
                    button2.setText(button1.getText());
                    button1.setText("");
                    button1.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button2.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button4.getText().equals("")) {
                    button4.setText(button1.getText());
                    button1.setText("");
                    button1.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button4.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().equals("")) {
                    button1.setText(button2.getText());
                    button2.setText("");
                    button2.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button1.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button5.getText().equals("")) {
                    button5.setText(button2.getText());
                    button2.setText("");
                    button2.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button5.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button3.getText().equals("")) {
                    button3.setText(button2.getText());
                    button2.setText("");
                    button2.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button3.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().equals("")) {
                    button2.setText(button3.getText());
                    button3.setText("");
                    button3.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button2.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button6.getText().equals("")) {
                    button6.setText(button3.getText());
                    button3.setText("");
                    button3.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button6.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().equals("")) {
                    button1.setText(button4.getText());
                    button4.setText("");
                    button4.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button1.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button5.getText().equals("")) {
                    button5.setText(button4.getText());
                    button4.setText("");
                    button4.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button5.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button7.getText().equals("")) {
                    button7.setText(button4.getText());
                    button4.setText("");
                    button4.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button7.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().equals("")) {
                    button2.setText(button5.getText());
                    button5.setText("");
                    button5.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button2.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button4.getText().equals("")) {
                    button4.setText(button5.getText());
                    button5.setText("");
                    button5.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button4.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button6.getText().equals("")) {
                    button6.setText(button5.getText());
                    button5.setText("");
                    button5.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button6.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button8.getText().equals("")) {
                    button8.setText(button5.getText());
                    button5.setText("");
                    button5.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button8.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button9.getText().equals("")) {
                    button9.setText(button6.getText());
                    button6.setText("");
                    button6.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button9.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button5.getText().equals("")) {
                    button5.setText(button6.getText());
                    button6.setText("");
                    button6.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button5.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button3.getText().equals("")) {
                    button3.setText(button6.getText());
                    button6.setText("");
                    button6.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button3.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button8.getText().equals("")) {
                    button8.setText(button7.getText());
                    button7.setText("");
                    button7.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button8.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button4.getText().equals("")) {
                    button4.setText(button7.getText());
                    button7.setText("");
                    button7.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button4.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button9.getText().equals("")) {
                    button9.setText(button8.getText());
                    button8.setText("");
                    button8.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button9.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button5.getText().equals("")) {
                    button5.setText(button8.getText());
                    button8.setText("");
                    button8.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button5.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button7.getText().equals("")) {
                    button7.setText(button8.getText());
                    button8.setText("");
                    button8.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button7.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button6.getText().equals("")) {
                    button6.setText(button9.getText());
                    button9.setText("");
                    button9.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button6.setBackgroundResource(R.drawable.custom_button);
                    win();
                } else if (button8.getText().equals("")) {
                    button8.setText(button9.getText());
                    button9.setText("");
                    button9.setBackground(Drawable.createFromPath("#7f7f7f"));
                    button8.setBackgroundResource(R.drawable.custom_button);
                    win();
                }
                if (count < 50)
                    addList(listsNumber[count++]);
            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 10) {
                    Toast.makeText(MainActivity.this, "Chơi thắng ván này đi đã thằng ngu!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Random random = new Random();
                int i = random.nextInt(count);
                button1.setText(listsNumber[i].get(0).toString());
                button2.setText(listsNumber[i].get(1).toString());
                button3.setText(listsNumber[i].get(2).toString());
                button4.setText(listsNumber[i].get(3).toString());
                button5.setText(listsNumber[i].get(4).toString());
                button6.setText(listsNumber[i].get(5).toString());
                button7.setText(listsNumber[i].get(6).toString());
                button8.setText(listsNumber[i].get(7).toString());
                button9.setText(listsNumber[i].get(8).toString());
                formatButton(button1);
                formatButton(button2);
                formatButton(button3);
                formatButton(button4);
                formatButton(button5);
                formatButton(button6);
                formatButton(button7);
                formatButton(button8);
                formatButton(button9);
            }
        });
    }

    private void subScore() {
        score -= 1;
        textViewScore.setText("Score: " + score);
    }

    private void addScore() {
        score += 20;
        textViewScore.setText("Score: " + score);
    }

    private void formatButton(Button b) {
        if (b.getText().equals("")) {
            b.setBackground(Drawable.createFromPath("#7f7f7f"));
        } else {
            b.setBackgroundResource(R.drawable.custom_button);
        }
    }

    private void win() {
        if (button1.getText().equals("1") && button2.getText().equals("2") && button3.getText().equals("3") &&
                button4.getText().equals("4") && button5.getText().equals("5") && button6.getText().equals("6") &&
                button7.getText().equals("7") && button8.getText().equals("8") && button9.getText().equals("")) {
            Toast.makeText(MainActivity.this, "You won!!!", Toast.LENGTH_SHORT).show();
            addScore();
        } else {
            subScore();
        }
    }

    private void addList(ArrayList<String> list) {
        list.add((String) button1.getText());
        list.add((String) button2.getText());
        list.add((String) button3.getText());
        list.add((String) button4.getText());
        list.add((String) button5.getText());
        list.add((String) button6.getText());
        list.add((String) button7.getText());
        list.add((String) button8.getText());
        list.add((String) button9.getText());
    }

    private void Mapping() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonNext = findViewById(R.id.buttonNext);
        textViewScore = findViewById(R.id.score);
    }
}
