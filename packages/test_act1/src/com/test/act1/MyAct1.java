package com.test.act1;




import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;



public class MyAct1 extends Activity implements OnClickListener{

	private static final String TAG = "MyAct1";
	NotificationManager manager;
	private Context mContext;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate() >>>>>");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_two_buttons1);
		
		init();
		initLayout();
		//TODO
		
		manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		Notification notification = new Notification.Builder(mContext)
		         .setContentTitle("zhoushaoqing")
		         .setContentText("content: zhoushaoqing")
		         .setSmallIcon(R.drawable.ic_launcher)
		         .build();
		
		manager.notify(100, notification);
	}

	private void init() {
		Log.d(TAG, "init() >>>>>");
		mContext = this;
		// TODO

	}

	// ************************************************************
	// Layout
	// ************************************************************
	// private TextView txt1;
	// private EditText edt1;
	// private Button btn1;
	// private ImageView img1;
	// private ImageButton imgBtn1;
	// private ListView listView1;
	// private LinearLayout ll1;
	// private RelativeLayout rl1
	// private FrameLayout fl1;

	private void initLayout() {
		Log.d(TAG, "initLayout() >>>>>");

		// txt1 = (TextView)findViewById(R.id.txt1);
		// edt1 = (EditText)findViewById(R.id.edt1);
		// btn1 = (Button)findViewById(R.id.btn1);
		// img1 = (ImageView)findViewById(R.id.img1);
		// imgBtn1 = (ImageButton)findViewById(R.id.imgBtn1);
		// listView1 = (ListView)findViewById(R.id.list1);
		// ll1 = (LinearLayout)findViewById(R.id.ll1);
		// rl1 = (RelativeLayout)findViewById(R.id.rl1);
		// fl1 = (FrameLayout)findViewById(R.id.fl1);
		// TODO
	}

	public void onBtn1(View view){
		Intent intent = new Intent(this, MyAct2.class);
		intent.addCategory(Intent.CATEGORY_LAUNCHER);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
		startActivity(intent);
	}
	
	public void onBtn2(View view){
		
	}
	
	@Override
	protected void onResume() {
		Log.d(TAG, "onResume() >>>>>");
		super.onResume();
		// TODO
	}

	@Override
	protected void onPause() {
		Log.d(TAG, "onPause() >>>>>");
		super.onPause();
		// TODO
	}

	@Override
	protected void onDestroy() {
		Log.d(TAG, "onDestroy() >>>>>");
		super.onDestroy();
		// TODO
		manager.cancel(100);
	}

	@Override
	public void onBackPressed() {
		Log.d(TAG, "onBackPressed() >>>>>");
		super.onBackPressed();
		// TODO
	}

	@Override
	protected void onNewIntent(Intent intent) {
		Log.d(TAG, "onNewIntent() >>>>>");
		super.onNewIntent(intent);
	}
	
	// ************************************************************
	// Methods
	// ************************************************************

	
	


	// ************************************************************
	// OnClickListener
	// ************************************************************
	@Override
	public void onClick(View v) {
		// TODO
		/*
		switch (v.getId()) {
		case R.id.btn1:
			break;
			
		case R.id.btn2:
			break;
			
		case R.id.btn3:
			break;
		}
	*/
	}
}