package jti.adika;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView)findViewById(R.id.show_count);
        mButtonZero = (Button)findViewById(R.id.button_zero);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }
    public void countUp(View view) {
        ++mCount;
        if(mShowCount!=null){
            mButtonZero.setBackgroundColor(getResources().getColor(R.color.purple_500));
            if(mCount%2 == 0){
                view.setBackgroundColor(getResources().getColor(R.color.purple_200));
            }
            else{
                view.setBackgroundColor(getResources().getColor(R.color.purple_700));
            }
            mShowCount.setText(Integer.toString(mCount));

            setColor(view, Color.GREEN);
            setColor(findViewById(R.id.button_zero), Color.MAGENTA);
        }

    }
    public void zeroCount(View view)
    {
        mCount = 0;
        mShowCount.setText("0");

        setColor(view, Color.parseColor("#ffaaaaaa"));
        setColor(findViewById(R.id.button_count), Color.BLUE);
    }
    private void setColor(View view, int color)
    {
        view.setBackgroundColor(color);
    }
}