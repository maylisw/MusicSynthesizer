package com.example.maylisw.musicsynthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonA, buttonBB, buttonB, buttonC, buttonCS, buttonD, buttonDS, buttonE, buttonF, buttonFS, buttonG, buttonGS, buttonAH, playScales, twinkleTwinkle, playSong;
    private MediaPlayer aNote, bbNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, aHighNote, bHighNote, csHighNote, dHighNote, eHighNote, fsHighNote;
    private Spinner whichNote;
    private NumberPicker howManyTimes;
    private MediaPlayer[] mediaPlayers, twinklePlayer, normalMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireMeUp();
        setListeners();
        createMediaPlayers();
        mediaPlayers = new MediaPlayer[]{eNote, fNote, fsNote, gNote, aHighNote, bHighNote, csHighNote, dHighNote, eHighNote};
        twinklePlayer = new MediaPlayer[]{aNote, eHighNote, fsHighNote, dNote, csNote, bNote};
        normalMediaPlayer = new MediaPlayer[]{aNote, bbNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, aHighNote};
    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this,R.raw.scalea);
        bbNote = MediaPlayer.create(this,R.raw.scalebb);
        bNote = MediaPlayer.create(this,R.raw.scaleb);
        cNote = MediaPlayer.create(this,R.raw.scalec);
        csNote = MediaPlayer.create(this,R.raw.scalecs);
        dNote = MediaPlayer.create(this,R.raw.scaled);
        dsNote = MediaPlayer.create(this,R.raw.scaleds);
        eNote = MediaPlayer.create(this,R.raw.scalee);
        fNote = MediaPlayer.create(this,R.raw.scalef);
        fsNote = MediaPlayer.create(this,R.raw.scalefs);
        gNote = MediaPlayer.create(this,R.raw.scaleg);
        gsNote = MediaPlayer.create(this,R.raw.scalegs);
        aHighNote = MediaPlayer.create(this,R.raw.scalehigha);
        bHighNote = MediaPlayer.create(this,R.raw.scalehighb);
        csHighNote = MediaPlayer.create(this,R.raw.scalehighcs);
        dHighNote = MediaPlayer.create(this,R.raw.scalehighd);
        eHighNote = MediaPlayer.create(this,R.raw.scalehighe);
        fsHighNote = MediaPlayer.create(this, R.raw.scalehighfs);
    }

    private void setListeners() {
        buttonA.setOnClickListener(this);
        buttonBB.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCS.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonDS.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonFS.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonGS.setOnClickListener(this);
        buttonAH.setOnClickListener(this);
        playScales.setOnClickListener(this);
        twinkleTwinkle.setOnClickListener(this);
        playSong.setOnClickListener(this);
    }

    public void wireMeUp(){
        buttonA = (Button) findViewById(R.id.button_a);
        buttonBB = (Button) findViewById(R.id.button_bb);
        buttonB = (Button) findViewById(R.id.button_b);
        buttonC = (Button) findViewById(R.id.button_c);
        buttonCS = (Button) findViewById(R.id.button_cs);
        buttonD = (Button) findViewById(R.id.button_d);
        buttonDS = (Button) findViewById(R.id.button_ds);
        buttonE = (Button) findViewById(R.id.button_e);
        buttonF = (Button) findViewById(R.id.button_f);
        buttonFS = (Button) findViewById(R.id.button_fs);
        buttonG = (Button) findViewById(R.id.button_g);
        buttonGS = (Button) findViewById(R.id.button_gs);
        buttonAH = (Button) findViewById(R.id.button_ah);
        twinkleTwinkle = (Button) findViewById(R.id.twinkle_twinkle);
        whichNote = (Spinner) findViewById(R.id.which_note_is_played);
        howManyTimes = (NumberPicker) findViewById(R.id.number_of_times_note_is_played);
        playScales = (Button) findViewById(R.id.play_scale);
        playSong = (Button) findViewById(R.id.song);
        howManyTimes.setMinValue(1);
        howManyTimes.setMaxValue(10);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_a:
                getaNote().seekTo(0);
                getaNote().start();
                break;
            case R.id.button_bb:
                getbbNote().seekTo(0);
                getbbNote().start();
                break;
            case R.id.button_b:
                getbNote().seekTo(0);
                getbNote().start();
                break;
            case R.id.button_c:
                getcNote().seekTo(0);
                getcNote().start();
                break;
            case R.id.button_cs:
                getcsNote().seekTo(0);
                getcsNote().start();
                break;
            case R.id.button_d:
                getdNote().seekTo(0);
                getdNote().start();
                break;
            case R.id.button_ds:
                getdsNote().seekTo(0);
                getdsNote().start();
                break;
            case R.id.button_e:
                geteNote().seekTo(0);
                geteNote().start();
                break;
            case R.id.button_f:
                getfNote().seekTo(0);
                getfNote().start();
                break;
            case R.id.button_fs:
                getfsNote().seekTo(0);
                getfsNote().start();
                break;
            case R.id.button_g:
                getgNote().seekTo(0);
                getgNote().start();
                break;
            case R.id.button_gs:
                getgsNote().seekTo(0);
                getgsNote().start();
                break;
            case R.id.button_ah:
                getaHighNote().seekTo(0);
                getaHighNote().start();
                break;
            case R.id.play_scale:
                for(MediaPlayer m: mediaPlayers){
                    m.seekTo(0);
                    m.start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.twinkle_twinkle:
                try {
                    playTwinkleTwinkle();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.song:
                try {
                    playSongForMe();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
        }
    }

    private void playSongForMe() throws InterruptedException { //plays frere jacques
        int t = 350;
        for(int i=0; i<2;i++) {
            cNote.seekTo(0);
            cNote.start();
            Thread.sleep(t);

            dNote.seekTo(0);
            dNote.start();
            Thread.sleep(t);
            eNote.seekTo(0);
            eNote.start();
            Thread.sleep(t);
            cNote.seekTo(0);
            cNote.start();
            Thread.sleep(t);
        }
        //second line
        for(int i=0;i<2; i++) {
            eNote.seekTo(0);
            eNote.start();
            Thread.sleep(t);
            fNote.seekTo(0);
            fNote.start();
            Thread.sleep(t);
            gNote.seekTo(0);
            gNote.start();
            Thread.sleep(t);
        }
        //thrid line
        for(int i = 0; i<2;i++) {
            gNote.seekTo(0);
            gNote.start();
            Thread.sleep(t);
            aNote.seekTo(0);
            aNote.start();
            Thread.sleep(t);
            gNote.seekTo(0);
            gNote.start();
            Thread.sleep(t);
            fNote.seekTo(0);
            fNote.start();
            Thread.sleep(t);
            eNote.seekTo(0);
            eNote.start();
            Thread.sleep(t);
            cNote.seekTo(0);
            cNote.start();
            Thread.sleep(t);
        }
        //fourth line
        for(int i = 0; i<2; i++){
            cNote.seekTo(0);
            cNote.start();
            Thread.sleep(t);
            gNote.seekTo(0);
            gNote.start();
            Thread.sleep(t);
            cNote.seekTo(0);
            cNote.start();
            Thread.sleep(t);
        }





    }

    public void playMeALot(View view) throws InterruptedException {
        String choice = whichNote.getSelectedItem().toString();
        int times = howManyTimes.getValue();
        int i =0;
        int note = 0;
        switch(choice) {
            case "A":
                note = 0;
                break;
            case "BB":
                note = 1;
                break;
            case "B":
                note = 2;
                break;
            case "C":
                note = 3;
                break;
            case "CS":
                note = 4;
                break;
            case "D":
                note = 5;
                break;
            case "DS":
                note = 6;
                break;
            case "E":
                note = 7;
                break;
            case "F":
                note = 8;
                break;
            case "FS":
                note = 9;
                break;
            case "G":
                note = 10;
                break;
            case "GS":
                note = 11;
            case "AH":
                note = 12;
                break;
        }
        while (i < times) {
            normalMediaPlayer[note].seekTo(0);
            normalMediaPlayer[note].start();
            Thread.sleep(1000);
            i++;
        }
    }

    public void playTwinkleTwinkle() throws InterruptedException {
        int x = 400;
        twinklePlayer[0].seekTo(0); //a
        twinklePlayer[0].start();
        Thread.sleep(300);
        twinklePlayer[0].seekTo(0); //a
        twinklePlayer[0].start();
        Thread.sleep(500);
        twinklePlayer[1].seekTo(0); //ehigh
        twinklePlayer[1].start();
        Thread.sleep(350);
        twinklePlayer[1].seekTo(0); //ehigh
        twinklePlayer[1].start();
        Thread.sleep(x);
        twinklePlayer[2].seekTo(0); //fshigh
        twinklePlayer[2].start();
        Thread.sleep(x);
        twinklePlayer[2].seekTo(0); //fshigh
        twinklePlayer[2].start();
        Thread.sleep(450);
        twinklePlayer[1].seekTo(0); //ehigh
        twinklePlayer[1].start();
        Thread.sleep(450);
        twinklePlayer[3].seekTo(0); //d
        twinklePlayer[3].start();
        Thread.sleep(x);
        twinklePlayer[3].seekTo(0); //d
        twinklePlayer[3].start();
        Thread.sleep(x);
        twinklePlayer[4].seekTo(0); //cs
        twinklePlayer[4].start();
        Thread.sleep(x);
        twinklePlayer[4].seekTo(0); //cs
        twinklePlayer[4].start();
        Thread.sleep(x);
        twinklePlayer[5].seekTo(0); //b
        twinklePlayer[5].start();
        Thread.sleep(x);
        twinklePlayer[5].seekTo(0); //b
        twinklePlayer[5].start();
        Thread.sleep(x);
        twinklePlayer[0].seekTo(0); //a
        twinklePlayer[0].start();
        Thread.sleep(x);
    }

    public MediaPlayer getaNote() {
        return aNote;
    }

    public MediaPlayer getbbNote() {
        return bbNote;
    }

    public MediaPlayer getbNote() {
        return bNote;
    }

    public MediaPlayer getcNote() {
        return cNote;
    }

    public MediaPlayer getcsNote() {
        return csNote;
    }

    public MediaPlayer getdNote() {
        return dNote;
    }

    public MediaPlayer getdsNote() {
        return dsNote;
    }

    public MediaPlayer geteNote() {
        return eNote;
    }

    public MediaPlayer getfNote() {
        return fNote;
    }

    public MediaPlayer getfsNote() {
        return fsNote;
    }

    public MediaPlayer getgNote() {
        return gNote;
    }

    public MediaPlayer getgsNote() {
        return gsNote;
    }

    public MediaPlayer getaHighNote() {
        return aHighNote;
    }

}
