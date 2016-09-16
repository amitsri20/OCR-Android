package com.android.ocr.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OCRActivity extends Activity {


	protected Button _button;
	// protected ImageView _image;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {



		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		// _image = (ImageView) findViewById(R.id.image);
		
		//_button = (Button) findViewById(R.id.imageButton1);
		ImageButton imageButton2 = (ImageButton)this.findViewById(R.id.imageButton1);
		imageButton2.setImageResource(R.drawable.ocr_icon);
		
		imageButton2.setOnClickListener(new ButtonClickHandler());
		/*_button = (Button) findViewById(R.id.button);
		_button.setOnClickListener(new ButtonClickHandler());*/

		
	}

	public class ButtonClickHandler implements View.OnClickListener {
		public void onClick(View view) {
			Intent i = new Intent("com.android.ocr.simple.CameraActivity");
			
			startActivity(i);
			
		}
	}



	
	
}