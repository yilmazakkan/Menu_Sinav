package com.yilmazakkan.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView txt,txt2;
 EditText mtn;

    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.add_menu,menu);


        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected (MenuItem item){

        switch (item.getItemId())
        {
            case R.id.sayfa_1:
           Intent intent =new Intent( getApplicationContext(),Main2Activity.class );
           startActivity( intent );
            return true;

            case R.id.sayfa_2:
                txt=findViewById( R.id.textView2 );
                txt.setText("Yılmaz Akkan");
            return true;
            case R.id.sayfa_3:

                txt2=findViewById( R.id.textView3 );
                mtn=findViewById( R.id.editText );
                txt2.setText( mtn.getText().toString() );
        }

        return super. onOptionsItemSelected( item );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}
