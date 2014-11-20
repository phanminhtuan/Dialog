package example.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button buttonClick;
	private Dialog cusDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonClick = (Button) findViewById(R.id.buttonClick);

		// add listener to button
		buttonClick.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				// Create custom dialog object
			cusDialog = new Dialog(MainActivity.this);
				// Include dialog.xml file
			cusDialog.setContentView(R.layout.dialog);
				// Set dialog title
			cusDialog.setTitle("Thêm từ");
			cusDialog.show();
				// set values for custom dialog components - text, image and
				// button
			final	EditText tu = (EditText) cusDialog.findViewById(R.id.edTu);
			final	EditText nghiatu = (EditText) cusDialog
						.findViewById(R.id.edNghiaTu);
//
				Button ButtonOK = (Button) cusDialog.findViewById(R.id.btnOk);
				Button ButtonCanCel = (Button) cusDialog.findViewById(R.id.btnHuy);
				
				// if decline button is clicked, close the custom dialog
				ButtonOK.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						Toast.makeText(getApplicationContext(),
								"tu"+tu.getText().toString()+"nghĩa"+nghiatu.getText().toString(), Toast.LENGTH_LONG).show();

					}
				});
				ButtonCanCel.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// Close dialog
						cusDialog.dismiss();
					}
				});

			}

		});
	}
}
