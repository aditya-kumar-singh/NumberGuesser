package list_multiplication.kumar.yo.aditya.numberguesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b;
int n1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   Toolbar tb=(Toolbar)findViewById(R.id.toolb);
   //    getSupportActionBar().setTitle("Number Guesser");
        Random ra=new Random();
        n1=ra.nextInt(20)+1;

    }
    public void guess(View v){
        e=(EditText)findViewById(R.id.edt);
        int num=Integer.parseInt(e.getText().toString());
        if(num>n1){
            Toast.makeText(getApplicationContext(),"Nah Not this,Your Number is high",Toast.LENGTH_SHORT).show();
            //makeToast("Nah Not this,Your Number is high");
        }
        else if(num<n1){
            Toast.makeText(getApplicationContext(),"Nooo!!  Your Number is Lower ",Toast.LENGTH_SHORT).show();
           // makeToast("Nooo!!  Your Number is Lower");
        }
        else{
            Toast.makeText(getApplicationContext(),"Congrats!! You made it,This is the Number",Toast.LENGTH_SHORT).show();
            //makeToast("Congrats!! You made it,This is the Number");

            Random ra=new Random();
            n1=ra.nextInt(20)+1;
        }





    }
    /*
    public void makeToast(String string){
        Toast.makeText(getApplicationContext(), string,Toast.LENGTH_SHORT).show();



    }
    */
}
