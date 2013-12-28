package br.livro.android.cap3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;

public class Exemplo3 extends Activity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		//abre a tela layout_exemplo3.xml
		
		setContentView(R.layout.layout_exemplo3); // layout Criado no android em res/layout/lauout_exemplo2
		
		// Busca a ImagemView pelo id
		
		ImageView img2 = (ImageView) findViewById(R.id.imageView2);
		img2.setImageResource(R.drawable.ic_android);
	
		// Layout criado no diretamente no java
		
	//	TextView view = new TextView(this);         
	//	view.setText("Exemplo de texto no Android");
	//	setContentView(view);
	}
}