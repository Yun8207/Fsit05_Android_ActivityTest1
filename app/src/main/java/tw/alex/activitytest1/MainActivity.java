package tw.alex.activitytest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public MainActivity(){
        Log.d("alex", "MainActivity");
    }

    public void test1(View view){
        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("alex","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("alex","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("alex","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("alex","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("alex","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("alex","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("alex","onRestart");

    }
}
