package br.edu.unis.appgasolinaxalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editGasolina;
    EditText editAlcool;
    Button btnCalcular;
    TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaComponentes();
        configuraBotao();
    }

    protected void carregaComponentes() {
        editGasolina = findViewById(R.id.editGasolina);
        editAlcool = findViewById(R.id.editAlcool);
        btnCalcular = findViewById(R.id.btnCalcular);
        textResultado = findViewById(R.id.textResultado);
    }

    protected void configuraBotao() {
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = realizaCalculo();
                mostraResultado(resultado);
                limpaCampos();
            }
        });
    }

    protected String realizaCalculo() {
        float gasolina = Float.parseFloat(editGasolina.getText().toString());
        float alcool = Float.parseFloat(editAlcool.getText().toString());
        double resultado = (gasolina*0.7);

        if (alcool <= resultado) {
            return "Alcool é a melhor opção!";
        } else {
            return "Gasolina é a melhor opção!";
        }
    }

    protected void mostraResultado(String resultado) {
        textResultado.setText(resultado);
    }

    protected void limpaCampos() {
        editGasolina.setText("");
        editGasolina.requestFocus();
        editAlcool.setText("");
        editAlcool.requestFocus();
    }
}