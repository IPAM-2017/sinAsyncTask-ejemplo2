package github.root.black.sv.edu.ues.sinasynctask;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button)findViewById(R.id.boton);

        boton.setOnClickListener(this);
    }
    public void unSegundo(){
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:
                for(int i=1; i<=10; i++){
                    unSegundo();
                }
                break;
            default:
                break;
        }
    }
}
