
import com.example.auto_login.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class Correo extends ActionBarActivity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);              
        
        Button btnEnviar = (Button) findViewById(R.id.enviarCorreo);
        
        btnEnviar.setOnClickListener(new OnClickListener() {                      
						@Override
						public void onClick(View v) {
							
					        EditText Email = (EditText) findViewById(R.id.email);
					        EditText Asunto = (EditText) findViewById(R.id.asunto);
					        EditText Mensaje = (EditText) findViewById(R.id.mensaje);					        
					        
					        
					       
                            Intent itSend = new Intent(android.content.Intent.ACTION_SEND);
                            
                            
                            itSend.setType("plain/text");
                            
                           
                            itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ Email.getText().toString()});                            
                            itSend.putExtra(android.content.Intent.EXTRA_SUBJECT, Asunto.getText().toString());
                            itSend.putExtra(android.content.Intent.EXTRA_TEXT, Mensaje.getText());
                            
                            
                            startActivity(itSend);

						}
                });
    }

}
