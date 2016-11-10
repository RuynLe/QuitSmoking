package vn.outsourcing.quitsmoking.v.activity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import vn.outsourcing.quitsmoking.R;

public class PersionalInformation extends AppCompatActivity {

    TextView mDisplayDate;
    TextView mDisplayTime;
    TextView txtMale;
    TextView txtFemale;
    String x,y;
    boolean gender = true;
    Calendar mDateAndTime = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persional_information);

        mDisplayDate = (TextView)findViewById(R.id.txtNgay);
        mDisplayTime = (TextView)findViewById(R.id.txtGio);
        txtMale = (TextView)findViewById(R.id.txtMale);
        txtFemale = (TextView)findViewById(R.id.txtFemale);
        updateDateAndTimeDisplay();


    }

    public void onDateClicked(View v) {

        DatePickerDialog.OnDateSetListener mDateListener = new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                mDateAndTime.set(Calendar.YEAR, year);
                mDateAndTime.set(Calendar.MONTH, monthOfYear);
                mDateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateDateAndTimeDisplay();
            }
        };

        new DatePickerDialog(PersionalInformation.this, mDateListener,
                mDateAndTime.get(Calendar.YEAR),
                mDateAndTime.get(Calendar.MONTH),
                mDateAndTime.get(Calendar.DAY_OF_MONTH)).show();

    }

    public void onTimeClicked(View v) {

        TimePickerDialog.OnTimeSetListener mTimeListener = new TimePickerDialog.OnTimeSetListener() {
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                mDateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
                mDateAndTime.set(Calendar.MINUTE, minute);
                updateDateAndTimeDisplay();
            }
        };

        new TimePickerDialog(PersionalInformation.this, mTimeListener,
                mDateAndTime.get(Calendar.HOUR_OF_DAY),
                mDateAndTime.get(Calendar.MINUTE), true).show();

    }

    private void updateDateAndTimeDisplay() {
        //ngay
        //month
        if(mDateAndTime.get(Calendar.MONTH) < 10){
            x = "0" + (mDateAndTime.get(Calendar.MONTH) + 1);
        }else{
            x = "" + (mDateAndTime.get(Calendar.MONTH)  + 1);
        }
        //date
        if(mDateAndTime.get(Calendar.DAY_OF_MONTH) < 10){
            y = "0" + mDateAndTime.get(Calendar.DAY_OF_MONTH);
        }else{
            y = "" + mDateAndTime.get(Calendar.DAY_OF_MONTH);
        }
        mDisplayDate.setText(y + "-" + x + "-" +  mDateAndTime.get(Calendar.YEAR) );

        //hour
        if(mDateAndTime.get(Calendar.HOUR_OF_DAY) < 10){
            x = "0" + mDateAndTime.get(Calendar.HOUR_OF_DAY);
        }else{
            x = "" + mDateAndTime.get(Calendar.HOUR_OF_DAY);
        }
        //min
        if(mDateAndTime.get(Calendar.MINUTE) < 10){
            y = "0" + mDateAndTime.get(Calendar.MINUTE);
        }else{
            y = "" + mDateAndTime.get(Calendar.MINUTE);
        }

        mDisplayTime.setText(x +":"+ y);
    }

    public void onMaleClicked(View v) {


        gender = true;

    }
    public void onFeMaleClicked(View v) {


        gender = false;

    }
}
