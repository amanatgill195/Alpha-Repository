package com.example.amanat.tictactoe;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    private TextView result;
    private int turn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);

        block1.setOnClickListener(this);
        block2.setOnClickListener(this);
        block3.setOnClickListener(this);
        block4.setOnClickListener(this);
        block5.setOnClickListener(this);
        block6.setOnClickListener(this);
        block7.setOnClickListener(this);
        block8.setOnClickListener(this);
        block9.setOnClickListener(this);


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Are you sure you want to reset?");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                block1.setText("");
                                block2.setText("");
                                block3.setText("");
                                block4.setText("");
                                block5.setText("");
                                block6.setText("");
                                block7.setText("");
                                block8.setText("");
                                block9.setText("");
                                result.setText("");
                                dialog.cancel();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }

    public void restart() {
        block1.setText("");
        block2.setText("");
        block3.setText("");
        block4.setText("");
        block5.setText("");
        block6.setText("");
        block7.setText("");
        block8.setText("");
        block9.setText("");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_block1:

                if (block1.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block1.setText("O");
                        result();

                    } else {

                        turn = 0;
                        block1.setText("X");
                        result();
                    }

                }
                break;

            case R.id.bt_block2:

                if (block2.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block2.setText("O");
                        result();

                    } else {
                        turn = 0;
                        block2.setText("X");
                        result();
                    }
                }
                break;

            case R.id.bt_block3:

                if (block3.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block3.setText("O");
                        result();

                    } else {
                        turn = 0;
                        block3.setText("X");
                        result();
                    }
                }
                break;

            case R.id.bt_block4:

                if (block4.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block4.setText("O");
                        result();

                    } else {
                        turn = 0;
                        block4.setText("X");
                        result();
                    }
                }
                break;


            case R.id.bt_block5:

                if (block5.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block5.setText("O");
                        result();

                    } else {
                        turn = 0;
                        block5.setText("X");
                        result();
                    }
                }
                break;

            case R.id.bt_block6:

                if (block6.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block6.setText("O");
                        result();

                    } else {
                        turn = 0;
                        block6.setText("X");
                        result();
                    }
                }

                break;

            case R.id.bt_block7:

                if (block7.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block7.setText("O");
                        result();


                    } else {
                        turn = 0;
                        block7.setText("X");
                        result();
                    }

                }


                break;

            case R.id.bt_block8:

                if (block8.getText().toString().equals("")) {

                    if (turn == 0) {
                        turn = 1;
                        block8.setText("O");
                        result();

                    } else {
                        turn = 0;
                        block8.setText("X");
                        result();
                    }

                }


                break;

            case R.id.bt_block9:

                if (block9.getText().toString().equals("")) {

                    if (turn == 0) {

                        turn = 1;
                        block9.setText("O");
                        result();

                    } else {

                        turn = 0;
                        block9.setText("X");
                        result();

                    }
                }
        }
    }

    public void result() {

        if (block1.getText().toString().equals("X") && block2.getText().toString().equals("X") && block3.getText().toString().equals("X")) {

            result.setText("Player X Wins!");
            restart();

        } else if (block4.getText().toString().equals("X") && block5.getText().toString().equals("X") && block6.getText().toString().equals("X")) {

            result.setText("Player X Wins!");

            restart();

        } else if (block7.getText().toString().equals("X") && block8.getText().toString().equals("X") && block9.getText().toString().equals("X")) {

            result.setText("Player X Wins!");
            restart();

        } else if (block1.getText().toString().equals("O") && block2.getText().toString().equals("O") && block3.getText().toString().equals("O")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block4.getText().toString().equals("O") && block5.getText().toString().equals("O") && block6.getText().toString().equals("O")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block7.getText().toString().equals("O") && block8.getText().toString().equals("O") && block9.getText().toString().equals("O")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block1.getText().toString().equals("X") && block4.getText().toString().equals("X") && block7.getText().toString().equals("X")) {

            result.setText("Player X Wins!");

            restart();

        } else if (block2.getText().toString().equals("X") && block5.getText().toString().equals("X") && block8.getText().toString().equals("X")) {

            result.setText("Player X Wins!");

            restart();

        } else if (block3.getText().toString().equals("X") && block6.getText().toString().equals("X") && block9.getText().toString().equals("X")) {

            result.setText("Player X Wins!");

            restart();

        } else if (block1.getText().toString().equals("O") && block4.getText().toString().equals("O") && block7.getText().toString().equals("O")) {

            result.setText("Player O Wins!");
            ;
            restart();

        } else if (block2.getText().toString().equals("O") && block5.getText().toString().equals("O") && block8.getText().toString().equals("O")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block3.getText().toString().equals("O") && block6.getText().toString().equals("O") && block9.getText().toString().equals("O")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block1.getText().toString().equals("X") && block5.getText().toString().equals("X") && block9.getText().toString().equals("X")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block3.getText().toString().equals("X") && block5.getText().toString().equals("X") && block7.getText().toString().equals("X")) {

            result.setText("Player O Wins!");

            restart();

        } else if (block1.getText().toString().equals("O") && block5.getText().toString().equals("O") && block9.getText().toString().equals("O")) {

            result.setText("Player O Wins!");
            restart();

        } else if (block3.getText().toString().equals("O") && block5.getText().toString().equals("O") && block7.getText().toString().equals("O")) {

            result.setText("Player O Wins!");

            restart();

        } else if ((block1.getText().toString().equals("O") || block1.getText().toString().equals("X")) && (block2.getText().toString().equals("O") || block2.getText().toString().equals("X")) && (block3.getText().toString().equals("O") || block3.getText().toString().equals("X")) && (block4.getText().toString().equals("O") || block4.getText().toString().equals("X")) && (block5.getText().toString().equals("O") || block5.getText().toString().equals("X")) && (block6.getText().toString().equals("O") || block6.getText().toString().equals("X")) && (block7.getText().toString().equals("O") || block7.getText().toString().equals("X")) && (block8.getText().toString().equals("O") || block8.getText().toString().equals("X")) && (block9.getText().toString().equals("O") || block9.getText().toString().equals("X"))) {
            result.setText("It's a tie!");
        }

    }
}
