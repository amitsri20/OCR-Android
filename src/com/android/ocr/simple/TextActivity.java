package com.android.ocr.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class TextActivity extends Activity {
	
String text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);
		String text=getIntent().getStringExtra("str");
		final EditText simpleEditText = (EditText) findViewById(R.id.editText1);
		simpleEditText.setText(text);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		ShareActionProvider myShareActionProvider;
		MenuItem item = menu.findItem(R.id.share);
		myShareActionProvider =(ShareActionProvider)item.getActionProvider();
		myShareActionProvider.setShareHistoryFileName(ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
		myShareActionProvider.setShareIntent(getShareIntent());
		return true;
	}
	private Intent getShareIntent() {
		Intent shareIntent = new Intent(Intent.ACTION_SEND);
		shareIntent.setType("text/plain");
		String text=getIntent().getStringExtra("str");
			shareIntent.putExtra(Intent.EXTRA_TEXT, text);
		return shareIntent;
		}
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		//According to selection, show the Toast message
		//of the selected button
		switch (item.getItemId()) {
		case R.id.about:
		Toast.makeText(this, "Optical Character Recognition v1.0 using Tesseract",
		Toast.LENGTH_LONG).show();
		return true;
		default:
		return super.onOptionsItemSelected(item);
		}
		}
}

