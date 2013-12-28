package br.livro.android.cap3;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Exemplo2 extends Activity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.layout_exemplo2); // layout Criado no android em res/layout/lauout_exemplo2
		
		
	//	TextView view = new TextView(this);         // Layout criado no diretamente no java
	//	view.setText("Exemplo de texto no Android");
	//	setContentView(view);
	}
}
