package com.example.tipcalculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText etBillAmount;
	TextView tvTipAmt;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etBillAmount = (EditText) findViewById(R.id.etBillAmount);
		tvTipAmt = (TextView)  findViewById(R.id.tvTipAmt);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public String calcTipFromBill(String billAmtStr, double tipPercent) {
		double billAmt = Double.parseDouble(billAmtStr) ;
		double tipAmt = billAmt * tipPercent / 100;
		DecimalFormat curFormatter = new DecimalFormat("#.##");
	    String output = curFormatter.format(tipAmt);
		return output;
	}
	public void on10PercentBtnSubmit(View v) {
		String billAmt = etBillAmount.getText().toString();
		String tip = calcTipFromBill(billAmt, 10);
		tvTipAmt.setText(tip);
		
	}

	public void on15PercentBtnSubmit(View v) {
		String billAmt = etBillAmount.getText().toString();
		String tip = calcTipFromBill(billAmt, 15);
		tvTipAmt.setText(tip);
	}
	
	public void on20PercentBtnSubmit(View v) {
		String billAmt = etBillAmount.getText().toString();
		String tip = calcTipFromBill(billAmt, 20);
		tvTipAmt.setText(tip);
	}
}
