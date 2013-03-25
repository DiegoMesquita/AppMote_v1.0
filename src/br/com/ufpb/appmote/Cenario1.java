package br.com.ufpb.appmote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cenario1 extends Activity{

	Button buttonOption1;
	Button buttonOption2;
	Button buttonOption3;
	Button buttonOption4;
	Button btVoltar1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cenario1);
        
        buttonOption1 = (Button) findViewById(R.id.buttonOption1);
        buttonOption2 = (Button) findViewById(R.id.buttonOption2);
        buttonOption3 = (Button) findViewById(R.id.buttonOption3);
        buttonOption4 = (Button) findViewById(R.id.buttonOption4);
        btVoltar1 = (Button) findViewById(R.id.buttonToVoltar1);
        
       
        buttonOption1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        buttonOption2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        buttonOption3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        buttonOption4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
        
        //NÃO FUNCIONA
        btVoltar1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaMain();
			}
		});
    }
	
	public void chamaMain(){
		setContentView(R.layout.main);
	}
}
