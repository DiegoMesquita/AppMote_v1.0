package br.com.ufpb.appmote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Cenario2 extends Activity{

	EditText url;
	Button buttonEnviarURL;
	Button buttonToVoltar2;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cenario2);
        
        url = (EditText) findViewById(R.id.editText1);
        buttonEnviarURL = (Button) findViewById(R.id.buttonEnviarURL);
        buttonToVoltar2 = (Button) findViewById(R.id.buttonToVoltar2);
        
                
        buttonEnviarURL.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(url.getText().toString().length()<=0){
					url.setError("Preencha campo URL");
					url.requestFocus();
				}
				
				// TODO Auto-generated method stub
				
			}
		});
        
        buttonToVoltar2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
	}
}
