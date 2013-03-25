package br.com.ufpb.appmote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cenario3 extends Activity {
	
	Button buttonToFoto;
	Button btEnviarFoto;
	Button buttonToVoltar3;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cenario3);
               
        buttonToFoto    = (Button) findViewById(R.id.buttonToFoto);
        btEnviarFoto    = (Button) findViewById(R.id.btEnviarFoto);
        buttonToVoltar3 = (Button) findViewById(R.id.buttonToVoltar3);        
        
        buttonToFoto.setOnClickListener(new OnClickListener() {
			
        	//Código p/ abrir a câmera do dispositivo (NÃO ESTÁ FUNCIONANDO)
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivity(intent);
			}
		});
        

        btEnviarFoto.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
        
    }
}
