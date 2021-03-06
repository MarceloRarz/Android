package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Exemplo5 extends Activity {
	private static final String CATEGORIA = "livro";
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.layout_exemplo4_listener);
		
		// Verbose
		Log.v(CATEGORIA, "log de verbose");
		// Debug
		Log.d(CATEGORIA, "log de debug");
		// Info
		Log.i(CATEGORIA, "log de info");
		// Warn
		Log.w(CATEGORIA, "log de alerta");
		// Error
		Log.e(CATEGORIA, "log de erro", new RuntimeException("Teste de Erro"));
	}

}
