package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Nivel2 extends AppCompatActivity {

    private int limitFig = 0, score = 0, fail = 0;
    private String figSelec1 = "", figSelec2 = "";
    private ImageView img5, img6, img7, img8, img9, img10;
    private ImageButton imgBtn5, imgBtn6, imgBtn7, imgBtn8, imgBtn9, imgBtn10;
    private TextView tvScore, tvFail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2);
        img5 = (ImageView)findViewById(R.id.img5);
        img6 = (ImageView)findViewById(R.id.img6);
        img7 = (ImageView)findViewById(R.id.img7);
        img8 = (ImageView)findViewById(R.id.img8);
        img9 = (ImageView)findViewById(R.id.img9);
        img10 = (ImageView)findViewById(R.id.img10);

        imgBtn5 = (ImageButton) findViewById(R.id.imageButton5);
        imgBtn6 = (ImageButton)findViewById(R.id.imageButton6);
        imgBtn7 = (ImageButton)findViewById(R.id.imageButton7);
        imgBtn8 = (ImageButton)findViewById(R.id.imageButton8);
        imgBtn9 = (ImageButton)findViewById(R.id.imageButton9);
        imgBtn10 = (ImageButton)findViewById(R.id.imageButton10);

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
            if(figSelec1.equals("imageButton5")){ img5.setVisibility(img5.VISIBLE); }
            if(figSelec1.equals("imageButton6")){ img6.setVisibility(img6.VISIBLE); }
            if(figSelec1.equals("imageButton7")){ img7.setVisibility(img7.VISIBLE); }
            if(figSelec1.equals("imageButton8")){ img8.setVisibility(img8.VISIBLE); }
            if(figSelec1.equals("imageButton9")){ img9.setVisibility(img9.VISIBLE); }
            if(figSelec1.equals("imageButton10")){ img10.setVisibility(img10.VISIBLE); }
        }
        else{
            if(limitFig == 1){
                figSelec2 = getResources().getResourceEntryName(view.getId());
                limitFig ++;
                view.setVisibility(view.INVISIBLE);
                if(figSelec2.equals("imageButton5")){ img5.setVisibility(img5.VISIBLE); }
                if(figSelec2.equals("imageButton6")){ img6.setVisibility(img6.VISIBLE); }
                if(figSelec2.equals("imageButton7")){ img7.setVisibility(img7.VISIBLE); }
                if(figSelec2.equals("imageButton8")){ img8.setVisibility(img8.VISIBLE); }
                if(figSelec2.equals("imageButton9")){ img9.setVisibility(img9.VISIBLE); }
                if(figSelec2.equals("imageButton10")){ img10.setVisibility(img10.VISIBLE); }

                if((figSelec1.equals("imageButton5") && figSelec2.equals("imageButton10")) || (figSelec1.equals("imageButton10") && figSelec2.equals("imageButton5")) ){
                    Toast.makeText(this, "Muy Bien",Toast.LENGTH_SHORT).show();
                    score++;
                }else{
                    if((figSelec1.equals("imageButton6") && figSelec2.equals("imageButton7")) || (figSelec1.equals("imageButton7") && figSelec2.equals("imageButton6")) ){
                        Toast.makeText(this, "Muy Bien",Toast.LENGTH_SHORT).show();
                        score++;
                    }
                    else{
                        if((figSelec1.equals("imageButton8") && figSelec2.equals("imageButton9")) || (figSelec1.equals("imageButton9") && figSelec2.equals("imageButton8")) ){
                            Toast.makeText(this, "Muy Bien",Toast.LENGTH_SHORT).show();
                            score++;
                        }
                        else{
                            if((figSelec1.equals("imageButton5") && !figSelec2.equals("imageButton10")) || (figSelec1.equals("imageButton10") && !figSelec2.equals("imageButton5")) ){
                                Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                                if(figSelec1.equals("imageButton5")){
                                    img5.setVisibility(img5.INVISIBLE);
                                    imgBtn5.setVisibility(imgBtn5.VISIBLE);
                                }
                                else{
                                    img10.setVisibility(img10.INVISIBLE);
                                    imgBtn10.setVisibility(imgBtn10.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton6")){
                                    img6.setVisibility(img6.INVISIBLE);
                                    imgBtn6.setVisibility(imgBtn6.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton7")){
                                    img7.setVisibility(img7.INVISIBLE);
                                    imgBtn7.setVisibility(imgBtn7.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton8")){
                                    img8.setVisibility(img8.INVISIBLE);
                                    imgBtn8.setVisibility(imgBtn8.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton9")){
                                    img9.setVisibility(img9.INVISIBLE);
                                    imgBtn9.setVisibility(imgBtn9.VISIBLE);
                                }
                            }
                            if((figSelec1.equals("imageButton6") && !figSelec2.equals("imageButton7")) || (figSelec1.equals("imageButton7") && !figSelec2.equals("imageButton6")) ){
                                Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                                if(figSelec1.equals("imageButton6")){
                                    img6.setVisibility(img6.INVISIBLE);
                                    imgBtn6.setVisibility(imgBtn6.VISIBLE);
                                }
                                else{
                                    img7.setVisibility(img7.INVISIBLE);
                                    imgBtn7.setVisibility(imgBtn7.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton5")){
                                    img5.setVisibility(img5.INVISIBLE);
                                    imgBtn5.setVisibility(imgBtn5.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton8")){
                                    img8.setVisibility(img8.INVISIBLE);
                                    imgBtn8.setVisibility(imgBtn8.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton9")){
                                    img9.setVisibility(img9.INVISIBLE);
                                    imgBtn9.setVisibility(imgBtn9.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton10")){
                                    img10.setVisibility(img10.INVISIBLE);
                                    imgBtn10.setVisibility(imgBtn10.VISIBLE);
                                }
                            }
                            if((figSelec1.equals("imageButton8") && !figSelec2.equals("imageButton9")) || (figSelec1.equals("imageButton9") && !figSelec2.equals("imageButton8")) ){
                                Toast.makeText(this, "Itentalo nuevamente",Toast.LENGTH_SHORT).show();
                                if(figSelec1.equals("imageButton8")){
                                    img8.setVisibility(img8.INVISIBLE);
                                    imgBtn8.setVisibility(imgBtn8.VISIBLE);
                                }
                                else{
                                    img9.setVisibility(img9.INVISIBLE);
                                    imgBtn9.setVisibility(imgBtn9.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton5")){
                                    img5.setVisibility(img5.INVISIBLE);
                                    imgBtn5.setVisibility(imgBtn5.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton6")){
                                    img6.setVisibility(img6.INVISIBLE);
                                    imgBtn6.setVisibility(imgBtn6.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton7")){
                                    img7.setVisibility(img7.INVISIBLE);
                                    imgBtn7.setVisibility(imgBtn7.VISIBLE);
                                }
                                if(figSelec2.equals("imageButton10")){
                                    img10.setVisibility(img10.INVISIBLE);
                                    imgBtn10.setVisibility(imgBtn10.VISIBLE);
                                }
                            }

                            fail++;
                        }
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

}