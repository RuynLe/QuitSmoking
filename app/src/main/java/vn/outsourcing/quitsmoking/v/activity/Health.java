package vn.outsourcing.quitsmoking.v.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import vn.outsourcing.quitsmoking.R;
import vn.outsourcing.quitsmoking.m.DonutProgress;

public class Health extends AppCompatActivity {

    DonutProgress prgDiaglog;
    TextView textDiaglog;

    DonutProgress prgHeath;
    TextView textHeath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

    }

    public void layout1(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt1);
        textHeath = (TextView) findViewById(R.id.textHealt1);
        dialog(v);
    }
    public void layout2(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt2);
        textHeath = (TextView) findViewById(R.id.textHealt2);
        dialog(v);
    }
    public void layout3(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt3);
        textHeath = (TextView) findViewById(R.id.textHealt3);
        dialog(v);
    }
    public void layout4(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt4);
        textHeath = (TextView) findViewById(R.id.textHealt4);
        dialog(v);
    }
    public void layout5(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt5);
        textHeath = (TextView) findViewById(R.id.textHealt5);
        dialog(v);
    }
    public void layout6(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt6);
        textHeath = (TextView) findViewById(R.id.textHealt6);
        dialog(v);
    }
    public void layout7(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt7);
        textHeath = (TextView) findViewById(R.id.textHealt7);
        dialog(v);
    }
    public void layout8(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt8);
        textHeath = (TextView) findViewById(R.id.textHealt8);
        dialog(v);
    }
    public void layout9(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt9);
        textHeath = (TextView) findViewById(R.id.textHealt9);
        dialog(v);
    }
    public void layout10(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt10);
        textHeath = (TextView) findViewById(R.id.textHealt10);
        dialog(v);
    }
    public void layout11(View v) {
        prgHeath = (DonutProgress) findViewById(R.id.prgTextHealt11);
        textHeath = (TextView) findViewById(R.id.textHealt11);
        dialog(v);
    }

    public void dialog(View v) {

        LayoutInflater linf = LayoutInflater.from(this);
        final View inflator = linf.inflate(R.layout.activity_dialog_heath, null);


        AlertDialog.Builder dialog = new AlertDialog.Builder(this, R.style.MyDialogTheme);
        dialog.setView(inflator);

        prgDiaglog = (DonutProgress) inflator.findViewById(R.id.prgDiaglog);
        textDiaglog = (TextView) inflator.findViewById(R.id.textDiaglog);

        //dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.parseColor("#00FFFFFF")));

        prgDiaglog.setProgress(prgHeath.getProgress());
        prgDiaglog.setText(prgHeath.getText());
        textDiaglog.setText(textHeath.getText());
        dialog.show();
    }
}
