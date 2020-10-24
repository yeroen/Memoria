package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Nivel1 extends AppCompatActivity {
    private int limitFig = 0, score = 0, fail = 0;
    private String figSelec1 = "", figSelec2 = "";
    private ImageView img1, img2, img3, img4;
    private ImageButton imgBtn1, imgBtn2, imgBtn3, imgBtn4;
    private TextView tvScore, tvFail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);

        imgBtn1 = (ImageButton) findViewById(R.id.imageButton1);
        imgBtn2 = (ImageButton)findViewById(R.id.imageButton2);
        imgBtn3 = (ImageButton)findViewById(R.id.imageButton3);
        imgBtn4 = (ImageButton)findViewById(R.id.imageButton4);

        tvScore = (TextView)findViewById(R.id.txt_score);
        tvFail = (TextView)findViewById(R.id.txt_fallas);

        tvScore.setText("Score: "+score);
        tvFail.setText("Fallas: "+fail);
    }

    public void descubrir(View view){
        if( limitFig == 0){
            figSelec1 = getResources().getResourceEntryName(view.getId());
            limitFig ++;
            view.setVisibility(view.INVISIBLE);
            if(figSelec1.equals("imageButton1")){ img1.setVisibility(img1.VISIBLE); }
            if(figSelec1.equals("imageButton2")){ img2.setVisibility(img3.VISIBLE); }
            if(figSelec1.equals("imageButton3")){ img3.setVisibility(img3.VISIBLE); }
            if(figSelec1.equals("imageButton4")){ img4.setVisibility(img4.VISIBLE); }
        }
        else{
            if(limitFig == 1){
                figSelec2 = getResources().getResourceEntryName(view.getId());
                limitFig ++;
                view.setVisibility(view.INVISIBLE);
                if(figSelec2.equals("imageButton1")){ img1.setVisibility(img1.VISIBLE); }
                if(figSelec2.equals("imageButton2")){ img2.setVisibility(img2.VISIBLE); }
                if(figSelec2.equals("imageButton3")){ img3.setVisibility(img3.VISIBLE); }
                if(figSelec2.equals("imageButton4")){ img4.setVisibility(img4.VISIBLE); }

                if((figSelec1.equals("imageButton1") && figSelec2.equals("imageButton4")) || (figSelec1.equals("imageButton4") && figSelec2.equals("imageButton1")) ){
                    Toast.makeText(this, "Muy Bien",Toast.LENGTH_SHORT).show();
                    score++;
                }else{
                    if((figSelec1.equals("imageButton2") && figSelec2.equals("imageButton3")) || (figSelec1.equals("imageButton3") && figSelec2.equals("imageButton2")) ){
                        Toast.makeText(this, "Muy Bien",Toast.LENGTH_SHORT).show();
                        score++;
                    }
                    else{
                        if((figSelec1.equals("imageButton1") && figSelec2.equals("imageButton2")) || (figSelec1.equals("imageButton2") && figSelec2.equals("imageButton1"))){
                            Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                            img1.setVisibility(img1.INVISIBLE);
                            imgBtn1.setVisibility(imgBtn1.VISIBLE);
                            img2.setVisibility(img2.INVISIBLE);
                            imgBtn2.setVisibility(imgBtn2.VISIBLE);
                        }
                        if((figSelec1.equals("imageButton1") && figSelec2.equals("imageButton3")) || (figSelec1.equals("imageButton3") && figSelec2.equals("imageButton1"))){
                            Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                            img1.setVisibility(img1.INVISIBLE);
                            imgBtn1.setVisibility(imgBtn1.VISIBLE);
                            img3.setVisibility(img3.INVISIBLE);
                            imgBtn3.setVisibility(imgBtn3.VISIBLE);
                        }
                        if((figSelec1.equals("imageButton2") && figSelec2.equals("imageButton4")) || (figSelec1.equals("imageButton4") && figSelec2.equals("imageButton2"))){
                            Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                            img2.setVisibility(img2.INVISIBLE);
                            imgBtn2.setVisibility(imgBtn2.VISIBLE);
                            img4.setVisibility(img4.INVISIBLE);
                            imgBtn4.setVisibility(imgBtn4.VISIBLE);
                        }
                        if((figSelec1.equals("imageButton3") && figSelec2.equals("imageButton4")) || (figSelec1.equals("imageButton4") && figSelec2.equals("imageButton3"))){
                            Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                            img3.setVisibility(img3.INVISIBLE);
                            imgBtn3.setVisibility(imgBtn3.VISIBLE);
                            img4.setVisibility(img4.INVISIBLE);
                            imgBtn4.setVisibility(imgBtn4.VISIBLE);
                        }

                        fail++;
                    }

                }
                limitFig = 0;
                figSelec1 = "";
                figSelec2 = "";
            }
        }
        tvScore.setText("Score: "+score);
        tvFail.setText("Fallas: "+fail);
    }

    public void nextLvl(View view){
        if(score == 2){
            Intent i = new Intent(this, Nivel2.class);
            //i.putExtra("item","3");
            startActivity(i);
        }
    }
}