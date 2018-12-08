package com.hf.mysquad;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.icu.util.Calendar;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class titleActivity extends AppCompatActivity {
    TextView textView;
    private  TextToSpeech tts;
    private int speechClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        SortTest.theObj.loadAllVariables();
        textView = findViewById(R.id.text);
        speechClicked = 0;
        //new AsyncTaskTest().execute(SortTest.theObj);

        Button button = findViewById(R.id.button);

         tts = new TextToSpeech(this,new TextToSpeech.OnInitListener() {
             @Override
             public void onInit(int status) {
                 if (status == TextToSpeech.SUCCESS) {
                     int result = tts.setLanguage(Locale.US);
                     if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                         Log.e("WHAT THE FUCK!!!!", "ITS TRIPPIN' FOO!");
                     } else {
                         convertTextToSpeech();
                     }
                 } else {
                     Log.e("error", "initialization Failed!");
                 }
             }
         });

    }

    public void onClickYo(View view) {
        convertTextToSpeech();
        /*
        Toast t = new Toast(this);
        ImageView myView = new ImageView(this);
        myView.setImageResource(R.drawable.not_prog_2);
        t.setView(myView);
        t.setGravity(Gravity.CENTER,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
        /*
        AlertDialog ad = new AlertDialog.Builder(this).create();
        ad.setMessage("Test");
        ad.setButton(AlertDialog.BUTTON_POSITIVE,"null",);
        */
        //new AsyncTaskTest().execute(true);

    }
    private void convertTextToSpeech() {
        String playText = null;
        //OVERRIDE AND IMPLEMENT EDIT TEXT WHER USER CAN INPUT OWN TEXT TO BE REGURGITATED

        String text0 = "beginning Paris' test run";
        String text1 = "PARIS IS A GENIUS!";
        String text2 = "Construction new test bounds";
        String text3 = "materializing network configurations";
        String text4 = "verifying human speech patterns";
        String text5 = "Initializing new data patterns";
        String text6 = "Testing is complete! I am Learning!";

        String finalText = "nigga's nigga's nigga's";

        if (speechClicked == 6) {
            playText = finalText;
        } else {

            switch (speechClicked) {
                case 0:
                    playText = text0;
                    break;
                case 1:
                    playText = text1;
                    break;
                case 2:
                    playText = text2;
                    break;
                case 3:
                    playText = text3;
                    break;
                case 4:
                    playText = text4;
                    break;
                case 5:
                    playText = text5;
                    break;
            }
        }
            tts.speak(playText, TextToSpeech.QUEUE_ADD, null);
            //tts.speak(text+"is saved", TextToSpeech.QUEUE_FLUSH, null);

        if (speechClicked != 6){
            speechClicked++;
        }

        }


    @Override
    protected void onPause() {
        super.onPause();

        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
    }
    private void allNumCode(){
         /*
        int gr = 2;
        int tc = 7;

        double gr2 = (double) gr;
        double tc2 = (double) tc;

        textView.setText(String.valueOf(tc2/2));


        float avg =(float)(10/2)*1.5f;
        float avg2 =(float)2/10;

        double avg3 = (double)10/2;
        double avg4 = (double)2/10;


        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df1 = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("00.0");
        DecimalFormat df3 = new DecimalFormat("00.0");

        double nums = (6/17) * 100;

        StringBuilder sb = new StringBuilder();
        sb.append(avg);
        sb.append("\n");
        sb.append(avg2+"%");
        sb.append("\n");
        sb.append(avg3);
        sb.append("\n");
        sb.append(avg4);
        sb.append("\n");

        sb.append(df1.format(avg));
        sb.append("\n");
        sb.append(df2.format(avg));
        sb.append("\n");
        sb.append(df3.format(avg));
        sb.append("\n");
        sb.append((a / 99)*100);
        sb.append("\n");
        sb.append((Math.round(a / 99))*100);
        sb.append("\n");
        sb.append((a / 99)*100);
        sb.append("\n");
        sb.append((Math.round(a / 99))*100);
        sb.append("\n");
        sb.append((Math.round(a / 99))*100);
*/


        //HashMap<String,String> testMap = new HashMap<>();
        //int a = 0;
        /*
        Random r = new Random();
            while(true){
              int x = r.nextInt(34);
              if (x == 22) {
                  textView.setText("FINALLY!");
                  break;
              }
        }
        */

/*
    public static void timer24(){
    });
    int SECONDS_IN_A_DAY = 24 * 60 * 60;
    Calendar thatDay = Calendar.getInstance();
        thatDay.setTime(new Date(0));
        thatDay.set(Calendar.HOUR_OF_DAY,18);
        thatDay.set(Calendar.MINUTE,00); // 0-11 so 1 less
        thatDay.set(Calendar.SECOND, 00);

    Calendar today = Calendar.getInstance();
    long diff =  thatDay.getTimeInMillis() - today.getTimeInMillis();
    long diffSec = diff / 1000;

    //long days = diffSec / SECONDS_IN_A_DAY;
    //ong secondsDay = diffSec % SECONDS_IN_A_DAY;
    //long seconds = secondsDay % 60;
    long minutes = (secondsDay / 60) % 60;
    long hours = (secondsDay / 3600); // % 24 not needed

        System.out.printf("%d days, %d hours, %d minutes and %d seconds\n", days, hours, minutes, seconds);
}

    }
/*
        int SECONDS_IN_A_DAY = 24 * 60 * 60;
        Calendar thatDay = Calendar.getInstance();
        thatDay.setTime(new Date(0)); //reset


            Calendar today = Calendar.getInstance();
            long diff =  thatDay.getTimeInMillis() - today.getTimeInMillis();
            //long diffSec = diff / 1000;
            //long days = diffSec / SECONDS_IN_A_DAY;
            //long secondsDay = diffSec % SECONDS_IN_A_DAY;
            //long seconds = secondsDay % 60;
            //long minutes = (secondsDay / 60) % 60;
            //long hours = (secondsDay / 3600); // % 24 not needed


public void stopTimer() {
            wasMyRunning = isMyRunning;
            isMyRunning = false;
        }

        public void timerGo(){
            if (wasMyRunning) {
                isMyRunning = true;
            }
        }
        startTimer(24000);
                final int SECONDS_IN_A_DAY = 24 * 60 * 60;



        //boolean isMyRunning;
        //boolean wasMyRunning;


                //int hours = seconds/3600;
                //int minutes = (seconds%3600)/60;

                int hours = seconds*3600;
                int minutes = (seconds%3600)/60;
                //int secs = seconds % 60;

                String time = String.format(Locale.getDefault(),
                        "%d:%02d",hours,minutes);
                timer.setText(time);

                if (isMyRunning) {
                    seconds++;
                }

                handler.postDelayed(this, 1000);

            }
            */
    }

    private class AsyncTaskTest extends AsyncTask<Boolean,Void,String>{
            String success;

            @Override
            protected String doInBackground(Boolean... sortTests) {
                try {

                    SQLiteOpenHelper dbHelper =
                            new DatabaseTestHelper(titleActivity.this);
                    SQLiteDatabase theDb = dbHelper.getWritableDatabase();
                    ContentValues testValues = new ContentValues();
                    Gson gson = new Gson();
                    testValues.put("_blob", gson.toJson(sortTests[0]).getBytes());

                    theDb.insert("SORT_TABLE",null,testValues);

                    /*
                    SQLiteOpenHelper dbHelper =
                            new DatabaseTestHelper(titleActivity.this);
                    SQLiteDatabase theDb = dbHelper.getWritableDatabase();
                    ContentValues testValues = new ContentValues();
                    testValues.put("myColumn","SUCCESS!!!");

                    theDb.insert("SORT_TABLE",null,testValues);

                    theDb.close();


                    SQLiteOpenHelper dbHelper =
                            new DatabaseTestHelper(titleActivity.this);

                    SQLiteDatabase theDb = dbHelper.getReadableDatabase();
                    Cursor cursor = theDb.query(
                            "SORT_TABLE",new String[]{"myColumn"},
                            null,null,null,
                            null,null);

                    if (cursor.moveToFirst()) {
                        /*
                        Toast.makeText(titleActivity.this,
                                ,
                                Toast.LENGTH_SHORT).show();

                         success = cursor.getString(0);
                         */

                    /*
                    Cursor cursor = theDb.query("SORT_TABLE",
                            new String[]{"_blob"},
                            null,null,null,
                            null,null);

                    if (cursor.moveToFirst()){
                        byte[] blob =
                                cursor.getBlob(
                                        cursor.getColumnIndex("_blob"));

                        String json = new String(blob);
                        Gson gson = new GsonBuilder().create();


                        return  gson.fromJson(json,SortTest.class);
                        */

                } catch(SQLiteException e){
                    e.printStackTrace();
                }
                return success;
            }

            @Override
            protected void onPostExecute(String dbString) {
                textView.setText(dbString);

                    /*
                    HashMap<Integer, String> map = newSort.getTestMap();
                    ArrayList<String> list = newSort.getTestArray();
                    String name = newSort.getName();
                    int num = newSort.getNumber();

                    StringBuilder sb = new StringBuilder();
                    sb.append(name);
                    sb.append("\n");
                    sb.append(num);
                    sb.append("\n");
                    sb.append(map.get(0));
                    sb.append("\n");
                    sb.append(list.get(9));
                    sb.append("\n");
                    sb.append(map.get(1));
                    sb.append("\n");
                    sb.append(list.get(8));
                    sb.append("\n");
*/
            }
        }
}
