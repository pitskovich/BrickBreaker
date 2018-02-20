package com.example.peteritsko.brickbreaker;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends ActionBarActivity {

    Timer timer = new Timer();

    ImageView field;
    ImageView banner;
    ImageView bar;
    ImageView ball;

    ImageView brick1;
    ImageView brick2;
    ImageView brick3;
    ImageView brick4;
    ImageView brick5;
    ImageView brick6;
    ImageView brick7;
    ImageView brick8;
    ImageView brick9;
    ImageView brick10;
    ImageView brick11;
    ImageView brick12;
    ImageView brick13;
    ImageView brick14;
    ImageView brick15;
    ImageView brick16;
    ImageView brick17;
    ImageView brick18;
    ImageView brick19;
    ImageView brick20;
    ImageView brick21;
    ImageView brick22;
    ImageView brick23;
    ImageView brick24;
    ImageView brick25;
    ImageView brick26;
    ImageView brick27;
    ImageView brick28;
    ImageView brick29;
    ImageView brick30;
    ImageView brick31;
    ImageView brick32;
    ImageView brick33;
    ImageView brick34;
    ImageView brick35;

    ImageButton start;

    TextView score;
    TextView level;
    TextView lives;
    TextView finalT;
    TextView finalS;

    int livesLeft = 3;
    int playerScore = 0;
    int currLevel = 1;
    int backgroundColor = Color.BLACK;
    int ballX = 400;
    int ballY = 800;

    float x,y;

    int speed = 10;
    int directionX = -1, directionY = -1;

    boolean barSelected = false;
    boolean inGame = false;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this,R.raw.brickbreakerbeat);

        field = (ImageView) findViewById(R.id.imageView);
        field.setBackgroundColor(Color.argb(255,0,0,0));
        banner = (ImageView) findViewById(R.id.imageView7);
        ball = (ImageView) findViewById(R.id.imageView4);
        bar = (ImageView) findViewById(R.id.imageView3);

        brick1 = (ImageView) findViewById(R.id.imageView5);
        brick2 = (ImageView) findViewById(R.id.imageView6);
        brick3 = (ImageView) findViewById(R.id.imageView8);
        brick4 = (ImageView) findViewById(R.id.imageView9);
        brick5 = (ImageView) findViewById(R.id.imageView10);
        brick6 = (ImageView) findViewById(R.id.imageView11);
        brick7 = (ImageView) findViewById(R.id.imageView12);
        brick8 = (ImageView) findViewById(R.id.imageView13);
        brick9 = (ImageView) findViewById(R.id.imageView14);
        brick10 = (ImageView) findViewById(R.id.imageView15);
        brick11 = (ImageView) findViewById(R.id.imageView16);
        brick12 = (ImageView) findViewById(R.id.imageView17);
        brick13 = (ImageView) findViewById(R.id.imageView18);
        brick14 = (ImageView) findViewById(R.id.imageView19);
        brick15 = (ImageView) findViewById(R.id.imageView20);
        brick16 = (ImageView) findViewById(R.id.imageView21);
        brick17 = (ImageView) findViewById(R.id.imageView22);
        brick18 = (ImageView) findViewById(R.id.imageView23);
        brick19= (ImageView) findViewById(R.id.imageView24);
        brick20 = (ImageView) findViewById(R.id.imageView25);
        brick21 = (ImageView) findViewById(R.id.imageView26);
        brick22 = (ImageView) findViewById(R.id.imageView27);
        brick23 = (ImageView) findViewById(R.id.imageView28);
        brick24 = (ImageView) findViewById(R.id.imageView29);
        brick25 = (ImageView) findViewById(R.id.imageView30);
        brick26 = (ImageView) findViewById(R.id.imageView31);
        brick27 = (ImageView) findViewById(R.id.imageView32);
        brick28 = (ImageView) findViewById(R.id.imageView33);
        brick29 = (ImageView) findViewById(R.id.imageView34);
        brick30= (ImageView) findViewById(R.id.imageView35);
        brick31 = (ImageView) findViewById(R.id.imageView36);
        brick32 = (ImageView) findViewById(R.id.imageView37);
        brick33 = (ImageView) findViewById(R.id.imageView38);
        brick34 = (ImageView) findViewById(R.id.imageView39);
        brick35 = (ImageView) findViewById(R.id.imageView40);
        brick1.setColorFilter(Color.argb(255,255,0,0));
        brick3.setColorFilter(Color.argb(255,255,128,0));
        brick4.setColorFilter(Color.argb(255,255,255,0));
        brick5.setColorFilter(Color.argb(255,0,255,0));
        brick6.setColorFilter(Color.argb(255,0,255,255));
        brick2.setColorFilter(Color.argb(255,0,0,255));
        brick7.setColorFilter(Color.argb(255,255,0,255));
        brick10.setColorFilter(Color.argb(255,255,0,0));
        brick11.setColorFilter(Color.argb(255,255,128,0));
        brick12.setColorFilter(Color.argb(255,255,255,0));
        brick13.setColorFilter(Color.argb(255,0,255,0));
        brick9.setColorFilter(Color.argb(255,0,255,255));
        brick14.setColorFilter(Color.argb(255,0,0,255));
        brick8.setColorFilter(Color.argb(255,255,0,255));
        brick18.setColorFilter(Color.argb(255,255,0,0));
        brick19.setColorFilter(Color.argb(255,255,128,0));
        brick20.setColorFilter(Color.argb(255,255,255,0));
        brick16.setColorFilter(Color.argb(255,0,255,0));
        brick21.setColorFilter(Color.argb(255,0,255,255));
        brick15.setColorFilter(Color.argb(255,0,0,255));
        brick17.setColorFilter(Color.argb(255,255,0,255));
        brick26.setColorFilter(Color.argb(255,255,0,0));
        brick27.setColorFilter(Color.argb(255,255,128,0));
        brick23.setColorFilter(Color.argb(255,255,255,0));
        brick28.setColorFilter(Color.argb(255,0,255,0));
        brick22.setColorFilter(Color.argb(255,0,255,255));
        brick24.setColorFilter(Color.argb(255,0,0,255));
        brick25.setColorFilter(Color.argb(255,255,0,255));
        brick33.setColorFilter(Color.argb(255,255,0,0));
        brick34.setColorFilter(Color.argb(255,255,128,0));
        brick35.setColorFilter(Color.argb(255,255,255,0));
        brick29.setColorFilter(Color.argb(255,0,255,0));
        brick30.setColorFilter(Color.argb(255,0,255,255));
        brick31.setColorFilter(Color.argb(255,0,0,255));
        brick32.setColorFilter(Color.argb(255,255,0,255));

        brick1.setVisibility(View.GONE);
        brick2.setVisibility(View.GONE);
        brick3.setVisibility(View.GONE);
        brick4.setVisibility(View.GONE);
        brick5.setVisibility(View.GONE);
        brick6.setVisibility(View.GONE);
        brick7.setVisibility(View.GONE);
        brick8.setVisibility(View.GONE);
        brick9.setVisibility(View.GONE);
        brick10.setVisibility(View.GONE);
        brick11.setVisibility(View.GONE);
        brick12.setVisibility(View.GONE);
        brick13.setVisibility(View.GONE);
        brick14.setVisibility(View.GONE);
        brick15.setVisibility(View.GONE);
        brick16.setVisibility(View.GONE);
        brick17.setVisibility(View.GONE);
        brick18.setVisibility(View.GONE);
        brick19.setVisibility(View.GONE);
        brick20.setVisibility(View.GONE);
        brick21.setVisibility(View.GONE);
        brick22.setVisibility(View.GONE);
        brick23.setVisibility(View.GONE);
        brick24.setVisibility(View.GONE);
        brick25.setVisibility(View.GONE);
        brick26.setVisibility(View.GONE);
        brick27.setVisibility(View.GONE);
        brick28.setVisibility(View.GONE);
        brick29.setVisibility(View.GONE);
        brick30.setVisibility(View.GONE);
        brick31.setVisibility(View.GONE);
        brick32.setVisibility(View.GONE);
        brick33.setVisibility(View.GONE);
        brick34.setVisibility(View.GONE);
        brick35.setVisibility(View.GONE);

        start = (ImageButton) findViewById(R.id.imageButton4);
        score = (TextView) findViewById(R.id.score);
        level = (TextView) findViewById(R.id.level);
        lives = (TextView) findViewById(R.id.lives);
        finalT = (TextView) findViewById(R.id.finalText);
        finalS = (TextView) findViewById(R.id.finalScore);

        score.setTextColor(Color.argb(255,0,200,255));
        level.setTextColor(Color.argb(255,0,200,255));
        lives.setTextColor(Color.argb(255,0,200,255));
        finalT.setTextColor(Color.argb(255,0,200,255));
        finalS.setTextColor(Color.argb(255,0,200,255));
        finalT.setVisibility(View.GONE);
        finalS.setVisibility(View.GONE);

        score.setVisibility(View.GONE);
        level.setVisibility(View.GONE);
        lives.setVisibility(View.GONE);
        field.setVisibility(View.GONE);
        ball.setVisibility(View.GONE);
        bar.setVisibility(View.GONE);
        brick1.setVisibility(View.GONE);
        brick2.setVisibility(View.GONE);

        final int FPS = 40;
        TimerTask updateGame = new UpdateGameTask();
        timer.scheduleAtFixedRate(updateGame, 0, 1000/FPS);

    }

    public void startGame (View view)
    {
        mp.start();
        mp.seekTo(0);
        playerScore=0;
        livesLeft = 3;
        currLevel = 1;
        inGame = true;
        speed = 10;
        lives.setText("Lives: " + livesLeft);
        score.setText("Score: " + playerScore);
        level.setText("Level: " + currLevel);
        ballX=400;
        ballY=900;
        finalT.setVisibility(View.GONE);
        finalS.setVisibility(View.GONE);
        banner.setVisibility(View.GONE);
        start.setVisibility(View.GONE);
        field.setVisibility(View.VISIBLE);
        score.setVisibility(View.VISIBLE);
        level.setVisibility(View.VISIBLE);
        lives.setVisibility(View.VISIBLE);
        ball.setVisibility(View.VISIBLE);
        bar.setVisibility(View.VISIBLE);
        brick1.setVisibility(View.VISIBLE);
        brick2.setVisibility(View.VISIBLE);
        brick3.setVisibility(View.VISIBLE);
        brick4.setVisibility(View.VISIBLE);
        brick5.setVisibility(View.VISIBLE);
        brick6.setVisibility(View.VISIBLE);
        brick7.setVisibility(View.VISIBLE);
        brick8.setVisibility(View.VISIBLE);
        brick9.setVisibility(View.VISIBLE);
        brick10.setVisibility(View.VISIBLE);
        brick11.setVisibility(View.VISIBLE);
        brick12.setVisibility(View.VISIBLE);
        brick13.setVisibility(View.VISIBLE);
        brick14.setVisibility(View.VISIBLE);
        brick15.setVisibility(View.VISIBLE);
        brick16.setVisibility(View.VISIBLE);
        brick17.setVisibility(View.VISIBLE);
        brick18.setVisibility(View.VISIBLE);
        brick19.setVisibility(View.VISIBLE);
        brick20.setVisibility(View.VISIBLE);
        brick21.setVisibility(View.VISIBLE);
        brick22.setVisibility(View.VISIBLE);
        brick23.setVisibility(View.VISIBLE);
        brick24.setVisibility(View.VISIBLE);
        brick25.setVisibility(View.VISIBLE);
        brick26.setVisibility(View.VISIBLE);
        brick27.setVisibility(View.VISIBLE);
        brick28.setVisibility(View.VISIBLE);
        brick29.setVisibility(View.VISIBLE);
        brick30.setVisibility(View.VISIBLE);
        brick31.setVisibility(View.VISIBLE);
        brick32.setVisibility(View.VISIBLE);
        brick33.setVisibility(View.VISIBLE);
        brick34.setVisibility(View.VISIBLE);
        brick35.setVisibility(View.VISIBLE);
    }

    public void endGame () throws NoSuchFieldException {
        mp.pause();
        directionX = -1;
        directionY = -1;
        ballX=400;
        ballY=900;
        playerScore=0;
        inGame = false;
        banner.setVisibility(View.VISIBLE);
        start.setVisibility(View.VISIBLE);
        field.setVisibility(View.GONE);
        score.setVisibility(View.GONE);
        level.setVisibility(View.GONE);
        lives.setVisibility(View.GONE);
        ball.setVisibility(View.GONE);
        bar.setVisibility(View.GONE);
        brick1.setVisibility(View.GONE);
        brick2.setVisibility(View.GONE);
        brick3.setVisibility(View.GONE);
        brick4.setVisibility(View.GONE);
        brick5.setVisibility(View.GONE);
        brick6.setVisibility(View.GONE);
        brick7.setVisibility(View.GONE);
        brick8.setVisibility(View.GONE);
        brick9.setVisibility(View.GONE);
        brick10.setVisibility(View.GONE);
        brick11.setVisibility(View.GONE);
        brick12.setVisibility(View.GONE);
        brick13.setVisibility(View.GONE);
        brick14.setVisibility(View.GONE);
        brick15.setVisibility(View.GONE);
        brick16.setVisibility(View.GONE);
        brick17.setVisibility(View.GONE);
        brick18.setVisibility(View.GONE);
        brick19.setVisibility(View.GONE);
        brick20.setVisibility(View.GONE);
        brick21.setVisibility(View.GONE);
        brick22.setVisibility(View.GONE);
        brick23.setVisibility(View.GONE);
        brick24.setVisibility(View.GONE);
        brick25.setVisibility(View.GONE);
        brick26.setVisibility(View.GONE);
        brick27.setVisibility(View.GONE);
        brick28.setVisibility(View.GONE);
        brick29.setVisibility(View.GONE);
        brick30.setVisibility(View.GONE);
        brick31.setVisibility(View.GONE);
        brick32.setVisibility(View.GONE);
        brick33.setVisibility(View.GONE);
        brick34.setVisibility(View.GONE);
        brick35.setVisibility(View.GONE);
    }

    public void levelUp()
    {
        currLevel++;
        level.setText("Level: " + currLevel);
        speed+=5;
        ballX=400;
        ballY=900;
        directionX = -1;
        directionY = -1;
        brick1.setVisibility(View.VISIBLE);
        brick2.setVisibility(View.VISIBLE);
        brick3.setVisibility(View.VISIBLE);
        brick4.setVisibility(View.VISIBLE);
        brick5.setVisibility(View.VISIBLE);
        brick6.setVisibility(View.VISIBLE);
        brick7.setVisibility(View.VISIBLE);
        brick8.setVisibility(View.VISIBLE);
        brick9.setVisibility(View.VISIBLE);
        brick10.setVisibility(View.VISIBLE);
        brick11.setVisibility(View.VISIBLE);
        brick12.setVisibility(View.VISIBLE);
        brick13.setVisibility(View.VISIBLE);
        brick14.setVisibility(View.VISIBLE);
        brick15.setVisibility(View.VISIBLE);
        brick16.setVisibility(View.VISIBLE);
        brick17.setVisibility(View.VISIBLE);
        brick18.setVisibility(View.VISIBLE);
        brick19.setVisibility(View.VISIBLE);
        brick20.setVisibility(View.VISIBLE);
        brick21.setVisibility(View.VISIBLE);
        brick22.setVisibility(View.VISIBLE);
        brick23.setVisibility(View.VISIBLE);
        brick24.setVisibility(View.VISIBLE);
        brick25.setVisibility(View.VISIBLE);
        brick26.setVisibility(View.VISIBLE);
        brick27.setVisibility(View.VISIBLE);
        brick28.setVisibility(View.VISIBLE);
        brick29.setVisibility(View.VISIBLE);
        brick30.setVisibility(View.VISIBLE);
        brick31.setVisibility(View.VISIBLE);
        brick32.setVisibility(View.VISIBLE);
        brick33.setVisibility(View.VISIBLE);
        brick34.setVisibility(View.VISIBLE);
        brick35.setVisibility(View.VISIBLE);
    }

    public boolean onTouchEvent (MotionEvent event)
    {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN :
            {
                x = event.getRawX();
                y = event.getRawY();

                if ((x > bar.getX()) && (x < (bar.getX() + bar.getWidth())) && (y > bar.getY()))
                {
                    barSelected = true;
                }
            }
            break;
            case MotionEvent.ACTION_MOVE :
            {
                x = event.getRawX() - (bar.getWidth()/2);
                if(barSelected && x > field.getX() && (x + (bar.getWidth())) < (field.getX() + field.getWidth()))
                {
                    bar.setX(x);
                }
            }
            break;
            case MotionEvent.ACTION_UP :
            {
                barSelected = false;
            }
            break;
        }
        return true;
    }

    public class UpdateGameTask extends TimerTask
    {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable(){
                @Override
                public void run()
                {
                    ballX += (speed * directionX);
                    ballY += (speed * directionY);

                    ball.setX(ballX);
                    ball.setY(ballY);

                    if ((ballX + ball.getWidth()) > (field.getX() + field.getWidth()) || ballX < field.getX())
                    {
                        directionX *= -1;
                    }
                    if ((ballY + ball.getHeight()) > (field.getY() + field.getHeight()) || ballY < field.getY())
                    {
                        directionY *= -1;
                    }
                    if ((ballY + ball.getHeight()) > (bar.getY() + bar.getHeight()) && (ballX < bar.getX() + bar.getWidth())
                            && (ballX > bar.getX()))
                    {
                        directionY *= -1;
                    }
                    if ((ballY ) == (brick35.getY() ) && (ballX < brick35.getX() + brick35.getWidth())
                            && (ballX > brick35.getX()) && brick35.getVisibility() == View.VISIBLE)
                    {
                        brick35.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick34.getY() ) && (ballX < brick34.getX() + brick34.getWidth())
                            && (ballX > brick34.getX()) && brick34.getVisibility() == View.VISIBLE)
                    {
                        brick34.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick33.getY() ) && (ballX < brick33.getX() + brick33.getWidth())
                            && (ballX > brick33.getX()) && brick33.getVisibility() == View.VISIBLE)
                    {
                        brick33.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick32.getY() ) && (ballX < brick32.getX() + brick32.getWidth())
                            && (ballX > brick32.getX()) && brick32.getVisibility() == View.VISIBLE)
                    {
                        brick32.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick31.getY() ) && (ballX < brick31.getX() + brick31.getWidth())
                            && (ballX > brick31.getX()) && brick31.getVisibility() == View.VISIBLE)
                    {
                        brick31.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick30.getY() ) && (ballX < brick30.getX() + brick30.getWidth())
                            && (ballX > brick30.getX()) && brick30.getVisibility() == View.VISIBLE)
                    {
                        brick30.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick29.getY() ) && (ballX < brick29.getX() + brick29.getWidth())
                            && (ballX > brick29.getX()) && brick29.getVisibility() == View.VISIBLE)
                    {
                        brick29.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick28.getY() ) && (ballX < brick28.getX() + brick28.getWidth())
                            && (ballX > brick28.getX()) && brick28.getVisibility() == View.VISIBLE)
                    {
                        brick28.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick27.getY() ) && (ballX < brick27.getX() + brick27.getWidth())
                            && (ballX > brick27.getX()) && brick27.getVisibility() == View.VISIBLE)
                    {
                        brick27.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick26.getY() ) && (ballX < brick26.getX() + brick26.getWidth())
                            && (ballX > brick26.getX()) && brick26.getVisibility() == View.VISIBLE)
                    {
                        brick26.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick25.getY() ) && (ballX < brick25.getX() + brick25.getWidth())
                            && (ballX > brick25.getX()) && brick25.getVisibility() == View.VISIBLE)
                    {
                        brick25.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick24.getY() ) && (ballX < brick24.getX() + brick24.getWidth())
                            && (ballX > brick24.getX()) && brick24.getVisibility() == View.VISIBLE)
                    {
                        brick24.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick23.getY() ) && (ballX < brick23.getX() + brick23.getWidth())
                            && (ballX > brick23.getX()) && brick23.getVisibility() == View.VISIBLE)
                    {
                        brick23.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick22.getY() ) && (ballX < brick22.getX() + brick22.getWidth())
                            && (ballX > brick22.getX()) && brick22.getVisibility() == View.VISIBLE)
                    {
                        brick22.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick21.getY() ) && (ballX < brick21.getX() + brick21.getWidth())
                            && (ballX > brick21.getX()) && brick21.getVisibility() == View.VISIBLE)
                    {
                        brick21.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick20.getY() ) && (ballX < brick20.getX() + brick20.getWidth())
                            && (ballX > brick20.getX()) && brick20.getVisibility() == View.VISIBLE)
                    {
                        brick20.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick19.getY() ) && (ballX < brick19.getX() + brick19.getWidth())
                            && (ballX > brick19.getX()) && brick19.getVisibility() == View.VISIBLE)
                    {
                        brick19.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick18.getY() ) && (ballX < brick18.getX() + brick18.getWidth())
                            && (ballX > brick18.getX()) && brick18.getVisibility() == View.VISIBLE)
                    {
                        brick18.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick17.getY() ) && (ballX < brick17.getX() + brick17.getWidth())
                            && (ballX > brick17.getX()) && brick17.getVisibility() == View.VISIBLE)
                    {
                        brick17.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick16.getY() ) && (ballX < brick16.getX() + brick16.getWidth())
                            && (ballX > brick16.getX()) && brick16.getVisibility() == View.VISIBLE)
                    {
                        brick16.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick15.getY() ) && (ballX < brick15.getX() + brick15.getWidth())
                            && (ballX > brick15.getX()) && brick15.getVisibility() == View.VISIBLE)
                    {
                        brick15.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick14.getY() ) && (ballX < brick14.getX() + brick14.getWidth())
                            && (ballX > brick14.getX()) && brick14.getVisibility() == View.VISIBLE)
                    {
                        brick14.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick13.getY() ) && (ballX < brick13.getX() + brick13.getWidth())
                            && (ballX > brick13.getX()) && brick13.getVisibility() == View.VISIBLE)
                    {
                        brick13.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick12.getY() ) && (ballX < brick12.getX() + brick12.getWidth())
                            && (ballX > brick12.getX()) && brick12.getVisibility() == View.VISIBLE)
                    {
                        brick12.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick11.getY() ) && (ballX < brick11.getX() + brick11.getWidth())
                            && (ballX > brick11.getX()) && brick11.getVisibility() == View.VISIBLE)
                    {
                        brick11.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick10.getY() ) && (ballX < brick10.getX() + brick10.getWidth())
                            && (ballX > brick10.getX()) && brick10.getVisibility() == View.VISIBLE)
                    {
                        brick10.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick9.getY() ) && (ballX < brick9.getX() + brick9.getWidth())
                            && (ballX > brick9.getX()) && brick9.getVisibility() == View.VISIBLE)
                    {
                        brick9.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick8.getY() ) && (ballX < brick8.getX() + brick8.getWidth())
                            && (ballX > brick8.getX()) && brick8.getVisibility() == View.VISIBLE)
                    {
                        brick8.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick7.getY() ) && (ballX < brick7.getX() + brick7.getWidth())
                            && (ballX > brick7.getX()) && brick7.getVisibility() == View.VISIBLE)
                    {
                        brick7.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick6.getY() ) && (ballX < brick6.getX() + brick6.getWidth())
                            && (ballX > brick6.getX()) && brick6.getVisibility() == View.VISIBLE)
                    {
                        brick6.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick5.getY() ) && (ballX < brick5.getX() + brick5.getWidth())
                            && (ballX > brick5.getX()) && brick5.getVisibility() == View.VISIBLE)
                    {
                        brick5.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick4.getY() ) && (ballX < brick4.getX() + brick4.getWidth())
                            && (ballX > brick4.getX()) && brick4.getVisibility() == View.VISIBLE)
                    {
                        brick4.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick3.getY() ) && (ballX < brick3.getX() + brick3.getWidth())
                            && (ballX > brick3.getX()) && brick3.getVisibility() == View.VISIBLE)
                    {
                        brick3.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick2.getY() ) && (ballX < brick2.getX() + brick2.getWidth())
                            && (ballX > brick2.getX()) && brick2.getVisibility() == View.VISIBLE)
                    {
                        brick2.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick1.getY() ) && (ballX < brick1.getX() + brick1.getWidth())
                            && (ballX > brick1.getX()) && brick1.getVisibility() == View.VISIBLE)
                    {
                        brick1.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick35.getY() + brick35.getHeight() ) && (ballX < brick35.getX() + brick35.getWidth())
                            && (ballX > brick35.getX()) && brick35.getVisibility() == View.VISIBLE)
                    {
                        brick35.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick34.getY() + brick34.getHeight()) && (ballX < brick34.getX() + brick34.getWidth())
                            && (ballX > brick34.getX()) && brick34.getVisibility() == View.VISIBLE)
                    {
                        brick34.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick33.getY() + brick33.getHeight()) && (ballX < brick33.getX() + brick33.getWidth())
                            && (ballX > brick33.getX()) && brick33.getVisibility() == View.VISIBLE)
                    {
                        brick33.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick32.getY() + brick32.getHeight()) && (ballX < brick32.getX() + brick32.getWidth())
                            && (ballX > brick32.getX()) && brick32.getVisibility() == View.VISIBLE)
                    {
                        brick32.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick31.getY() + brick31.getHeight()) && (ballX < brick31.getX() + brick31.getWidth())
                            && (ballX > brick31.getX()) && brick31.getVisibility() == View.VISIBLE)
                    {
                        brick31.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick30.getY() + brick30.getHeight()) && (ballX < brick30.getX() + brick30.getWidth())
                            && (ballX > brick30.getX()) && brick30.getVisibility() == View.VISIBLE)
                    {
                        brick30.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick29.getY() + brick29.getHeight()) && (ballX < brick29.getX() + brick29.getWidth())
                            && (ballX > brick29.getX()) && brick29.getVisibility() == View.VISIBLE)
                    {
                        brick29.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick28.getY() + brick28.getHeight()) && (ballX < brick28.getX() + brick28.getWidth())
                            && (ballX > brick28.getX()) && brick28.getVisibility() == View.VISIBLE)
                    {
                        brick28.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick27.getY() + brick27.getHeight()) && (ballX < brick27.getX() + brick27.getWidth())
                            && (ballX > brick27.getX()) && brick27.getVisibility() == View.VISIBLE)
                    {
                        brick27.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick26.getY() + brick26.getHeight()) && (ballX < brick26.getX() + brick26.getWidth())
                            && (ballX > brick26.getX()) && brick26.getVisibility() == View.VISIBLE)
                    {
                        brick26.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick25.getY() + brick25.getHeight()) && (ballX < brick25.getX() + brick25.getWidth())
                            && (ballX > brick25.getX()) && brick25.getVisibility() == View.VISIBLE)
                    {
                        brick25.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick24.getY() + brick24.getHeight()) && (ballX < brick24.getX() + brick24.getWidth())
                            && (ballX > brick24.getX()) && brick24.getVisibility() == View.VISIBLE)
                    {
                        brick24.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick23.getY() + brick23.getHeight()) && (ballX < brick23.getX() + brick23.getWidth())
                            && (ballX > brick23.getX()) && brick23.getVisibility() == View.VISIBLE)
                    {
                        brick23.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick22.getY() + brick22.getHeight()) && (ballX < brick22.getX() + brick22.getWidth())
                            && (ballX > brick22.getX()) && brick22.getVisibility() == View.VISIBLE)
                    {
                        brick22.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick21.getY() + brick21.getHeight()) && (ballX < brick21.getX() + brick21.getWidth())
                            && (ballX > brick21.getX()) && brick21.getVisibility() == View.VISIBLE)
                    {
                        brick21.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick20.getY() + brick20.getHeight()) && (ballX < brick20.getX() + brick20.getWidth())
                            && (ballX > brick20.getX()) && brick20.getVisibility() == View.VISIBLE)
                    {
                        brick20.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick19.getY() + brick19.getHeight()) && (ballX < brick19.getX() + brick19.getWidth())
                            && (ballX > brick19.getX()) && brick19.getVisibility() == View.VISIBLE)
                    {
                        brick19.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick18.getY() + brick18.getHeight()) && (ballX < brick18.getX() + brick18.getWidth())
                            && (ballX > brick18.getX()) && brick18.getVisibility() == View.VISIBLE)
                    {
                        brick18.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick17.getY() + brick17.getHeight()) && (ballX < brick17.getX() + brick17.getWidth())
                            && (ballX > brick17.getX()) && brick17.getVisibility() == View.VISIBLE)
                    {
                        brick17.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick16.getY() + brick16.getHeight()) && (ballX < brick16.getX() + brick16.getWidth())
                            && (ballX > brick16.getX()) && brick16.getVisibility() == View.VISIBLE)
                    {
                        brick16.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick15.getY() + brick15.getHeight()) && (ballX < brick15.getX() + brick15.getWidth())
                            && (ballX > brick15.getX()) && brick15.getVisibility() == View.VISIBLE)
                    {
                        brick15.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick14.getY() + brick14.getHeight()) && (ballX < brick14.getX() + brick14.getWidth())
                            && (ballX > brick14.getX()) && brick14.getVisibility() == View.VISIBLE)
                    {
                        brick14.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick13.getY() + brick13.getHeight()) && (ballX < brick13.getX() + brick13.getWidth())
                            && (ballX > brick13.getX()) && brick13.getVisibility() == View.VISIBLE)
                    {
                        brick13.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick12.getY() + brick12.getHeight()) && (ballX < brick12.getX() + brick12.getWidth())
                            && (ballX > brick12.getX()) && brick12.getVisibility() == View.VISIBLE)
                    {
                        brick12.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick11.getY() + brick11.getHeight()) && (ballX < brick11.getX() + brick11.getWidth())
                            && (ballX > brick11.getX()) && brick11.getVisibility() == View.VISIBLE)
                    {
                        brick11.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick10.getY() + brick10.getHeight()) && (ballX < brick10.getX() + brick10.getWidth())
                            && (ballX > brick10.getX()) && brick10.getVisibility() == View.VISIBLE)
                    {
                        brick10.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick9.getY() + brick9.getHeight()) && (ballX < brick9.getX() + brick9.getWidth())
                            && (ballX > brick9.getX()) && brick9.getVisibility() == View.VISIBLE)
                    {
                        brick9.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick8.getY() + brick8.getHeight()) && (ballX < brick8.getX() + brick8.getWidth())
                            && (ballX > brick8.getX()) && brick8.getVisibility() == View.VISIBLE)
                    {
                        brick8.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick7.getY() + brick7.getHeight()) && (ballX < brick7.getX() + brick7.getWidth())
                            && (ballX > brick7.getX()) && brick7.getVisibility() == View.VISIBLE)
                    {
                        brick7.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick6.getY() + brick6.getHeight()) && (ballX < brick6.getX() + brick6.getWidth())
                            && (ballX > brick6.getX()) && brick6.getVisibility() == View.VISIBLE)
                    {
                        brick6.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick5.getY() + brick5.getHeight()) && (ballX < brick5.getX() + brick5.getWidth())
                            && (ballX > brick5.getX()) && brick5.getVisibility() == View.VISIBLE)
                    {
                        brick5.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick4.getY() + brick4.getHeight()) && (ballX < brick4.getX() + brick4.getWidth())
                            && (ballX > brick4.getX()) && brick4.getVisibility() == View.VISIBLE)
                    {
                        brick4.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick3.getY() + brick3.getHeight()) && (ballX < brick3.getX() + brick3.getWidth())
                            && (ballX > brick3.getX()) && brick3.getVisibility() == View.VISIBLE)
                    {
                        brick3.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick2.getY() + brick2.getHeight()) && (ballX < brick2.getX() + brick2.getWidth())
                            && (ballX > brick2.getX()) && brick2.getVisibility() == View.VISIBLE)
                    {
                        brick2.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) == (brick1.getY() + brick1.getHeight()) && (ballX < brick1.getX() + brick1.getWidth())
                            && (ballX > brick1.getX()) && brick1.getVisibility() == View.VISIBLE)
                    {
                        brick1.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionY *= -1;
                    }
                    else if ((ballY ) < (brick35.getY() + brick35.getHeight() )&& (ballY > brick35.getY()) && (ballX < brick35.getX() + brick35.getWidth())
                            && (ballX > brick35.getX()) && brick35.getVisibility() == View.VISIBLE)
                    {
                        brick35.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick34.getY() + brick34.getHeight())&& (ballY > brick34.getY()) && (ballX < brick34.getX() + brick34.getWidth())
                            && (ballX > brick34.getX()) && brick34.getVisibility() == View.VISIBLE)
                    {
                        brick34.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick33.getY() + brick33.getHeight())&& (ballY > brick33.getY()) && (ballX < brick33.getX() + brick33.getWidth())
                            && (ballX > brick33.getX()) && brick33.getVisibility() == View.VISIBLE)
                    {
                        brick33.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick32.getY() + brick32.getHeight()) && (ballY > brick32.getY())&& (ballX < brick32.getX() + brick32.getWidth())
                            && (ballX > brick32.getX()) && brick32.getVisibility() == View.VISIBLE)
                    {
                        brick32.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick31.getY() + brick31.getHeight()) && (ballY > brick31.getY())&& (ballX < brick31.getX() + brick31.getWidth())
                            && (ballX > brick31.getX()) && brick31.getVisibility() == View.VISIBLE)
                    {
                        brick31.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick30.getY() + brick30.getHeight())&& (ballY > brick30.getY()) && (ballX < brick30.getX() + brick30.getWidth())
                            && (ballX > brick30.getX()) && brick30.getVisibility() == View.VISIBLE)
                    {
                        brick30.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick29.getY() + brick29.getHeight()) && (ballY > brick29.getY())&& (ballX < brick29.getX() + brick29.getWidth())
                            && (ballX > brick29.getX()) && brick29.getVisibility() == View.VISIBLE)
                    {
                        brick29.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick28.getY() + brick28.getHeight()) && (ballY > brick28.getY())&& (ballX < brick28.getX() + brick28.getWidth())
                            && (ballX > brick28.getX()) && brick28.getVisibility() == View.VISIBLE)
                    {
                        brick28.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick27.getY() + brick27.getHeight()) && (ballY > brick27.getY())&& (ballX < brick27.getX() + brick27.getWidth())
                            && (ballX > brick27.getX()) && brick27.getVisibility() == View.VISIBLE)
                    {
                        brick27.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick26.getY() + brick26.getHeight()) && (ballY > brick26.getY())&& (ballX < brick26.getX() + brick26.getWidth())
                            && (ballX > brick26.getX()) && brick26.getVisibility() == View.VISIBLE)
                    {
                        brick26.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick25.getY() + brick25.getHeight()) && (ballY > brick25.getY())&& (ballX < brick25.getX() + brick25.getWidth())
                            && (ballX > brick25.getX()) && brick25.getVisibility() == View.VISIBLE)
                    {
                        brick25.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick24.getY() + brick24.getHeight()) && (ballY > brick24.getY())&& (ballX < brick24.getX() + brick24.getWidth())
                            && (ballX > brick24.getX()) && brick24.getVisibility() == View.VISIBLE)
                    {
                        brick24.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick23.getY() + brick23.getHeight()) && (ballY > brick23.getY())&& (ballX < brick23.getX() + brick23.getWidth())
                            && (ballX > brick23.getX()) && brick23.getVisibility() == View.VISIBLE)
                    {
                        brick23.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick22.getY() + brick22.getHeight()) && (ballY > brick22.getY())&& (ballX < brick22.getX() + brick22.getWidth())
                            && (ballX > brick22.getX()) && brick22.getVisibility() == View.VISIBLE)
                    {
                        brick22.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick21.getY() + brick21.getHeight()) && (ballY > brick21.getY())&& (ballX < brick21.getX() + brick21.getWidth())
                            && (ballX > brick21.getX()) && brick21.getVisibility() == View.VISIBLE)
                    {
                        brick21.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick20.getY() + brick20.getHeight()) && (ballY > brick20.getY())&& (ballX < brick20.getX() + brick20.getWidth())
                            && (ballX > brick20.getX()) && brick20.getVisibility() == View.VISIBLE)
                    {
                        brick20.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick19.getY() + brick19.getHeight()) && (ballY > brick19.getY())&& (ballX < brick19.getX() + brick19.getWidth())
                            && (ballX > brick19.getX()) && brick19.getVisibility() == View.VISIBLE)
                    {
                        brick19.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick18.getY() + brick18.getHeight()) && (ballY > brick18.getY())&& (ballX < brick18.getX() + brick18.getWidth())
                            && (ballX > brick18.getX()) && brick18.getVisibility() == View.VISIBLE)
                    {
                        brick18.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick17.getY() + brick17.getHeight()) && (ballY > brick17.getY())&& (ballX < brick17.getX() + brick17.getWidth())
                            && (ballX > brick17.getX()) && brick17.getVisibility() == View.VISIBLE)
                    {
                        brick17.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick16.getY() + brick16.getHeight()) && (ballY > brick16.getY())&& (ballX < brick16.getX() + brick16.getWidth())
                            && (ballX > brick16.getX()) && brick16.getVisibility() == View.VISIBLE)
                    {
                        brick16.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick15.getY() + brick15.getHeight()) && (ballY > brick15.getY())&& (ballX < brick15.getX() + brick15.getWidth())
                            && (ballX > brick15.getX()) && brick15.getVisibility() == View.VISIBLE)
                    {
                        brick15.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick14.getY() + brick14.getHeight()) && (ballY > brick14.getY())&& (ballX < brick14.getX() + brick14.getWidth())
                            && (ballX > brick14.getX()) && brick14.getVisibility() == View.VISIBLE)
                    {
                        brick14.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick13.getY() + brick13.getHeight()) && (ballY > brick13.getY())&& (ballX < brick13.getX() + brick13.getWidth())
                            && (ballX > brick13.getX()) && brick13.getVisibility() == View.VISIBLE)
                    {
                        brick13.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick12.getY() + brick12.getHeight()) && (ballY > brick12.getY())&& (ballX < brick12.getX() + brick12.getWidth())
                            && (ballX > brick12.getX()) && brick12.getVisibility() == View.VISIBLE)
                    {
                        brick12.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick11.getY() + brick11.getHeight()) && (ballY > brick11.getY())&& (ballX < brick11.getX() + brick11.getWidth())
                            && (ballX > brick11.getX()) && brick11.getVisibility() == View.VISIBLE)
                    {
                        brick11.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick10.getY() + brick10.getHeight()) && (ballY > brick10.getY())&& (ballX < brick10.getX() + brick10.getWidth())
                            && (ballX > brick10.getX()) && brick10.getVisibility() == View.VISIBLE)
                    {
                        brick10.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick9.getY() + brick9.getHeight()) && (ballY > brick9.getY())&& (ballX < brick9.getX() + brick9.getWidth())
                            && (ballX > brick9.getX()) && brick9.getVisibility() == View.VISIBLE)
                    {
                        brick9.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick8.getY() + brick8.getHeight()) && (ballY > brick8.getY())&& (ballX < brick8.getX() + brick8.getWidth())
                            && (ballX > brick8.getX()) && brick8.getVisibility() == View.VISIBLE)
                    {
                        brick8.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick7.getY() + brick7.getHeight()) && (ballY > brick7.getY())&& (ballX < brick7.getX() + brick7.getWidth())
                            && (ballX > brick7.getX()) && brick7.getVisibility() == View.VISIBLE)
                    {
                        brick7.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick6.getY() + brick6.getHeight()) && (ballY > brick6.getY())&& (ballX < brick6.getX() + brick6.getWidth())
                            && (ballX > brick6.getX()) && brick6.getVisibility() == View.VISIBLE)
                    {
                        brick6.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick5.getY() + brick5.getHeight()) && (ballY > brick5.getY())&& (ballX < brick5.getX() + brick5.getWidth())
                            && (ballX > brick5.getX()) && brick5.getVisibility() == View.VISIBLE)
                    {
                        brick5.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick4.getY() + brick4.getHeight()) && (ballY > brick4.getY())&& (ballX < brick4.getX() + brick4.getWidth())
                            && (ballX > brick4.getX()) && brick4.getVisibility() == View.VISIBLE)
                    {
                        brick4.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick3.getY() + brick3.getHeight()) && (ballY > brick3.getY())&& (ballX < brick3.getX() + brick3.getWidth())
                            && (ballX > brick3.getX()) && brick3.getVisibility() == View.VISIBLE)
                    {
                        brick3.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick2.getY() + brick2.getHeight()) && (ballY > brick2.getY())&& (ballX < brick2.getX() + brick2.getWidth())
                            && (ballX > brick2.getX()) && brick2.getVisibility() == View.VISIBLE)
                    {
                        brick2.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    else if ((ballY ) < (brick1.getY() + brick1.getHeight()) && (ballY > brick1.getY())&& (ballX < brick1.getX() + brick1.getWidth())
                            && (ballX > brick1.getX()) && brick1.getVisibility() == View.VISIBLE)
                    {
                        brick1.setVisibility(View.GONE);
                        playerScore+=10;
                        score.setText("Score: " + playerScore);
                        directionX *= -1;
                    }
                    if(ballY > bar.getY())
                    {
                        livesLeft--;
                        lives.setText("Lives: " + livesLeft);
                        ballX=400;
                        ballY=900;
                        directionX = -1;
                        directionY = -1;
                    }
                    if(livesLeft == 0 && inGame)
                    {
                        finalT.setText("GAME OVER");
                        finalT.setVisibility(View.VISIBLE);
                        finalS.setText("Score: " + playerScore);
                        finalS.setVisibility(View.VISIBLE);
                        try {
                            endGame();
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        }
                    }
                    if (brick1.getVisibility() == View.GONE &&brick2.getVisibility() == View.GONE &&brick3.getVisibility() == View.GONE &&
                            brick4.getVisibility() == View.GONE &&brick5.getVisibility() == View.GONE &&brick6.getVisibility() == View.GONE &&
                            brick7.getVisibility() == View.GONE &&brick8.getVisibility() == View.GONE &&brick9.getVisibility() == View.GONE &&
                            brick10.getVisibility() == View.GONE &&brick11.getVisibility() == View.GONE &&brick12.getVisibility() == View.GONE &&
                            brick13.getVisibility() == View.GONE &&brick14.getVisibility() == View.GONE &&brick15.getVisibility() == View.GONE &&
                            brick16.getVisibility() == View.GONE &&brick17.getVisibility() == View.GONE &&brick18.getVisibility() == View.GONE &&
                            brick19.getVisibility() == View.GONE &&brick20.getVisibility() == View.GONE &&brick21.getVisibility() == View.GONE &&
                            brick22.getVisibility() == View.GONE &&brick23.getVisibility() == View.GONE &&brick24.getVisibility() == View.GONE &&
                            brick25.getVisibility() == View.GONE &&brick26.getVisibility() == View.GONE &&brick27.getVisibility() == View.GONE &&
                            brick28.getVisibility() == View.GONE &&brick29.getVisibility() == View.GONE &&brick30.getVisibility() == View.GONE &&
                            brick31.getVisibility() == View.GONE &&brick32.getVisibility() == View.GONE &&brick33.getVisibility() == View.GONE &&
                            brick34.getVisibility() == View.GONE &&brick35.getVisibility() == View.GONE && inGame)
                    {
                        levelUp();
                        if (currLevel == 4 && inGame)
                        {
                            finalT.setText("YOU WIN!");
                            finalT.setVisibility(View.VISIBLE);
                            finalS.setText("Score: " + playerScore);
                            finalS.setVisibility(View.VISIBLE);
                            try {
                                endGame();
                            } catch (NoSuchFieldException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
    }
    {

    }

}
