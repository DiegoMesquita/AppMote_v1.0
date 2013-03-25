package br.com.ufpb.appmote;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

	Button btCenario1;
	Button btCenario2;
	Button btCenario3;
	Button btCenario4;
	Button btSobre;
	Button btSair;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btCenario1 = (Button) findViewById(R.id.buttonToCenario1);
        btCenario2 = (Button) findViewById(R.id.buttonToCenario2);
        btCenario3 = (Button) findViewById(R.id.buttonToCenario3);
        btCenario4 = (Button) findViewById(R.id.buttonCenario4);
        btSobre    = (Button) findViewById(R.id.buttonToSobre);
        btSair     = (Button) findViewById(R.id.buttonToSair);
                
        
        btCenario1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaCenario1();
				
			}
		});
        
        btCenario2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaCenario2();
			}
		});
        
        btCenario3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaCenario3();
			}
		});
        
        btCenario4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaCenario4();
			}
		});
        
        btSobre.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaSobre();
			}
		});
        
        btSair.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
				System.exit(0);
			}
		});
       
    }
    
	public void chamaCenario1(){
		setContentView(R.layout.cenario1);
	}
	
	public void chamaCenario2(){
		setContentView(R.layout.cenario2);
	}
	
	public void chamaCenario3(){
		setContentView(R.layout.cenario3);
	}
	
	public void chamaCenario4(){
		setContentView(R.layout.cenario4);
	}
	
	public void chamaSobre(){
		setContentView(R.layout.sobre);
	}
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
