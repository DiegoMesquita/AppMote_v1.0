package br.com.ufpb.appmote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cenario4 extends Activity{

	Button btUp;
	Button btDown;
	Button btRight;
	Button btLeft;
	Button btOk;
	Button buttonToVoltar4;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cenario4);
        
        btUp            = (Button) findViewById(R.id.btUp);
        btDown          = (Button) findViewById(R.id.btDown);
        btRight         = (Button) findViewById(R.id.btRiht);
        btLeft          = (Button) findViewById(R.id.btLeft);
        btOk            = (Button) findViewById(R.id.btOk);
        buttonToVoltar4 = (Button) findViewById(R.id.buttonToVoltar4);
        
        
        
        btUp.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        btDown.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        btRight.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        btLeft.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        btOk.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        buttonToVoltar4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
	}
}

