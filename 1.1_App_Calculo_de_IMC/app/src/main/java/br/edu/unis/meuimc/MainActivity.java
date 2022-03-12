package br.edu.unis.meuimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textTitulo;
    EditText editPeso;
    EditText editAltura;
    Button btnIMC;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaComponentes();
        configuraBotao();
    }

    protected void carregaComponentes() {
        textTitulo = findViewById(R.id.textTitulo);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        btnIMC = findViewById(R.id.btnIMC);
        textResultado = findViewById(R.id.textResultado);
    }

    protected void configuraBotao() {
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = realizaCalculo();
                mostraResultado(resultado);
                limpaCampos();
            }
        });
    }

    protected String realizaCalculo() {
        float peso = Integer.parseInt(editPeso.getText().toString());
        float altura = Integer.parseInt(editAltura.getText().toString());
        float alturaMetro = altura/100;
        float IMC = peso / (alturaMetro * alturaMetro);

        if (IMC < 16) {
            return "Magreza grave";
        } else if (IMC >= 16 && IMC < 17) {
            return "Magreza moderada";
        } else if (IMC >= 17 && IMC < 18.5) {
            return "Magreza leve";
        } else if (IMC >= 18.5 && IMC < 25) {
            return "Saudável";
        } else if (IMC >= 25 && IMC < 30) {
            return "Sobrepeso";
        } else if (IMC >= 30 && IMC < 35) {
            return "Obesidade Grau I";
        } else if (IMC >= 35 && IMC < 40) {
            return "Obesidade Grau II";
        } else if (IMC >= 40) {
            return "Obesidade Grau III (mórbida)";
        } else {
            return "Não foi possível calcular";
        }
    }

    protected void mostraResultado(String resultado) {
        textResultado.setText(resultado);
    }

    protected void limpaCampos() {
        editPeso.setText("");
        editPeso.requestFocus();
        editAltura.setText("");
        editAltura.requestFocus();
    }
}